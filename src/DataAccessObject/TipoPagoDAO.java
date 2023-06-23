package DataAccessObject;

import DataSource.Conexion;
import TransferObject.TipoPagoDTO;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.*;

public class TipoPagoDAO implements Crud<TipoPagoDTO> {

    Conexion conexion;
    TipoPagoDTO tipoPago;

    public TipoPagoDAO() {
        conexion = new Conexion();
    }

    @Override
    public boolean Create(TipoPagoDTO tipoPago) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO TipoPago(nombre) VALUES(?)");
            ps.setString(1, tipoPago.getNombre());
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear tipo de pago");
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
    public ArrayList<TipoPagoDTO> Read() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion.getConnection();

        ArrayList<TipoPagoDTO> tiposPago = new ArrayList<>();

        try {
            ps = con.prepareStatement("SELECT * FROM TipoPago");
            rs = ps.executeQuery();

            while (rs.next()) {
                int idTPago = rs.getInt("idTipo");
                String nombre = rs.getString("nombre");
                tipoPago = new TipoPagoDTO(idTPago, nombre);
                tiposPago.add(tipoPago);
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
        return tiposPago;
    }

    @Override
    public boolean Update(TipoPagoDTO tipoPago) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        boolean isUpdate = false;

        try {
            ps = con.prepareStatement("UPDATE TipoPago SET nombre=? WHERE idTipo=" + tipoPago.getIdTPago());
            ps.setString(1, tipoPago.getNombre());

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
    public boolean Delete(TipoPagoDTO tipoPago) {
        PreparedStatement ps = null;
        Connection con = conexion.getConnection();
        boolean isDelete = false;
        try {
            ps = con.prepareStatement("DELETE FROM TipoPago WHERE idTipo=?");
            ps.setInt(1, tipoPago.getIdTPago());
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
    public TipoPagoDTO Search(TipoPagoDTO tipoPago) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        TipoPagoDTO ti = null;
        try {
            ps = con.prepareStatement("SELECT * FROM TipoPago WHERE idTipo=?");
            ps.setInt(1, tipoPago.getIdTPago());
            rs = ps.executeQuery();

            if (rs.next()) {
                int idTPago = rs.getInt("idTipo");
                String nombre = rs.getString("nombre");
                ti = new TipoPagoDTO(idTPago, nombre);
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

        return ti;
    }

    public TipoPagoDTO SearchName(TipoPagoDTO tipoPago) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement("SELECT * FROM TipoPago WHERE nombre=?");
            ps.setString(1, tipoPago.getNombre());
            rs = ps.executeQuery();

            if (rs.next()) {
                int idTPago = rs.getInt("idTipo");
                String nombre = rs.getString("nombre");
                tipoPago = new TipoPagoDTO(idTPago, nombre);
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

        return tipoPago;
    }
}
