
package DataAccessObject;
import DataSource.Conexion;
import TransferObject.PagoDTO;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.*;

public class PagoDAO implements Crud<PagoDTO> {

    Conexion conexion;
    PagoDTO pago;

    public PagoDAO() {
        conexion = new Conexion();
    }

    @Override
    public boolean Create(PagoDTO pago) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO Pago(idPago, monto, idTipo, descripcion) VALUES (?, ?, ?,?)");
            ps.setInt(1, pago.getIdPago());
            ps.setDouble(2, pago.getMonto());
            ps.setInt(3, pago.getIdTipo());
            ps.setString(4, pago.getDescripcion());
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear el pago");
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
    public ArrayList<PagoDTO> Read() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion.getConnection();

        ArrayList<PagoDTO> pagos = new ArrayList<>();

        try {
            ps = con.prepareStatement("SELECT * FROM Pago");
            rs = ps.executeQuery();

            while (rs.next()) {
                int idPago = rs.getInt("idPago");
                double monto = rs.getDouble("monto");
                int idTipo = rs.getInt("idTipo");
                String descripcion = rs.getString("descripcion");
                pago = new PagoDTO(idPago, monto, idTipo, descripcion);
                pagos.add(pago);
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
        return pagos;
    }

    @Override
    public boolean Update(PagoDTO pago) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        boolean isUpdate = false;

        try {
            ps = con.prepareStatement("UPDATE Pago SET monto=?, idTipo=?, descripcion=? WHERE idPago=" + pago.getIdPago());
            ps.setDouble(1, pago.getMonto());
            ps.setInt(2, pago.getIdTipo());
            ps.setString(3, pago.getDescripcion());

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
    public boolean Delete(PagoDTO pago) {
        PreparedStatement ps = null;
        Connection con = conexion.getConnection();
        boolean isDelete = false;
        try {
            ps = con.prepareStatement("DELETE FROM Pago WHERE idPago=?");
            ps.setInt(1, pago.getIdPago());
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
    public PagoDTO Search(PagoDTO pago) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement("SELECT * FROM Pago WHERE idPago=?");
            ps.setInt(1, pago.getIdPago());
            rs = ps.executeQuery();

            if (rs.next()) {
                int idPago = rs.getInt("idPago");
                double monto = rs.getDouble("monto");
                int idTipo = rs.getInt("idTipo");
                String descripcion = rs.getString("descripcion");
                pago = new PagoDTO(idPago, monto, idTipo, descripcion);
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

        return pago;
    }
}

