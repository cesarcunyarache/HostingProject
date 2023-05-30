
package BusinessObject;

import DataAccessObject.TipoHabitacionDAO;
import TransferObject.TipoHabitacionDTO;
import java.util.List;

public class TipoHabitacion {

    private TipoHabitacionDAO tipoHabitacionDAO;
    private TipoHabitacionDTO tipoHabitacionDTO;

    public TipoHabitacion() {
        tipoHabitacionDAO = new TipoHabitacionDAO();
    }

    public String agregar(String nombre, double precio) {
        String mensaje = "";
        tipoHabitacionDTO = new TipoHabitacionDTO(nombre, precio);
        if (tipoHabitacionDAO.Create(tipoHabitacionDTO)) {
            mensaje = "El registro se agregó existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo agregar";
        }
        return mensaje;
    }

    public String actualizar(int idTipo, String nombre, double precio) {
        String mensaje = "";
        tipoHabitacionDTO = new TipoHabitacionDTO(idTipo, nombre, precio);
        if (tipoHabitacionDAO.Update(tipoHabitacionDTO)) {
            mensaje = "El registro se actualizo correctamente";
        } else {
            mensaje = "ERROR: El registro no se pudo actualizar";
        }
        return mensaje;
    }

    public String eliminar(int idHabitacion) {
        String mensaje = "";
        tipoHabitacionDTO = new TipoHabitacionDTO(idHabitacion);
        if (tipoHabitacionDAO.Delete(tipoHabitacionDTO)) {
            mensaje = "El registro se eliminó correctamente";
        } else {
            mensaje = "ERROR: El registro no se pudo eliminar";
        }
        return mensaje;
    }

    public TipoHabitacionDTO buscar(int idHabitacion) {
        tipoHabitacionDTO = tipoHabitacionDAO.Search(new TipoHabitacionDTO(idHabitacion));
        if (tipoHabitacionDTO != null) {
            return tipoHabitacionDTO;
        } else {
            return null;
        }
    }

    public List<TipoHabitacionDTO> listar() {
        if (tipoHabitacionDAO.Read() != null) {
            return tipoHabitacionDAO.Read();
        } else {
            return null;
        }
    }
}
