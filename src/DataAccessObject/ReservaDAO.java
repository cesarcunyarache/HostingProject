package DataAccessObject;

import DataSource.Conexion;
import TransferObject.ReservaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import javax.swing.*;

public class ReservaDAO implements Crud<ReservaDTO> {

    Conexion conexion;
    ReservaDTO reserva;

    public ReservaDAO() {
        conexion = new Conexion();
    }

    @Override
    public boolean Create(ReservaDTO reserva) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO Reserva(idHabitacion, idCliente, idEmpleado, fechaReserva, fechaInicio, fechaFin, estado) VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, reserva.getIdHabitacion());
            ps.setInt(2, reserva.getIdCliente());
            ps.setInt(3, reserva.getIdEmpleado());
            ps.setDate(4, reserva.getFechaReserva());
            ps.setDate(5, reserva.getFechaInicio());
            ps.setDate(6, reserva.getFechaFin());
            ps.setString(7, reserva.getEstado());
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear la reserva");
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
    public ArrayList<ReservaDTO> Read() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion.getConnection();

        ArrayList<ReservaDTO> reservas = new ArrayList<>();

        try {
            ps = con.prepareStatement("SELECT * FROM Reserva");
            rs = ps.executeQuery();

            while (rs.next()) {
                int idReserva = rs.getInt("idReserva");
                int idHabitacion = rs.getInt("idHabitacion");
                int idCliente = rs.getInt("idCliente");
                int idEmpleado = rs.getInt("idEmpleado");
                Date fechaReserva = rs.getDate("fechaReserva");
                Date fechaInicio = rs.getDate("fechaInicio");
                Date fechaFin = rs.getDate("fechaFin");
                String estado = rs.getString("estado");
                reserva = new ReservaDTO(idReserva, idHabitacion, idCliente, idEmpleado, fechaReserva, fechaInicio, fechaFin, estado);
                reservas.add(reserva);
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
        return reservas;
    }

    @Override
    public boolean Update(ReservaDTO reserva) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        boolean isUpdate = false;

        try {
            ps = con.prepareStatement("UPDATE Reserva SET idHabitacion=?, idCliente=?, idEmpleado=?, fechaReserva=?, fechaInicio=?, fechaFin=?, estado=? WHERE idReserva=" + reserva.getIdReserva());
            ps.setInt(1, reserva.getIdHabitacion());
            ps.setInt(2, reserva.getIdCliente());
            ps.setInt(3, reserva.getIdEmpleado());
            ps.setDate(4, new java.sql.Date(reserva.getFechaReserva().getTime()));
            ps.setDate(5, new java.sql.Date(reserva.getFechaInicio().getTime()));
            ps.setDate(6, new java.sql.Date(reserva.getFechaFin().getTime()));
            ps.setString(7, reserva.getEstado());
            int res = ps.executeUpdate();
            if (res > 0) {
                isUpdate = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar la reserva");
            }

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        return isUpdate;
    }

    @Override
    public boolean Delete(ReservaDTO reserva) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        boolean isDelete = false;
        try {
            ps = con.prepareStatement("DELETE FROM Reserva WHERE idReserva=?");
            ps.setInt(1, reserva.getIdReserva());
            int res = ps.executeUpdate();
            if (res > 0) {
                isDelete = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar la reserva");
            }

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        return isDelete;
    }

    @Override
    public ReservaDTO Search(ReservaDTO reserva) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement("SELECT * FROM Reserva WHERE idReserva=?");
            ps.setInt(1, reserva.getIdReserva());
            rs = ps.executeQuery();

            if (rs.next()) {
                int idReserva = rs.getInt("idReserva");
                int idHabitacion = rs.getInt("idHabitacion");
                int idCliente = rs.getInt("idCliente");
                int idEmpleado = rs.getInt("idEmpleado");
                Date fechaReserva = rs.getDate("fechaReserva");
                Date fechaInicio = rs.getDate("fechaInicio");
                Date fechaFin = rs.getDate("fechaFin");
                String estado = rs.getString("estado");
                reserva = new ReservaDTO(idReserva, idHabitacion, idCliente, idEmpleado, fechaReserva, fechaInicio, fechaFin, estado);
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

        return reserva;
    }
}
