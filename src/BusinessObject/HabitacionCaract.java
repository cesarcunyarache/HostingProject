package BusinessObject;

import DataAccessObject.HabitacionCaractDAO;
import TransferObject.HabitacionCaractDTO;
import java.util.List;

/**
 *
 * @author chero
 */
public class HabitacionCaract {

    private HabitacionCaractDAO hCaracteristicaDAO;
    private HabitacionCaractDTO hCaracteristicaDTO;

    public HabitacionCaract() {
        hCaracteristicaDAO = new HabitacionCaractDAO();
    }

    public String Agregar(int idHabitacion, int idCaracteristica) {
        String mensaje = "";
        hCaracteristicaDTO = new HabitacionCaractDTO(idHabitacion, idCaracteristica);
        if (hCaracteristicaDAO.Create(hCaracteristicaDTO)) {
            mensaje = "El registro se agregó existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo agregar";
        }
        return mensaje;
    }

    public List<HabitacionCaractDTO> Listar() {
        if (hCaracteristicaDAO.Read() != null) {
            return hCaracteristicaDAO.Read();
        } else {
            return null;
        }
    }

    public String Actualizar(int id, int idHabitacion, int idCaracteristica) {
        String mensaje = "";
        hCaracteristicaDTO = new HabitacionCaractDTO(id, idHabitacion, idCaracteristica);
        if (hCaracteristicaDAO.Update(hCaracteristicaDTO)) {
            mensaje = "El registro se actualizo existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo actualizar";
        }
        return mensaje;
    }

    public String Eliminar(int id) {
        String mensaje = "";
        hCaracteristicaDTO = new HabitacionCaractDTO(id);
        if (hCaracteristicaDAO.Delete(hCaracteristicaDTO)) {
            mensaje = "El registro se eliminó existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo eliminar";
        }
        return mensaje;
    }

    public HabitacionCaractDTO Buscar(int id) {
        hCaracteristicaDTO = new HabitacionCaractDTO(id);
        if (hCaracteristicaDAO.Search(hCaracteristicaDTO) != null) {
            return hCaracteristicaDAO.Search(hCaracteristicaDTO);
        } else {
            return null;
        }

    }
}
