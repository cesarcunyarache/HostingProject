package DataAccessObject;

import DataSource.Conexion;
import TransferObject.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

    public ClienteDTO SearchDNI(ClienteDTO clie) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        ClienteDTO cliente = null;
        try {

            ps = con.prepareStatement("SELECT * FROM Cliente WHERE numDoc=?");
            ps.setString(1, clie.getNumDocumento());

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
}
