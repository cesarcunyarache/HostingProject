package DataAccessObject;

import DataSource.Conexion;
import TransferObject.HabitacionDTO;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.*;


public class HabitacionDAO implements Crud<HabitacionDTO> {

    Conexion conexion;
    HabitacionDTO habitacion;

    public HabitacionDAO() {
        conexion = new Conexion();
    }

    @Override
    public boolean Create(HabitacionDTO habitacion) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO Habitacion(numHabitacion, tipoHabitacionID, estado) VALUES(?,?,?)");
            ps.setString(1, habitacion.getNumHabitacion());
            ps.setInt(2, habitacion.getTipoHabitacionID());
            ps.setString(3, habitacion.getEstado());
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear habitación");
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
    public ArrayList<HabitacionDTO> Read() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion.getConnection();

        ArrayList<HabitacionDTO> habitaciones = new ArrayList<>();

        try {
            ps = con.prepareStatement("SELECT * FROM Habitacion");
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String numHabitacion = rs.getString("numHabitacion");
                int tipoHabitacionID = rs.getInt("tipoHabitacionID");
                String estado = rs.getString("estado");
                habitacion = new HabitacionDTO(id, numHabitacion, tipoHabitacionID, estado);
                habitaciones.add(habitacion);
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
        return habitaciones;
    }

    @Override
    public boolean Update(HabitacionDTO habitacion) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        boolean isUpdate = false;

        try {
            ps = con.prepareStatement("UPDATE Habitacion SET numHabitacion=?, tipoHabitacionID=?, estado=? WHERE id=" + habitacion.getId());
            ps.setString(1, habitacion.getNumHabitacion());
            ps.setInt(2, habitacion.getTipoHabitacionID());
            ps.setString(3, habitacion.getEstado());

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
    public boolean Delete(HabitacionDTO habitacion) {
        PreparedStatement ps = null;
        Connection con = conexion.getConnection();
        boolean isDelete = false;
        try {
            ps = con.prepareStatement("DELETE FROM Habitacion WHERE id=?");
            ps.setInt(1, habitacion.getId());
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
    public HabitacionDTO Search(HabitacionDTO habitacion) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement("SELECT * FROM Habitacion WHERE id=?");
            ps.setInt(1, habitacion.getId());
            rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String numHabitacion = rs.getString("numHabitacion");
                int tipoHabitacionID = rs.getInt("tipoHabitacionID");
                String estado = rs.getString("estado");
                habitacion = new HabitacionDTO(id, numHabitacion, tipoHabitacionID, estado);
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

        return habitacion;
    }
}
