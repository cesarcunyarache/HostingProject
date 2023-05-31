package DataAccessObject;

import DataSource.Conexion;
import TransferObject.TipoEmpleadoDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TipoEmpleadoDAO implements Crud<TipoEmpleadoDTO> {

    private Conexion conexion;
    private PreparedStatement ps;
    private ResultSet rs;

    public TipoEmpleadoDAO() {
        conexion = new Conexion();
    }

    @Override
    public boolean Create(TipoEmpleadoDTO t) {
        int r = 0;
        try {
            ps = conexion.getConnection().prepareStatement(
                    "INSERT INTO tipoEmpleado("
                    + ",nombre"
                    + ",sueldo"
                    + ") values(?,?) ");

            ps.setString(1, t.getNombre());
            ps.setDouble(2, t.getSueldo());

            r = ps.executeUpdate();
            return r == 1;
        } catch (SQLException ex) {

            return false;
        } finally {
            conexion.desconectar();
        }
    }

    @Override
    public boolean Update(TipoEmpleadoDTO t) {
        int r = 0;
        try {
            ps = conexion.getConnection().prepareStatement("UPDATE tipoEmpleado set nombre=?,sueldo=?  WHERE idEmpleado=? ");
            ps.setString(1, t.getNombre());
            ps.setDouble(1, t.getSueldo());
            ps.setInt(1, t.getIdTipoEmpleado());

            r = ps.executeUpdate();
            return r == 1;
        } catch (SQLException ex) {

            return false;
        } finally {
            conexion.desconectar();
        }

    }

    @Override
    public List<TipoEmpleadoDTO> Read() {

        List<TipoEmpleadoDTO> listaPelis = new ArrayList<>();

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM tipoEmpleado");
            rs = ps.executeQuery();

            //registros por leer
            while (rs.next()) {
                TipoEmpleadoDTO t = new TipoEmpleadoDTO();
                t.setIdTipoEmpleado(rs.getInt(1));
                t.setNombre(rs.getString(2));
                t.setSueldo(rs.getDouble(3));

                listaPelis.add(t);
            }

            return listaPelis;
        } catch (SQLException ex) {
            return null;

        } finally {
            conexion.desconectar();
        }

    }

    @Override
    public boolean Delete(TipoEmpleadoDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TipoEmpleadoDTO Search(TipoEmpleadoDTO t) {
        boolean encontrado = false;

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM tipoEmpleado WHERE tipoEmpleado=?");
            ps.setInt(1, t.getIdTipoEmpleado());
            rs = ps.executeQuery();

            //registros por leer
            while (rs.next()) {

                t.setIdTipoEmpleado(rs.getInt(1));
                t.setNombre(rs.getString(2));
                t.setSueldo(rs.getDouble(3));

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

    public TipoEmpleadoDTO SearchName(TipoEmpleadoDTO t) {
        boolean encontrado = false;

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM tipoEmpleado WHERE nombre=?");
            ps.setString(1, t.getNombre());
            rs = ps.executeQuery();

            //registros por leer
            while (rs.next()) {

                t.setIdTipoEmpleado(rs.getInt(1));
                t.setNombre(rs.getString(2));
                t.setSueldo(rs.getDouble(3));

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
