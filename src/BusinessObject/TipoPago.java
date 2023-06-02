package BusinessObject;

import DataAccessObject.TipoPagoDAO;
import TransferObject.TipoPagoDTO;
import java.util.List;

public class TipoPago {

    private TipoPagoDTO tipoPagoDTO;
    private TipoPagoDAO tipoPagoDAO;

    public TipoPago() {
        tipoPagoDAO = new TipoPagoDAO();
    }

    public String agregar(String nombre) {
        String mensaje = "";
        tipoPagoDTO = new TipoPagoDTO(nombre);
        if (tipoPagoDAO.Create(tipoPagoDTO)) {
            mensaje = "El registro se agregó existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo agregar";
        }
        return mensaje;
    }

    public String actualizar(int idTipo, String nombre) {
        String mensaje = "";
        tipoPagoDTO = new TipoPagoDTO(idTipo, nombre);
        if (tipoPagoDAO.Update(tipoPagoDTO)) {
            mensaje = "El registro se actualizo correctamente";
        } else {
            mensaje = "ERROR: El registro no se pudo actualizar";
        }
        return mensaje;
    }

    public String eliminar(int idHabitacion) {
        String mensaje = "";
        tipoPagoDTO = new TipoPagoDTO(idHabitacion);
        if (tipoPagoDAO.Delete(tipoPagoDTO)) {
            mensaje = "El registro se eliminó correctamente";
        } else {
            mensaje = "ERROR: El registro no se pudo eliminar";
        }
        return mensaje;
    }

    public TipoPagoDTO buscar(int idHabitacion) {
        tipoPagoDTO = tipoPagoDAO.Search(new TipoPagoDTO(idHabitacion));
        if (tipoPagoDTO != null) {
            return tipoPagoDTO;
        } else {
            return null;
        }
    }
    
    
     public TipoPagoDTO buscarName(String nombre) {
        tipoPagoDTO = tipoPagoDAO.SearchName(new TipoPagoDTO(nombre));
        if (tipoPagoDTO != null) {
            return tipoPagoDTO;
        } else {
            return null;
        }
    }

    public List<TipoPagoDTO> listar() {
        if (tipoPagoDAO.Read() != null) {
            return tipoPagoDAO.Read();
        } else {
            return null;
        }
    }

}
