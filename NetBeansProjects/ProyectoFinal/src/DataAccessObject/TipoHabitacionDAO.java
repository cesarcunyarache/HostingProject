package DataAccessObject;

import DataSource.Conexion;
import TransferObject.TipoHabitacionDTO;
import java.sql.*;
import javax.swing.*;
import java.util.ArrayList;

public class TipoHabitacionDAO implements Crud<TipoHabitacionDTO> {

    Conexion conexion;
    TipoHabitacionDTO tipoHabitacion;

    public TipoHabitacionDAO() {
        conexion = new Conexion();
    }

    @Override
    public boolean Create(TipoHabitacionDTO tipoHabitacion) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO TipoHabitacion(nombre, precio) VALUES(?,?)");
            ps.setString(1, tipoHabitacion.getNombre());
            ps.setDouble(2, tipoHabitacion.getPrecio());
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear tipo de habitación");
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
    public ArrayList<TipoHabitacionDTO> Read() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion.getConnection();

        ArrayList<TipoHabitacionDTO> tipoHabitaciones = new ArrayList<>();

        try {
            ps = con.prepareStatement("SELECT * FROM TipoHabitacion");
            rs = ps.executeQuery();

            while (rs.next()) {
                int idTipo = rs.getInt("idTipo");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                tipoHabitacion = new TipoHabitacionDTO(idTipo, nombre, precio);
                tipoHabitaciones.add(tipoHabitacion);
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
        return tipoHabitaciones;
    }

    @Override
    public boolean Update(TipoHabitacionDTO tipoHabitacion) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        boolean isUpdate = false;

        try {
            ps = con.prepareStatement("UPDATE TipoHabitacion SET nombre=?, precio=? WHERE idTipo=" + tipoHabitacion.getIdTipo());
            ps.setString(1, tipoHabitacion.getNombre());
            ps.setDouble(2, tipoHabitacion.getPrecio());

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
    public boolean Delete(TipoHabitacionDTO tipoHabitacion) {
        PreparedStatement ps = null;
        Connection con = conexion.getConnection();
        boolean isDelete = false;
        try {
            ps = con.prepareStatement("DELETE FROM TipoHabitacion WHERE idTipo=?");
            ps.setInt(1, tipoHabitacion.getIdTipo());
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
    public TipoHabitacionDTO Search(TipoHabitacionDTO tipoHabitacion) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement("SELECT * FROM TipoHabitacion WHERE idTipo=?");
            ps.setInt(1, tipoHabitacion.getIdTipo());
            rs = ps.executeQuery();

            if (rs.next()) {
                int idTipo = rs.getInt("idTipo");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                tipoHabitacion = new TipoHabitacionDTO(idTipo, nombre, precio);
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

        return tipoHabitacion;
    }
}
