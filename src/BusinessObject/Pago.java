package BusinessObject;

import DataAccessObject.PagoDAO;
import TransferObject.PagoDTO;
import java.util.List;

public class Pago {

    private PagoDTO pagoDTO;
    private PagoDAO pagoDAO;

    public Pago() {
        pagoDAO = new PagoDAO();
    }

    public String agregar(double monto, int idTipo, String descripcion) {
        String mensaje = "";
        pagoDTO = new PagoDTO(monto, idTipo, descripcion);
        if (pagoDAO.Create(pagoDTO)) {
            mensaje = "El registro se agregó existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo agregar";
        }
        return mensaje;
    }

    public String actualizar(int idPago, double monto, int idTipo, String descripcion) {
        String mensaje = "";
        pagoDTO = new PagoDTO(idPago, monto, idTipo, descripcion);
        if (pagoDAO.Update(pagoDTO)) {
            mensaje = "El registro se actualizo correctamente";
        } else {
            mensaje = "ERROR: El registro no se pudo actualizar";
        }
        return mensaje;
    }

    public String eliminar(int idHabitacion) {
        String mensaje = "";
        pagoDTO = new PagoDTO(idHabitacion);
        if (pagoDAO.Delete(pagoDTO)) {
            mensaje = "El registro se eliminó correctamente";
        } else {
            mensaje = "ERROR: El registro no se pudo eliminar";
        }
        return mensaje;
    }

    public PagoDTO buscar(int idHabitacion) {
        pagoDTO = pagoDAO.Search(new PagoDTO(idHabitacion));
        if (pagoDTO != null) {
            return pagoDTO;
        } else {
            return null;
        }
    }

    public List<PagoDTO> listar() {
        if (pagoDAO.Read() != null) {
            return pagoDAO.Read();
        } else {
            return null;
        }
    }
}
