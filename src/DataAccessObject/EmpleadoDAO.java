package DataAccessObject;

import DataSource.Conexion;
import TransferObject.EmpleadoDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EmpleadoDAO implements Crud<EmpleadoDTO> {

    private Conexion conexion;

    public EmpleadoDAO() {
        conexion = new Conexion();
    }

    @Override
    public boolean Create(EmpleadoDTO t) {
        int r = 0;
        try {
             PreparedStatement ps = null;
           
            ps = conexion.getConnection().prepareStatement(
                    "INSERT INTO Empleado("
                    + "nombre"
                    + ",apellido"
                    + ",telefono"
                    + ",correo"
                    + ",direccion"
                    + ",fechaNacimiento"
                    + ",nacionalidad"
                    + ",genero"
                    + ",dni"
                    + ",idTipo"
                    + ") values(?,?,?,?,?,?,?,?,?,?) ");

            ps.setString(1, t.getNombres());
            ps.setString(2, t.getApellidos());
            ps.setString(3, t.getTelefono());
            ps.setString(4, t.getCorreo());
            ps.setString(5, t.getDireccion());
            ps.setDate(6, t.getFechaNacimiento());
            ps.setString(7, t.getNacionalidad());
            ps.setString(8, String.valueOf(t.getGenero()));
            ps.setString(9, t.getNumDocumento());
            ps.setInt(10, t.getTipoEmpleadoID());

            r = ps.executeUpdate();
            return r == 1;
        } catch (SQLException ex) {

            return false;
        } finally {
            conexion.desconectar();
        }
    }

    @Override
    public boolean Update(EmpleadoDTO t) {
        int r = 0;
        boolean isUpdate = false;
        try {
            PreparedStatement ps = null;
            ps = conexion.getConnection().prepareStatement(
                    "UPDATE Empleado set "
                    + "nombre=?"
                    + ",apellido=?"
                    + ",telefono=?"
                    + ",correo=?"
                    + ",direccion=?"
                    + ",fechaNacimiento=?"
                    + ",nacionalidad=?"
                    + ",genero=?"
                    + ",dni=?"
                    + ",idTipo=?"
                    + ",estado=?"
                    + " WHERE idEmpleado=? ");

            ps.setString(1, t.getNombres());
            ps.setString(2, t.getApellidos());
            ps.setString(3, t.getTelefono());
            ps.setString(4, t.getCorreo());
            ps.setString(5, t.getDireccion());
            System.out.println("Segunda fecha " + t.getFechaNacimiento());
            ps.setDate(6, t.getFechaNacimiento());
            ps.setString(7, t.getNacionalidad());
            ps.setString(8, String.valueOf(t.getGenero()));
            ps.setString(9, t.getNumDocumento());
            ps.setInt(10, t.getTipoEmpleadoID());
            ps.setInt(11, t.getEstado());
            ps.setInt(12, t.getIdEmpleado());

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
    public List<EmpleadoDTO> Read() {
        List<EmpleadoDTO> listaHabitacion = new ArrayList<>();

        try {
             PreparedStatement ps = null;
             ResultSet rs = null;
            ps = conexion.getConnection().prepareStatement("SELECT * FROM Empleado");
            rs = ps.executeQuery();

            //registros por leer
            while (rs.next()) {
                EmpleadoDTO t = new EmpleadoDTO();

                t.setIdEmpleado(rs.getInt(1));
                t.setNombres(rs.getString(2));
                t.setApellidos(rs.getString(3));
                t.setTelefono(rs.getString(4));
                t.setCorreo(rs.getString(5));
                t.setDireccion(rs.getString(6));
                t.setFechaNacimiento(rs.getDate(7));
                t.setNacionalidad(rs.getString(8));
                t.setGenero(rs.getString(9).charAt(0));
                t.setNumDocumento(rs.getString(10));
                t.setTipoEmpleadoID(rs.getInt(11));
                t.setEstado(rs.getInt(12));

                listaHabitacion.add(t);
            }

            return listaHabitacion;
        } catch (SQLException ex) {
            return null;

        } finally {
            conexion.desconectar();
        }
    }

    @Override
    public boolean Delete(EmpleadoDTO t) {
        throw new UnsupportedOperationException(""); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EmpleadoDTO Search(EmpleadoDTO t) {
        boolean encontrado = false;

        try {
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = conexion.getConnection().prepareStatement("SELECT * FROM Empleado WHERE idEmpleado=?");
            ps.setInt(1, t.getIdEmpleado());
            rs = ps.executeQuery();

            //registros por leer
            while (rs.next()) {

                t.setIdEmpleado(rs.getInt(1));
                t.setNombres(rs.getString(2));
                t.setApellidos(rs.getString(3));
                t.setTelefono(rs.getString(4));
                t.setCorreo(rs.getString(5));
                t.setDireccion(rs.getString(6));
                t.setFechaNacimiento(rs.getDate(7));
                t.setNacionalidad(rs.getString(8));
                t.setGenero(rs.getString(9).charAt(0));
                t.setNumDocumento(rs.getString(10));
                t.setTipoEmpleadoID(rs.getInt(11));
                t.setEstado(rs.getInt(12));

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

    public EmpleadoDTO SearchDNI(EmpleadoDTO t) {
        Connection con = conexion.getConnection();
        EmpleadoDTO objeto = null;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = con.prepareStatement("SELECT * FROM Empleado WHERE dni=?");
            ps.setString(1, t.getNumDocumento());
            rs = ps.executeQuery();

            //registros por leer
           if (rs.next()) {
               objeto =  new EmpleadoDTO();
                objeto.setIdEmpleado(rs.getInt("idEmpleado"));
                objeto.setNombres(rs.getString("nombre"));
                objeto.setApellidos(rs.getString("apellido"));
                objeto.setTelefono(rs.getString("telefono"));
                objeto.setCorreo(rs.getString("correo"));
                objeto.setDireccion(rs.getString("direccion"));
                objeto.setFechaNacimiento(rs.getDate("fechaNacimiento"));
                objeto.setNacionalidad(rs.getString("nacionalidad"));
                objeto.setGenero(rs.getString("genero").charAt(0));
                objeto.setNumDocumento(rs.getString("dni"));
                objeto.setTipoEmpleadoID(rs.getInt("idTipo"));
                objeto.setEstado(rs.getInt("estado"));
               
            } 

            
        } catch (SQLException ex) {
            System.out.println(ex);

        } finally {
            conexion.desconectar();
        }
        return objeto;
    }

    public List<EmpleadoDTO> SearchNames(EmpleadoDTO t) {

        List<EmpleadoDTO> listaEmpleados = new ArrayList<>();

        try {
            PreparedStatement ps = null;
             ResultSet rs = null;
            ps = conexion.getConnection().prepareStatement("SELECT * FROM Empleado WHERE nombre=?");
            ps.setString(1, t.getNombres());
            rs = ps.executeQuery();

            if (!rs.isBeforeFirst()) {
                return null;
            } else {
                while (rs.next()) {
                    t.setIdEmpleado(rs.getInt(1));
                    t.setNombres(rs.getString(2));
                    t.setApellidos(rs.getString(3));
                    t.setTelefono(rs.getString(4));
                    t.setCorreo(rs.getString(5));
                    t.setDireccion(rs.getString(6));
                    t.setFechaNacimiento(rs.getDate(7));
                    t.setNacionalidad(rs.getString(8));
                    t.setGenero(rs.getString(9).charAt(0));
                    t.setNumDocumento(rs.getString(10));
                    t.setTipoEmpleadoID(rs.getInt(11));
                    t.setEstado(rs.getInt(12));
                    listaEmpleados.add(t);
                }
            }

        } catch (SQLException ex) {
            return null;

        } finally {
            conexion.desconectar();
        }
        return listaEmpleados;
    }
    
     //BUSQUEDAS
    //BUSQUEDA POR NOMBRE 
    public List<EmpleadoDTO> buscarNombres(EmpleadoDTO emp) {
        List<EmpleadoDTO> listaEmpleados = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = conexion.getConnection().prepareStatement("{CALL filtrarNombreEmpleado(?)}");
            ps.setString(1, emp.getNombres());
            rs = ps.executeQuery();

            while (rs.next()) {
                EmpleadoDTO t = new EmpleadoDTO();
                t.setIdEmpleado(rs.getInt(1));
                t.setNombres(rs.getString(2));
                t.setApellidos(rs.getString(3));
                t.setTelefono(rs.getString(4));
                t.setCorreo(rs.getString(5));
                t.setDireccion(rs.getString(6));
                t.setFechaNacimiento(rs.getDate(7));
                t.setNacionalidad(rs.getString(8));
                t.setGenero(rs.getString(9).charAt(0));
                t.setNumDocumento(rs.getString(10));
                t.setTipoEmpleadoID(rs.getInt(11));
                t.setEstado(rs.getInt(12));
                listaEmpleados.add(t);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            conexion.desconectar();
        }

        return listaEmpleados;
    }

    //BUSQUEDA POR APELLIDOS
    public List<EmpleadoDTO> buscarApellidos(EmpleadoDTO emp) {

        List<EmpleadoDTO> listaEmpleados = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = conexion.getConnection().prepareStatement("{CALL filtrarApellidoEmpleado(?)}");
            ps.setString(1, emp.getApellidos());
            rs = ps.executeQuery();

            while (rs.next()) {
                EmpleadoDTO t = new EmpleadoDTO();
                t.setIdEmpleado(rs.getInt(1));
                t.setNombres(rs.getString(2));
                t.setApellidos(rs.getString(3));
                t.setTelefono(rs.getString(4));
                t.setCorreo(rs.getString(5));
                t.setDireccion(rs.getString(6));
                t.setFechaNacimiento(rs.getDate(7));
                t.setNacionalidad(rs.getString(8));
                t.setGenero(rs.getString(9).charAt(0));
                t.setNumDocumento(rs.getString(10));
                t.setTipoEmpleadoID(rs.getInt(11));
                t.setEstado(rs.getInt(12));
                listaEmpleados.add(t);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            conexion.desconectar();
        }

        return listaEmpleados;
    }

    //BUSQUEDA POR TELEFONO
    public List<EmpleadoDTO> buscarTelefono(EmpleadoDTO emp) {

        List<EmpleadoDTO> listaEmpleados = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = conexion.getConnection().prepareStatement("{CALL filtrarTelefonoEmpleado(?)}");
            ps.setString(1, emp.getTelefono());
            rs = ps.executeQuery();

            while (rs.next()) {
                EmpleadoDTO t = new EmpleadoDTO();
                t.setIdEmpleado(rs.getInt(1));
                t.setNombres(rs.getString(2));
                t.setApellidos(rs.getString(3));
                t.setTelefono(rs.getString(4));
                t.setCorreo(rs.getString(5));
                t.setDireccion(rs.getString(6));
                t.setFechaNacimiento(rs.getDate(7));
                t.setNacionalidad(rs.getString(8));
                t.setGenero(rs.getString(9).charAt(0));
                t.setNumDocumento(rs.getString(10));
                t.setTipoEmpleadoID(rs.getInt(11));
                t.setEstado(rs.getInt(12));
                listaEmpleados.add(t);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            conexion.desconectar();
        }

        return listaEmpleados;
    }

    //BUSQUEDA POR DNI
    public List<EmpleadoDTO> buscarDniFiltro(EmpleadoDTO emp) {
        List<EmpleadoDTO> listaEmpleados = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = conexion.getConnection().prepareStatement("{CALL filtrarDniEmpleado(?)}");
            ps.setString(1, emp.getNumDocumento());
            rs = ps.executeQuery();

            while (rs.next()) {
                EmpleadoDTO t = new EmpleadoDTO();
                t.setIdEmpleado(rs.getInt(1));
                t.setNombres(rs.getString(2));
                t.setApellidos(rs.getString(3));
                t.setTelefono(rs.getString(4));
                t.setCorreo(rs.getString(5));
                t.setDireccion(rs.getString(6));
                t.setFechaNacimiento(rs.getDate(7));
                t.setNacionalidad(rs.getString(8));
                t.setGenero(rs.getString(9).charAt(0));
                t.setNumDocumento(rs.getString(10));
                t.setTipoEmpleadoID(rs.getInt(11));
                t.setEstado(rs.getInt(12));
                listaEmpleados.add(t);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            conexion.desconectar();
        }

        return listaEmpleados;
    }

    public EmpleadoDTO buscarDNI(EmpleadoDTO t) {
        Connection con = conexion.getConnection();
        EmpleadoDTO objeto = null;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = con.prepareStatement("{CALL filtrarDniEmpleado(?)}");
            ps.setString(1, t.getNumDocumento());
            rs = ps.executeQuery();

            //registros por leer
            if (rs.next()) {
                objeto = new EmpleadoDTO();
                objeto.setIdEmpleado(rs.getInt("idEmpleado"));
                objeto.setNombres(rs.getString("nombre"));
                objeto.setApellidos(rs.getString("apellido"));
                objeto.setTelefono(rs.getString("telefono"));
                objeto.setCorreo(rs.getString("correo"));
                objeto.setDireccion(rs.getString("direccion"));
                objeto.setFechaNacimiento(rs.getDate("fechaNacimiento"));
                objeto.setNacionalidad(rs.getString("nacionalidad"));
                objeto.setGenero(rs.getString("genero").charAt(0));
                objeto.setNumDocumento(rs.getString("dni"));
                objeto.setTipoEmpleadoID(rs.getInt("idTipo"));
                objeto.setEstado(rs.getInt("estado"));

            }

        } catch (SQLException ex) {
            System.out.println(ex);

        } finally {
            conexion.desconectar();
        }
        return objeto;
    }
    //BUSQUEDA POR NACIONALIDAD

    public List<EmpleadoDTO> buscarNacionalidad(EmpleadoDTO t) {

        List<EmpleadoDTO> listaEmpleados = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = conexion.getConnection().prepareStatement("{CALL filtrarNacionalidadEmpleado(?)}");
            ps.setString(1, t.getNacionalidad());
            rs = ps.executeQuery();

            while (rs.next()) {
                EmpleadoDTO tt = new EmpleadoDTO();
                tt.setIdEmpleado(rs.getInt(1));
                tt.setNombres(rs.getString(2));
                tt.setApellidos(rs.getString(3));
                tt.setTelefono(rs.getString(4));
                tt.setCorreo(rs.getString(5));
                tt.setDireccion(rs.getString(6));
                tt.setFechaNacimiento(rs.getDate(7));
                tt.setNacionalidad(rs.getString(8));
                tt.setGenero(rs.getString(9).charAt(0));
                tt.setNumDocumento(rs.getString(10));
                tt.setTipoEmpleadoID(rs.getInt(11));
                tt.setEstado(rs.getInt(12));
                listaEmpleados.add(tt);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            conexion.desconectar();
        }

        return listaEmpleados;
    }

    //BUSQUEDA POR CORREO
    public List<EmpleadoDTO> buscarCorreo(EmpleadoDTO t) {

        List<EmpleadoDTO> listaEmpleados = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = conexion.getConnection().prepareStatement("{CALL filtrarCorreoEmpleado(?)}");
            ps.setString(1, t.getCorreo());
            rs = ps.executeQuery();

            while (rs.next()) {
                EmpleadoDTO tt = new EmpleadoDTO();
                tt.setIdEmpleado(rs.getInt(1));
                tt.setNombres(rs.getString(2));
                tt.setApellidos(rs.getString(3));
                tt.setTelefono(rs.getString(4));
                tt.setCorreo(rs.getString(5));
                tt.setDireccion(rs.getString(6));
                tt.setFechaNacimiento(rs.getDate(7));
                tt.setNacionalidad(rs.getString(8));
                tt.setGenero(rs.getString(9).charAt(0));
                tt.setNumDocumento(rs.getString(10));
                tt.setTipoEmpleadoID(rs.getInt(11));
                tt.setEstado(rs.getInt(12));
                listaEmpleados.add(tt);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            conexion.desconectar();
        }

        return listaEmpleados;
    }

}//end EmpleadoDAO
