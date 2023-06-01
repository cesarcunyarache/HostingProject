package DataAccessObject;

import DataSource.Conexion;
import TransferObject.UsuarioDTO;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class UsuarioDAO implements Crud<UsuarioDTO> {

    private final Conexion conexion;
    private PreparedStatement ps;
    private ResultSet rs;

    public UsuarioDAO() {
        conexion = new Conexion();
    }

    public boolean Create(UsuarioDTO t) {

        int r = 0;
        try {
            ps = conexion.getConnection().prepareStatement(
                    "INSERT INTO Usuario("
                    + ",idEmpleado"
                    + ",user"
                    + ",password"
                    + ",rol"
                    + ") values(?,?,?,?) ");

            ps.setInt(1, t.getEmpleadoID());
            ps.setString(2, t.getUsuario());
            ps.setString(3, t.getContrasena());
            ps.setString(4, t.getRol());

            r = ps.executeUpdate();
            return r == 1;
        } catch (SQLException ex) {

            return false;
        } finally {
            conexion.desconectar();
        }
    }

    @Override
    public boolean Update(UsuarioDTO t) {
        int r = 0;
        try {
            ps = conexion.getConnection().prepareStatement("UPDATE Usuario set idEmpleado=?,user=?,password=?,rol=?  WHERE idUsuario=? ");
            ps.setInt(1, t.getEmpleadoID());
            ps.setDouble(2, t.getIdUsuario());
            ps.setString(3, t.getContrasena());
            ps.setString(4, t.getRol());
            ps.setInt(5, t.getIdUsuario());

            r = ps.executeUpdate();
            return r == 1;
        } catch (SQLException ex) {

            return false;
        } finally {
            conexion.desconectar();
        }
    }

    @Override
    public List<UsuarioDTO> Read() {
        List<UsuarioDTO> listaUsuarios = new ArrayList<>();

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM Usuario");
            rs = ps.executeQuery();

            //registros por leer
            while (rs.next()) {
                UsuarioDTO t = new UsuarioDTO();
                t.setIdUsuario(rs.getInt(1));
                t.setEmpleadoID(rs.getInt(2));
                t.setUsuario(rs.getString(3));
                t.setContrasena(rs.getString(4));
                t.setRol(rs.getString(4));

                listaUsuarios.add(t);
            }

            return listaUsuarios;
        } catch (SQLException ex) {
            return null;

        } finally {
            conexion.desconectar();
        }
    }

    @Override
    public boolean Delete(UsuarioDTO t) {
        throw new UnsupportedOperationException(""); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UsuarioDTO Search(UsuarioDTO t) {
        boolean encontrado = false;

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM Usuario WHERE idUsuario=?");
            ps.setInt(1, t.getIdUsuario());
            rs = ps.executeQuery();

            //registros por leer
            while (rs.next()) {

                t.setIdUsuario(rs.getInt(1));
                t.setEmpleadoID(rs.getInt(2));
                t.setUsuario(rs.getString(3));
                t.setContrasena(rs.getString(4));
                t.setRol(rs.getString(5));

                encontrado = true;
            }

            if (encontrado) {
                return t;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;

        } finally {
            conexion.desconectar();
        }

    }

     public UsuarioDTO SearchUser(UsuarioDTO t) {
        boolean encontrado = false;

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM Usuario WHERE [user]=?");
            ps.setString(1, t.getUsuario());
            rs = ps.executeQuery();

            //registros por leer
            while (rs.next()) {

                t.setIdUsuario(rs.getInt(1));
                t.setEmpleadoID(rs.getInt(2));
                t.setUsuario(rs.getString(3));
                t.setContrasena(rs.getString(4));
                t.setRol(rs.getString(5));

                encontrado = true;
            }

            if (encontrado) {
                return t;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;

        } finally {
            conexion.desconectar();
        }

    }
     
     
    public UsuarioDTO validar(UsuarioDTO t) {
        boolean encontrado = false;

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM Usuario WHERE [user]=? AND password=?");
            ps.setString(1, t.getUsuario());
            ps.setString(2, t.getContrasena());
            rs = ps.executeQuery();

            //registros por leer
            while (rs.next()) {

                t.setIdUsuario(rs.getInt(1));
                t.setEmpleadoID(rs.getInt(2));
                t.setUsuario(rs.getString(3));
                t.setContrasena(rs.getString(4));
                t.setRol(rs.getString(5));

                encontrado = true;
            }

            if (encontrado) {
                return t;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;

        } finally {
            conexion.desconectar();
        }

    }

}
