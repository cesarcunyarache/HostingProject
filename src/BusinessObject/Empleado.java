package BusinessObject;

import DataAccessObject.EmpleadoDAO;
import TransferObject.EmpleadoDTO;
import java.util.List;
import java.sql.*;

public class Empleado {

    private EmpleadoDAO empleadoDAO;
    private EmpleadoDTO empleadoDTO;

    public Empleado() {
        empleadoDAO = new EmpleadoDAO();
    }

    public String agregar(int tipoEmpleadoID, String nombre, String apellido, String telefono, String correo, String direccion, Date fecha, String nacionalidad, char genero, String numDoc) {
        String mensaje = "";
        empleadoDTO = new EmpleadoDTO(
                tipoEmpleadoID,
                nombre,
                apellido,
                telefono,
                correo,
                direccion,
                fecha,
                nacionalidad,
                genero,
                numDoc);
        if (empleadoDAO.Create(empleadoDTO)) {
            mensaje = "El registro se agregó existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo agregar";
        }
        return mensaje;
    }

    public EmpleadoDTO buscarPorID(int idEmpleado) {
        empleadoDTO = empleadoDAO.Search(new EmpleadoDTO(idEmpleado));
        if (empleadoDTO != null) {
            return empleadoDTO;
        } else {
            return null;
        }
    }

    public EmpleadoDTO buscarPorDNI(String dni) {

        EmpleadoDTO nue = null;
        nue = empleadoDAO.SearchDNI(new EmpleadoDTO(dni));
        if (nue != null) {
            return nue;
        } else {
            return null;
        }
    }

    public String actualizar(int idEmpleado,
            int tipoEmpleadoID,
            String nombre,
            String apellido,
            String telefono,
            String correo,
            String direccion,
            Date fecha,
            String nacionalidad,
            char genero,
            String numDoc,
            int estado) {

        String mensaje = "";
        empleadoDTO = new EmpleadoDTO(idEmpleado, tipoEmpleadoID, estado, nombre, apellido, telefono, correo, direccion, fecha, nacionalidad, genero, numDoc);
        System.out.println("Tercer fecha " + empleadoDTO.getFechaNacimiento());
        if (empleadoDAO.Update(empleadoDTO)) {
            mensaje = "El registro se actualizo correctamente";
        } else {
            mensaje = "ERROR: El registro no se pudo actualizar";
        }
        return mensaje;
    }

    public List<EmpleadoDTO> listar() {
        if (empleadoDAO.Read() != null) {
            return empleadoDAO.Read();
        } else {
            return null;
        }
    }

    //Busquedas 
    public List<EmpleadoDTO> buscarPorNombre(String nombre) {
        EmpleadoDTO emp = new EmpleadoDTO();
        emp.setNombres(nombre);
        if (empleadoDAO.buscarNombres(emp) != null) {
            return empleadoDAO.buscarNombres(emp);
        } else {
            return null;
        }
    }

    public List<EmpleadoDTO> buscarPorApellido(String apellidos) {
        EmpleadoDTO emp = new EmpleadoDTO();
        emp.setApellidos(apellidos);
        if (empleadoDAO.buscarApellidos(emp) != null) {
            return empleadoDAO.buscarApellidos(emp);
        } else {
            return null;
        }
    }

    public List<EmpleadoDTO> buscarPorTelefono(String telefono) {
        EmpleadoDTO emp = new EmpleadoDTO();
        emp.setTelefono(telefono);
        if (empleadoDAO.buscarTelefono(emp) != null) {
            return empleadoDAO.buscarTelefono(emp);
        } else {
            return null;
        }
    }

    public List<EmpleadoDTO> buscarPorDniFiltro(String dni) {
        EmpleadoDTO emp = new EmpleadoDTO();
        emp.setNumDocumento(dni);
        if (empleadoDAO.buscarDniFiltro(emp) != null) {
            return empleadoDAO.buscarDniFiltro(emp);
        } else {
            return null;
        }
    }

    public List<EmpleadoDTO> buscarPorNacionalidad(String nacionalidad) {
        EmpleadoDTO emp = new EmpleadoDTO();
        emp.setNacionalidad(nacionalidad);
        if (empleadoDAO.buscarNacionalidad(emp) != null) {
            return empleadoDAO.buscarNacionalidad(emp);
        } else {
            return null;
        }
    }

    public List<EmpleadoDTO> buscarPorCorreo(String correo) {
        EmpleadoDTO emp = new EmpleadoDTO();
        emp.setCorreo(correo);
        if (empleadoDAO.buscarCorreo(emp) != null) {
            return empleadoDAO.buscarCorreo(emp);
        } else {
            return null;
        }
    }
}
