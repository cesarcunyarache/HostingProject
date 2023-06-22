package BusinessObject;

import DataAccessObject.ReservaDAO;
import TransferObject.ReservaDTO;
import java.sql.Date;
import java.util.List;

public class Reserva {

    private ReservaDTO reservaDTO;
    private ReservaDAO reservaDAO;

    public Reserva() {
        reservaDAO = new ReservaDAO();
    }

    public String create(int idHabitacion, int idCliente, int idEmpleado, Date fechaReserva, Date fechaInicio, Date fechaFin) {
        String mensaje = "";

        ReservaDTO t = new ReservaDTO(idHabitacion, idCliente, idEmpleado, fechaReserva, fechaInicio, fechaFin);
        if (reservaDAO.Create(t)) {
            mensaje = "Se ha asignado correctamente la habitacion";
        } else {
            mensaje = "No se ha podido asignar";
        }
        return mensaje;
    }

    public String eliminar(int idHabitacion, int idCliente, int idEmpleado, Date fechaIngreso) {
        return "";
    }

    public ReservaDTO buscarIDregistro(int idReserva) {
        ReservaDTO t = new ReservaDTO();
        t.setIdReserva(idReserva);
        if (reservaDAO.Search(t) != null) {
            return reservaDAO.Search(t);
        } else {
            return null;
        }
    }

    public String actualizar(int idReserva, int idHabitacion, int idCliente, int idEmpleado, Date fechaReserva, Date fechaInicio, Date fechaFin, String estado) {
        String mensaje = "";
        reservaDTO = new ReservaDTO(idReserva, idHabitacion, idCliente, idEmpleado, fechaReserva, fechaInicio, fechaFin, estado);
        if (reservaDAO.Update(reservaDTO)) {
            mensaje = "El registro se actualizo correctamente";
        } else {
            mensaje = "ERROR: El registro no se pudo actualizar";
        }
        return mensaje;
    }

    public String actualizar(int idHabitacion, int idCliente, int idEmpleado, Date fechaIngreso, Date fechaSalida) {
        return "";
    }

    public List<ReservaDTO> listar() {
        if (reservaDAO.Read() != null) {
            return reservaDAO.Read();
        } else {
            return null;
        }
    }
}
