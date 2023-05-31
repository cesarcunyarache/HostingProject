package DataAccessObject;

import DataSource.Conexion;
import TransferObject.ClienteOrganizacionDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;

public class ClienteOrganizacionDAO implements Crud<ClienteOrganizacionDTO> {

    Conexion conexion;
    ClienteOrganizacionDTO clienteOrganizacion;

    public ClienteOrganizacionDAO() {
        conexion = new Conexion();
    }

    @Override
    public boolean Create(ClienteOrganizacionDTO clienteOrganizacion) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO ClienteOrganizacion(idCliente, idOrganizacion) VALUES(?,?)");
            ps.setInt(1, clienteOrganizacion.getIdCliente());
            ps.setInt(2, clienteOrganizacion.getIdOrganizacion());
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al asociar cliente y organización");
            }

        } catch (Exception e) {
            System.out.print(e);
        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return false;
    }

    @Override
    public ArrayList<ClienteOrganizacionDTO> Read() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion.getConnection();

        ArrayList<ClienteOrganizacionDTO> clienteOrganizaciones = new ArrayList<>();

        try {
            ps = con.prepareStatement("SELECT * FROM ClienteOrganizacion");
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                int idCliente = rs.getInt("idCliente");
                int idOrganizacion = rs.getInt("idOrganizacion");
                clienteOrganizacion = new ClienteOrganizacionDTO(id, idCliente, idOrganizacion);
                clienteOrganizaciones.add(clienteOrganizacion);
            }

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            try {
                con.close();
                ps.close();
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        return clienteOrganizaciones;
    }

    @Override
    public boolean Update(ClienteOrganizacionDTO clienteOrganizacion) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        boolean isUpdate = false;

        try {
            ps = con.prepareStatement("UPDATE ClienteOrganizacion SET idCliente=?, idOrganizacion=? WHERE id=" + clienteOrganizacion.getId());
            ps.setInt(1, clienteOrganizacion.getIdCliente());
            ps.setInt(2, clienteOrganizacion.getIdOrganizacion());

            int res = ps.executeUpdate();
            if (res > 0) {
                isUpdate = true;
            }

        } catch (SQLException e) {
            System.err.println(e);
            isUpdate = false;

        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return isUpdate;
    }

    @Override
    public boolean Delete(ClienteOrganizacionDTO clienteOrganizacion) {
        PreparedStatement ps = null;
        Connection con = conexion.getConnection();
        boolean isDelete = false;
        try {
            ps = con.prepareStatement("DELETE FROM ClienteOrganizacion WHERE id=?");
            ps.setInt(1, clienteOrganizacion.getId());
            int res = ps.executeUpdate();

            if (res > 0) {
                isDelete = true;
            }

        } catch (SQLException e) {
            System.err.println(e);
            isDelete = false;

        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return isDelete;
    }

    @Override
    public ClienteOrganizacionDTO Search(ClienteOrganizacionDTO clienteOrganizacion) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement("SELECT * FROM ClienteOrganizacion WHERE id=?");
            ps.setInt(1, clienteOrganizacion.getId());
            rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                int idCliente = rs.getInt("idCliente");
                int idOrganizacion = rs.getInt("idOrganizacion");
                clienteOrganizacion = new ClienteOrganizacionDTO(id, idCliente, idOrganizacion);
            }

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            try {
                con.close();
                ps.close();
                rs.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }

        return clienteOrganizacion;
    }
}
