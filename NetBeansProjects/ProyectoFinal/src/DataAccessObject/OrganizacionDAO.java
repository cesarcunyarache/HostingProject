
package DataAccessObject;

import DataSource.Conexion;
import TransferObject.OrganizacionDTO;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

public class OrganizacionDAO implements Crud<OrganizacionDTO> {

    Conexion conexion;
    OrganizacionDTO organizacion;

    public OrganizacionDAO() {
        conexion = new Conexion();
    }

    @Override
    public boolean Create(OrganizacionDTO organizacion) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO Organizacion(nombre, razonSocial, ruc, descripcion, estado) VALUES(?,?,?,?,?)");
            ps.setString(1, organizacion.getNombre());
            ps.setString(2, organizacion.getRazonSocial());
            ps.setString(3, organizacion.getRuc());
            ps.setString(4, organizacion.getDescripcion());
            ps.setString(5, organizacion.getEstado());
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar la organización");
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
    public ArrayList<OrganizacionDTO> Read() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion.getConnection();

        ArrayList<OrganizacionDTO> organizaciones = new ArrayList<>();

        try {
            ps = con.prepareStatement("SELECT * FROM Organizacion");
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("idOrganizacion");
                String nombre = rs.getString("nombre");
                String razonSocial = rs.getString("razonSocial");
                String ruc = rs.getString("ruc");
                String descripcion = rs.getString("descripcion");
                String estado = rs.getString("estado");
                organizacion = new OrganizacionDTO(id, nombre, razonSocial, ruc, descripcion, estado);
                organizaciones.add(organizacion);
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
        return organizaciones;
    }

    @Override
    public boolean Update(OrganizacionDTO organizacion) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        boolean isUpdate = false;

        try {
            ps = con.prepareStatement("UPDATE Organizacion SET nombre=?, razonSocial=?, ruc=?, descripcion=?, estado=? WHERE idOrganizacion=" + organizacion.getIdOrganizacion());
            ps.setString(1, organizacion.getNombre());
            ps.setString(2, organizacion.getRazonSocial());
            ps.setString(3, organizacion.getRuc());
            ps.setString(4, organizacion.getDescripcion());
            ps.setString(5, organizacion.getEstado());

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
    public boolean Delete(OrganizacionDTO organizacion) {
        PreparedStatement ps = null;
        Connection con = conexion.getConnection();
        boolean isDelete = false;
        try {
            ps = con.prepareStatement("DELETE FROM Organizacion WHERE idOrganizacion=?");
            ps.setInt(1, organizacion.getIdOrganizacion());
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
    public OrganizacionDTO Search(OrganizacionDTO org) {
        Connection con = conexion.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement("SELECT * FROM Organizacion WHERE idOrganizacion=?");
            ps.setInt(1, org.getIdOrganizacion());
            rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("idOrganizacion");
                String nombre = rs.getString("nombre");
                String razonSocial = rs.getString("razonSocial");
                String ruc = rs.getString("ruc");
                String descripcion = rs.getString("descripcion");
                String estado = rs.getString("estado");
                organizacion = new OrganizacionDTO(id, nombre, razonSocial, ruc, descripcion, estado);
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

        return organizacion;
    }
}

