package DataAccessObject;

import DataSource.Conexion;
import TransferObject.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class ClienteDAO implements Crud<ClienteDTO> {

    Conexion conexion;

    public ClienteDAO() {
        conexion = new Conexion();
    }

    @Override
    public boolean Create(ClienteDTO cliente) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement("INSERT INTO Cliente(numDoc, tipoDocumentoID, nombres, apellidos, telefono, nacionalidad, correo, direccion, genero) VALUES(?,?,?,?,?,?,?,?,?)");

            ps.setString(1, cliente.getNumDocumento());
            ps.setInt(2, cliente.getTipoDocumentoID());
            ps.setString(3, cliente.getNombres());
            ps.setString(4, cliente.getApellidos());
            ps.setString(5, cliente.getTelefono());
            ps.setString(6, cliente.getNacionalidad());
            ps.setString(7, cliente.getCorreo());
            ps.setString(8, cliente.getDireccion());
            ps.setString(9, String.valueOf(cliente.getGenero()));

            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar al cliente");
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
    public ArrayList<ClienteDTO> Read() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion.getConnection();
        ClienteDTO cliente;
        ArrayList<ClienteDTO> clientes = new ArrayList<>();

        try {
            ps = con.prepareStatement("SELECT * FROM Cliente");
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("idCliente");
                String dni = rs.getString("numDoc");
                int tipoDocumentoID = rs.getInt("tipoDocumentoID");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String telefono = rs.getString("telefono");
                String nacionalidad = rs.getString("nacionalidad");
                String correo = rs.getString("correo");
                String direccion = rs.getString("direccion");
                String genero = rs.getString("genero");
                cliente = new ClienteDTO(id, dni, tipoDocumentoID, nombres, apellidos, telefono, nacionalidad, correo, direccion, genero.charAt(0));
                clientes.add(cliente);
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
        return clientes;
    }

    @Override
    public boolean Update(ClienteDTO cliente) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        boolean isUpdate = false;

        try {
            ps = con.prepareStatement("UPDATE Cliente SET numDoc=?, tipoDocumentoID=?, nombres=?, apellidos=?, telefono=?, nacionalidad=?,  correo=?, direccion=?, genero=? WHERE idCliente=" + cliente.getIdCliente());

            ps.setString(1, cliente.getNumDocumento());
            ps.setInt(2, cliente.getTipoDocumentoID());
            ps.setString(3, cliente.getNombres());
            ps.setString(4, cliente.getApellidos());
            ps.setString(5, cliente.getTelefono());
            ps.setString(6, cliente.getNacionalidad());
            ps.setString(7, cliente.getCorreo());
            ps.setString(8, cliente.getDireccion());
            ps.setString(9, String.valueOf(cliente.getGenero()));

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
    public boolean Delete(ClienteDTO cliente) {
        PreparedStatement ps = null;
        Connection con = conexion.getConnection();
        boolean isDelete = false;
        try {
            ps = con.prepareStatement("DELETE FROM Cliente WHERE idCliente=?");
            ps.setInt(1, cliente.getIdCliente());
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
    public ClienteDTO Search(ClienteDTO clie) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        ClienteDTO cliente = null;

        try {

            ps = con.prepareStatement("SELECT * FROM Cliente WHERE idCliente=?");
            ps.setInt(1, clie.getIdCliente());

            rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("idCliente");
                String numDoc = rs.getString("numDoc");
                int tipoDocumentoID = rs.getInt("tipoDocumentoID");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String telefono = rs.getString("telefono");
                String nacionalidad = rs.getString("nacionalidad");
                String correo = rs.getString("correo");
                String direccion = rs.getString("direccion");
                String genero = rs.getString("genero");

                cliente = new ClienteDTO(id, numDoc, tipoDocumentoID, nombres, apellidos, telefono, nacionalidad, correo, direccion, genero.charAt(0));

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

        return cliente;
    }

    public ClienteDTO SearchDNI(ClienteDTO cli) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        ClienteDTO cliente = null;
        try {

            ps = con.prepareStatement("SELECT * FROM Cliente WHERE numDoc=?");
            ps.setString(1, cli.getNumDocumento());

            rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("idCliente");
                String numDoc = rs.getString("numDoc");
                int tipoDocumentoID = rs.getInt("tipoDocumentoID");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String telefono = rs.getString("telefono");
                String nacionalidad = rs.getString("nacionalidad");
                String correo = rs.getString("correo");
                String direccion = rs.getString("direccion");
                String genero = rs.getString("genero");

                cliente = new ClienteDTO(id, numDoc, tipoDocumentoID, nombres, apellidos, telefono, nacionalidad, correo, direccion, genero.charAt(0));

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

        return cliente;
    }

    // listar clientes por Organizacion
    public ArrayList<ClienteDTO> ListOrg(int idOrg) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion.getConnection();
        ClienteDTO cliente;
        ArrayList<ClienteDTO> clientes = new ArrayList<>();

        try {
            ps = con.prepareStatement("SELECT c.idCliente, numDoc, TipoDocumentoID, nombres, apellidos, telefono, nacionalidad, correo, direccion, genero  FROM Cliente c \n"
                    + "INNER JOIN ClienteOrganizacion co \n"
                    + "on c.idCliente = co.idCliente\n"
                    + "WHERE co.idOrganizacion = ?");
            ps.setInt(1, idOrg);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("idCliente");
                String dni = rs.getString("numDoc");
                int tipoDocumentoID = rs.getInt("tipoDocumentoID");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String telefono = rs.getString("telefono");
                String nacionalidad = rs.getString("nacionalidad");
                String correo = rs.getString("correo");
                String direccion = rs.getString("direccion");
                String genero = rs.getString("genero");
                cliente = new ClienteDTO(id, dni, tipoDocumentoID, nombres, apellidos, telefono, nacionalidad, correo, direccion, genero.charAt(0));
                clientes.add(cliente);
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
        return clientes;
    }

    //BUSQUEDAS
    //BUSQUEDA POR NOMBRE 
    public List<ClienteDTO> buscarNombres(ClienteDTO cli) {
        List<ClienteDTO> listaClientes = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = conexion.getConnection().prepareStatement("{CALL filtrarNombreCliente(?)}");
            ps.setString(1, cli.getNombres());
            rs = ps.executeQuery();

            while (rs.next()) {
                ClienteDTO t = new ClienteDTO();
                t.setIdCliente(rs.getInt(1));
                t.setNumDocumento(rs.getString(2));
                t.setTipoDocumentoID(rs.getInt(3));
                t.setNombres(rs.getString(4));
                t.setApellidos(rs.getString(5));
                t.setTelefono(rs.getString(6));
                t.setNacionalidad(rs.getString(7));
                t.setCorreo(rs.getString(8));
                t.setDireccion(rs.getString(9));
                t.setGenero(rs.getString(10).charAt(0));

                listaClientes.add(t);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            conexion.desconectar();
        }

        return listaClientes;
    }

    //BUSQUEDA POR APELLIDOS
    public List<ClienteDTO> buscarApellidos(ClienteDTO cli) {
        List<ClienteDTO> listaClientes = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = conexion.getConnection().prepareStatement("{CALL filtrarApellidoCliente(?)}");
            ps.setString(1, cli.getApellidos());
            rs = ps.executeQuery();

            while (rs.next()) {
                ClienteDTO t = new ClienteDTO();
                t.setIdCliente(rs.getInt(1));
                t.setNumDocumento(rs.getString(2));
                t.setTipoDocumentoID(rs.getInt(3));
                t.setNombres(rs.getString(4));
                t.setApellidos(rs.getString(5));
                t.setTelefono(rs.getString(6));
                t.setNacionalidad(rs.getString(7));
                t.setCorreo(rs.getString(8));
                t.setDireccion(rs.getString(9));
                t.setGenero(rs.getString(10).charAt(0));

                listaClientes.add(t);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            conexion.desconectar();
        }

        return listaClientes;
    }

    //BUSQUEDA POR TELEFONO
    public List<ClienteDTO> buscarTelefono(ClienteDTO cli) {
        List<ClienteDTO> listaClientes = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = conexion.getConnection().prepareStatement("{CALL filtrarTelefonoCliente(?)}");
            ps.setString(1, cli.getTelefono());
            rs = ps.executeQuery();

            while (rs.next()) {
                ClienteDTO t = new ClienteDTO();
                t.setIdCliente(rs.getInt(1));
                t.setNumDocumento(rs.getString(2));
                t.setTipoDocumentoID(rs.getInt(3));
                t.setNombres(rs.getString(4));
                t.setApellidos(rs.getString(5));
                t.setTelefono(rs.getString(6));
                t.setNacionalidad(rs.getString(7));
                t.setCorreo(rs.getString(8));
                t.setDireccion(rs.getString(9));
                t.setGenero(rs.getString(10).charAt(0));

                listaClientes.add(t);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            conexion.desconectar();
        }

        return listaClientes;
    }

    //BUSQUEDA POR DNI
    public List<ClienteDTO> buscarDniFiltro(ClienteDTO cli) {
        List<ClienteDTO> listaClientes = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = conexion.getConnection().prepareStatement("{CALL filtrarDniCliente(?)}");
            ps.setString(1, cli.getNumDocumento());
            rs = ps.executeQuery();

            while (rs.next()) {
                ClienteDTO t = new ClienteDTO();
                t.setIdCliente(rs.getInt(1));
                t.setNumDocumento(rs.getString(2));
                t.setTipoDocumentoID(rs.getInt(3));
                t.setNombres(rs.getString(4));
                t.setApellidos(rs.getString(5));
                t.setTelefono(rs.getString(6));
                t.setNacionalidad(rs.getString(7));
                t.setCorreo(rs.getString(8));
                t.setDireccion(rs.getString(9));
                t.setGenero(rs.getString(10).charAt(0));

                listaClientes.add(t);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            conexion.desconectar();
        }

        return listaClientes;
    }

    //BUSQUEDA POR CORREO
    public List<ClienteDTO> buscarCorreo(ClienteDTO cli) {
        List<ClienteDTO> listaClientes = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = conexion.getConnection().prepareStatement("{CALL filtrarCorreoCliente(?)}");
            ps.setString(1, cli.getCorreo());
            rs = ps.executeQuery();

            while (rs.next()) {
                ClienteDTO t = new ClienteDTO();
                t.setIdCliente(rs.getInt(1));
                t.setNumDocumento(rs.getString(2));
                t.setTipoDocumentoID(rs.getInt(3));
                t.setNombres(rs.getString(4));
                t.setApellidos(rs.getString(5));
                t.setTelefono(rs.getString(6));
                t.setNacionalidad(rs.getString(7));
                t.setCorreo(rs.getString(8));
                t.setDireccion(rs.getString(9));
                t.setGenero(rs.getString(10).charAt(0));

                listaClientes.add(t);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            conexion.desconectar();
        }

        return listaClientes;
    }
}
