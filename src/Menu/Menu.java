package Menu;

import Form.Form_AdministrarReservas;
import Form.Form_Cliente;
import Form.Form_Empleados;
import Form.Form_InfoHabitacion;
import Form.Form_Habitaciones;
import Form.Form_NuevaReserva;
import Form.Form_NuevoAlquiler;
import Form.Form_Organizacion;
import Form.Form_Reportes;
import Form.Form_TipoDocumento;
import Form.Form_TipoPago2;
import Form.Form_TipoPago2;
import Form.Form_Usuarios;
import Swing.ButtonCustom;
import Swing.MenuItem;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Menu extends javax.swing.JPanel {

    private MigLayout layout;
    private JPanel panelMenu;

    private JButton cmdMenu;
    private JButton cmdLogOut;
    private Header header;

    private Bottom bottom;
    private EventMenuSelected event;
    private JPanel main;
    private JPanel body;
    private Animator animator;
    private boolean menuShow;
    private Menu menu;
    private Menu comp = this;
    private int index = 0;

    //Formularios
    public Form_Cliente cliente;
    public Form_Empleados empleado;
    public Form_TipoDocumento tipo;
    public Form_Habitaciones habitacion;
    public Form_Organizacion organizacion;
    public Form_Usuarios usuario;
    public Form_NuevaReserva reserva;
    public Form_InfoHabitacion gesHab;
    public Form_TipoPago2 tipoPago;
    public Form_NuevoAlquiler alquiler;
    public Form_AdministrarReservas adminReservas;
    public Form_Reportes reportes;

    public Menu(JPanel main, JPanel body, Menu menu) {
        initComponents();
        this.main = main;
        this.body = body;
        this.menu = menu;
        cliente = new Form_Cliente();
        cliente.setMenu(this);
        empleado = new Form_Empleados();
        tipo = new Form_TipoDocumento();
        habitacion = new Form_Habitaciones(this);
        organizacion = new Form_Organizacion();
        usuario = new Form_Usuarios();
        reserva = new Form_NuevaReserva();
        reserva.setMenu(this);

        alquiler = new Form_NuevoAlquiler();
        alquiler.setMenu(this);

        gesHab = new Form_InfoHabitacion();
        tipoPago = new Form_TipoPago2();
        
        adminReservas = new Form_AdministrarReservas();
        
        reportes = new Form_Reportes();

        setOpaque(false);
        init();

    }

    public void setEvent(EventMenuSelected event) {
        this.event = event;
    }

    public void inicio() {

        layout = new MigLayout("fill", "0[]0[]5", "0[fill]0");
        body.setLayout(layout);
        main.setOpaque(false);
        main.setLayout(new BorderLayout());
        main.setBackground(new Color(60, 60, 60));

        bottom.Evento(new MouseListener() {

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Evento");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                bottom.setBackground(new Color(248, 248, 248));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                bottom.setBackground(new Color(238, 238, 238));
            }

        });

        addEventLogout(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //System.out.println("Logout");
                System.exit(0);
            }
        });

        addEventMenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!animator.isRunning()) {
                    animator.start();
                    //System.out.println("Acción");
                }
            }
        });

        // agregar evento al menu
        setEvent(new EventMenuSelected() {
            @Override

            public void selected(int index) {
                if (index == 0) {
                    showForm(habitacion);
                } else if (index == 1) {
                    showForm(gesHab);
                } else if (index == 2) {
                    showForm(reserva);
                } else if (index == 3) {
                    showForm(cliente);
                } else if (index == 4) {
                    showForm(tipo);
                } else if (index == 5) {
                    showForm(organizacion);
                } else if (index == 6) {
                    showForm(empleado);
                } else if (index == 7) {
                    showForm(usuario);
                } else if (index == 8) {
                    showForm(tipoPago);
                } else if (index == 9) {
                    showForm(reportes);
                } else if (index == 10) {
                    showForm(alquiler);
                } else if (index == 11){
                    showForm(adminReservas);
                }
            }
        });

        //addMenu(new ModelMenu("Inicio", new ImageIcon(getClass().getResource("/Image/home.png"))));
        addMenu(new ModelMenu("Habitaciones", new ImageIcon(getClass().getResource("/Image/habitacion.png"))));
        addMenu(new ModelMenu("Gestión Habitación", new ImageIcon(getClass().getResource("/Image/gestionHab.png"))));
        addMenu(new ModelMenu("Reservas", new ImageIcon(getClass().getResource("/Image/reserva.png"))));
        addMenu(new ModelMenu("Clientes", new ImageIcon(getClass().getResource("/Image/cliente.png"))));
        addMenu(new ModelMenu("Documento", new ImageIcon(getClass().getResource("/Image/tipoDocumento.png"))));
        addMenu(new ModelMenu("Organización", new ImageIcon(getClass().getResource("/Image/organizacion.png"))));
        addMenu(new ModelMenu("Empleados", new ImageIcon(getClass().getResource("/Image/empleado.png"))));
        addMenu(new ModelMenu("Usuarios", new ImageIcon(getClass().getResource("/Image/usuarios.png"))));
        addMenu(new ModelMenu("Pagos", new ImageIcon(getClass().getResource("/Image/pagos.png"))));
        addMenu(new ModelMenu("Reportes", new ImageIcon(getClass().getResource("/Image/reportes.png"))));
        addMenu(new ModelMenu("Alquiler", new ImageIcon(getClass().getResource("/Image/alquiler.png"))));
        addMenu(new ModelMenu("Administrar Reservas", new ImageIcon(getClass().getResource("/Image/adminReservas.png"))));
        body.add(comp, "w 50!");
        body.add(main, "w 100%");

        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menuShow) {
                    width = 50 + (200 * (1f - fraction));
                    setAlpha(1f - fraction);
                } else {
                    width = 50 + (200 * fraction);
                    setAlpha(fraction);
                }

                layout.setComponentConstraints(comp, "w " + width + "!");
                body.revalidate();
            }

            @Override
            public void end() {
                menuShow = !menuShow;
            }
        };
        animator = new Animator(400, target);
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        //showForm(new Form8());
    }

    private void showForm(Component com) {
        main.removeAll();
        main.add(com);
        main.repaint();
        main.revalidate();
    }

    private void init() {
        setLayout(new MigLayout("wrap, fillx, insets 0", "[fill]", "0[]20[]push[60]0"));
        panelMenu = new JPanel();
        header = new Header();
        bottom = new Bottom();
        createButtonMenu();
        createButtonLogout();
        panelMenu.setOpaque(false);

        // layout del menu            correr a la derecha  separacion entre opciones
        layout = new MigLayout("fillx, wrap", "0[fill]0", "0[]10[]0");
        panelMenu.setLayout(layout);
        add(cmdMenu, "pos 1al 0al 100% 50");
        add(cmdLogOut, "pos 1al 1al 100% 100, height 60!");
        add(header);
        add(panelMenu);
        add(bottom);
    }

    public void addMenu(ModelMenu menu) {
        MenuItem item = new MenuItem(menu.getIcon(), menu.getMenuName(), panelMenu.getComponentCount());
        item.addEvent(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                clearMenu(index);
            }
        });
        item.addEvent(event);
        panelMenu.add(item);
    }

    public void SelectMenu(int id, Component comp) {
        for (Component com : panelMenu.getComponents()) {
            MenuItem item = (MenuItem) com;
            if (item.getIndex() == id) {
                item.setSelected(true);
                showForm(comp);
                clearMenu(id);
            }
        }
    }

    private void createButtonMenu() {
        cmdMenu = new JButton();
        cmdMenu.setContentAreaFilled(false);
        cmdMenu.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmdMenu.setIcon(new ImageIcon(getClass().getResource("/Image/menu2.png")));
        cmdMenu.setBorder(new EmptyBorder(5, 12, 5, 12));
    }

    private void createButtonLogout() {
        cmdLogOut = new ButtonCustom();
        cmdLogOut.setIcon(new ImageIcon(getClass().getResource("/Image/salir.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;

        GradientPaint gra = new GradientPaint(0, 0, Color.decode("#E4E4E4"), 0, getHeight(), Color.decode("#E4E4E4"));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    private void clearMenu(int exceptIndex) {
        for (Component com : panelMenu.getComponents()) {
            MenuItem item = (MenuItem) com;
            if (item.getIndex() != exceptIndex) {
                item.setSelected(false);
            }
        }
    }

    public void addEventMenu(ActionListener event) {
        cmdMenu.addActionListener(event);
    }

    public void addEventLogout(ActionListener event) {
        cmdLogOut.addActionListener(event);
    }

    public void setAlpha(float alpha) {
        header.setAlpha(alpha);
        bottom.setAlpha(alpha);
    }

    public int getIndex() {
        return index;
    }

}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
