package DataAccessObject;

import DataSource.Conexion;
import TransferObject.UsuarioDTO;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import javax.xml.transform.sax.SAXSource;

public class UsuarioDAO implements Crud<UsuarioDTO> {

    private Conexion conexion;
    

    public UsuarioDAO() {
        conexion = new Conexion();
    }

    public boolean Create(UsuarioDTO t) {

        int r = 0;
        try {
            PreparedStatement ps = null;
            ps = conexion.getConnection().prepareStatement("INSERT INTO Usuario values(?,?,?,?) ");

            ps.setInt(1, t.getEmpleadoID());
            ps.setString(2, t.getUsuario());
            ps.setString(3, t.getContrasena());
            ps.setString(4, t.getRol());

            r = ps.executeUpdate();
            return r == 1;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        } finally {
            conexion.desconectar();
        }
    }

    @Override
    public boolean Update(UsuarioDTO t) {
        Connection con = conexion.getConnection();
        boolean isUpdate = false;
        try {
            PreparedStatement ps = null;
            ps = con.prepareStatement("UPDATE Usuario SET idEmpleado=?,[user]=?,password=?,rol=?  WHERE idUsuario="+t.getIdUsuario());
            ps.setInt(1, t.getEmpleadoID());
            ps.setString(2, t.getUsuario());
            ps.setString(3, t.getContrasena());
            ps.setString(4, t.getRol());
           
            int res = ps.executeUpdate();
            if (res > 0) {
                isUpdate = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
         
        } finally {
            conexion.desconectar();
        }
        
        return isUpdate;
    }

    @Override
    public List<UsuarioDTO> Read() {
        List<UsuarioDTO> listaUsuarios = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = conexion.getConnection().prepareStatement("SELECT * FROM Usuario");
            rs = ps.executeQuery();

            //registros por leer
            while (rs.next()) {
                UsuarioDTO t = new UsuarioDTO();
                t.setIdUsuario(rs.getInt(1));
                t.setEmpleadoID(rs.getInt(2));
                t.setUsuario(rs.getString(3));
                t.setContrasena(rs.getString(4));
                t.setRol(rs.getString(5));

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
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = conexion.getConnection().prepareStatement("SELECT * FROM Usuario WHERE idEmpleado=?");
            ps.setInt(1, t.getEmpleadoID());
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
        UsuarioDTO obj = null;

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = conexion.getConnection().prepareStatement("SELECT * FROM Usuario WHERE [user]=?");
            ps.setString(1, t.getUsuario());
            rs = ps.executeQuery();

            //registros por leer
            if (rs.next()) {

                int id = rs.getInt(1);
                int idEmpleado = rs.getInt(2);
                String usuario = rs.getString(3);
                String contraseña = rs.getString(4);
                String rol = rs.getString(5);
                
                obj = new UsuarioDTO(id, idEmpleado, usuario, contraseña, rol);  
            }
        } catch (SQLException ex) {
            

        } finally {
            conexion.desconectar();
        }
        return obj;

    }

    public UsuarioDTO SearchUpadate(UsuarioDTO t) {
       UsuarioDTO obj = null;

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            ps = conexion.getConnection().prepareStatement("SELECT * FROM Usuario WHERE [user]=? AND NOT idUsuario =?");
            ps.setString(1, t.getUsuario());
            ps.setInt(2, t.getIdUsuario());
            rs = ps.executeQuery();

            //registros por leer
            if (rs.next()) {
                obj = new UsuarioDTO();
                obj.setIdUsuario(rs.getInt(1));
                obj.setEmpleadoID(rs.getInt(2));
                obj.setUsuario(rs.getString(3));
                obj.setContrasena(rs.getString(4));
                obj.setRol(rs.getString(5));

               
            }

            
        } catch (SQLException ex) {
            return null;

        } finally {
            conexion.desconectar();
        }
        return obj;

    }

    public UsuarioDTO validar(UsuarioDTO t) {
        boolean encontrado = false;

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
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
