
package DataAccessObject;

import DataSource.Conexion;
import TransferObject.TipoDocumentoDTO;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

public class TipoDocumentoDAO implements Crud<TipoDocumentoDTO> {

    Conexion conexion;
    TipoDocumentoDTO tipoDocumento;

    public TipoDocumentoDAO() {
        conexion = new Conexion();
    }

    @Override
    public boolean Create(TipoDocumentoDTO tipoDocumento) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO TipoDocumento(nombre) VALUES(?)");
            ps.setString(1, tipoDocumento.getNombre());
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el tipo de documento");
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
    public ArrayList<TipoDocumentoDTO> Read() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion.getConnection();

        ArrayList<TipoDocumentoDTO> tiposDocumentos = new ArrayList<>();

        try {
            ps = con.prepareStatement("SELECT * FROM TipoDocumento");
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("idTipoDocumento");
                String nombre = rs.getString("nombre");
                tipoDocumento = new TipoDocumentoDTO(id, nombre);
                tiposDocumentos.add(tipoDocumento);
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
        return tiposDocumentos;
    }

    @Override
    public boolean Update(TipoDocumentoDTO tipoDocumento) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        boolean isUpdate = false;

        try {
            ps = con.prepareStatement("UPDATE TipoDocumento SET nombre=? WHERE idTipoDocumento=" + tipoDocumento.getIdTipoDocumento());
            ps.setString(1, tipoDocumento.getNombre());

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
    public boolean Delete(TipoDocumentoDTO tipoDocumento) {
        PreparedStatement ps = null;
        Connection con = conexion.getConnection();
        boolean isDelete = false;
        try {
            ps = con.prepareStatement("DELETE FROM TipoDocumento WHERE idTipoDocumento=?");
            ps.setInt(1, tipoDocumento.getIdTipoDocumento());
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
    public TipoDocumentoDTO Search(TipoDocumentoDTO tipoDoc) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement("SELECT * FROM TipoDocumento WHERE idTipoDocumento=?");
            ps.setInt(1, tipoDoc.getIdTipoDocumento());
            rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("idTipoDocumento");
                String nombre = rs.getString("nombre");
                tipoDocumento = new TipoDocumentoDTO(id, nombre);
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

        return tipoDocumento;
    }
}
