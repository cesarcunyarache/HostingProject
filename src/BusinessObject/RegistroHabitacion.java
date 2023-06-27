package BusinessObject;

import DataAccessObject.RegistroHabitacionDAO;
import TransferObject.PagoDTO;
import TransferObject.RegistroHabitacionDTO;
import java.util.Date;
import java.util.List;

public class RegistroHabitacion {

    private RegistroHabitacionDAO registroHabitacionDAO;
    private RegistroHabitacionDTO registroHabitacionDTO;

    public RegistroHabitacion() {
        registroHabitacionDAO = new RegistroHabitacionDAO();
    }

    public String create(int idHabitacion, int idCliente, int idEmpleado, Date fechaIngreso, Date fechaSalida) {
        String mensaje = "";

        RegistroHabitacionDTO t = new RegistroHabitacionDTO(idCliente, idEmpleado, idHabitacion, fechaIngreso, fechaSalida);
        if (registroHabitacionDAO.Create(t)) {
            mensaje = "Se ha asignado correctamente la habitacion";
        } else {
            mensaje = "No se ha podido asignar";
        }
        return mensaje;
    }

    public String registrarAlquiler(int idHabitacion, int idCliente, int idEmpleado, Date fechaIngreso, Date fechaSalida, double monto, int tipoPago, String descripcion) {
        String mensaje = "";

        RegistroHabitacionDTO t = new RegistroHabitacionDTO(idCliente, idEmpleado, idHabitacion, fechaIngreso, fechaSalida);
        PagoDTO p = new PagoDTO(monto, tipoPago, descripcion);
        if (registroHabitacionDAO.registrarAlquiler(t, p)) {
            mensaje = "El alquiler se ha logrado satisfactoriamente";
        } else {
            mensaje = "Ocurrió un error";
        }
        return mensaje;
    }

    public String checkOut(int idRegistro, Date fechaSalida) {
        String mensaje = "";
        registroHabitacionDTO = new RegistroHabitacionDTO(idRegistro, fechaSalida);
        if (registroHabitacionDAO.Update(registroHabitacionDTO)) {
            mensaje = "El registro se actualizo correctamente";
        } else {
            mensaje = "ERROR: El registro no se pudo actualizar";
        }
        return mensaje;
    }

    public List<RegistroHabitacionDTO> buscarIDHabitacion(int idHabitacion) {
        registroHabitacionDTO = new RegistroHabitacionDTO();
        registroHabitacionDTO.setHabitacionID(idHabitacion);
        List<RegistroHabitacionDTO> listaIDhabitaciones = new RegistroHabitacionDAO().buscarIDhabitacion(registroHabitacionDTO);
        if (listaIDhabitaciones != null) {
            return listaIDhabitaciones;
        }
        return null;
    }

    public List<RegistroHabitacionDTO> buscarIDcliente(int idCliente) {
        registroHabitacionDTO = new RegistroHabitacionDTO();
        registroHabitacionDTO.setClienteID(idCliente);
        List<RegistroHabitacionDTO> listaIDClientes = new RegistroHabitacionDAO().buscarIDCliente(registroHabitacionDTO);
        if (listaIDClientes != null) {
            return listaIDClientes;
        }
        return null;

    }

    public List<RegistroHabitacionDTO> buscarIDEmpleado(int idEmpleado) {
        registroHabitacionDTO = new RegistroHabitacionDTO();
        registroHabitacionDTO.setEmpleadoID(idEmpleado);
        List<RegistroHabitacionDTO> listaIDEmpleados = new RegistroHabitacionDAO().buscarIDEmpleado(registroHabitacionDTO);
        if (listaIDEmpleados != null) {
            return listaIDEmpleados;
        }
        return null;
    }

    public List<RegistroHabitacionDTO> buscarFechaIngreso(Date fechaIngreso) {
        registroHabitacionDTO = new RegistroHabitacionDTO();
        registroHabitacionDTO.setFechaIngreso(fechaIngreso);
        List<RegistroHabitacionDTO> listaBuscarFechaIngreso = new RegistroHabitacionDAO().buscarFechaIngreso(registroHabitacionDTO);
        if (listaBuscarFechaIngreso != null) {
            return listaBuscarFechaIngreso;
        }
        return null;

    }

    public List<RegistroHabitacionDTO> buscarFechaSalida(Date fechaSalida) {
        registroHabitacionDTO = new RegistroHabitacionDTO();
        registroHabitacionDTO.setFechaSalida(fechaSalida);
        List<RegistroHabitacionDTO> listaBuscarFechaIngreso = new RegistroHabitacionDAO().buscarFechaSalida(registroHabitacionDTO);
        if (listaBuscarFechaIngreso != null) {
            return listaBuscarFechaIngreso;
        }
        return null;

    }

    public String actualizar(int idHabitacion, int idCliente, int idEmpleado, Date fechaIngreso, Date fechaSalida) {
        return "";
    }

    public List<RegistroHabitacionDTO> listar() {
        if (registroHabitacionDAO.Read() != null) {
            return registroHabitacionDAO.Read();
        } else {
            return null;
        }
    }
}
