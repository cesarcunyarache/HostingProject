package BusinessObject;

import DataAccessObject.CaracteristicaHabitacionDAO;
import TransferObject.CaracteristicaHabitacionDTO;
import java.util.List;

public class CaracteristicaHabitacion {

    private CaracteristicaHabitacionDAO cHabitacionDAO;
    private CaracteristicaHabitacionDTO cHabitacionDTO;

    public CaracteristicaHabitacion() {
        cHabitacionDAO = new CaracteristicaHabitacionDAO();
    }

    public String Agregar(String nombre, double sueldo) {
        String mensaje = "";
        cHabitacionDTO = new CaracteristicaHabitacionDTO(nombre, sueldo);
        if (cHabitacionDAO.Create(cHabitacionDTO)) {
            mensaje = "El registro se agregó existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo agregar";
        }
        return mensaje;
    }

    public List<CaracteristicaHabitacionDTO> Listar() {
        if (cHabitacionDAO.Read() != null) {
            return cHabitacionDAO.Read();
        } else {
            return null;
        }
    }

    public String Actualizar(int id, String nombre, Double sueldo) {
        String mensaje = "";
        cHabitacionDTO = new CaracteristicaHabitacionDTO(id, nombre, sueldo);
        if (cHabitacionDAO.Update(cHabitacionDTO)) {
            mensaje = "El registro se actualizo existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo actualizar";
        }
        return mensaje;
    }

    public String Eliminar(int id) {
        String mensaje = "";
        cHabitacionDTO = new CaracteristicaHabitacionDTO(id);
        if (cHabitacionDAO.Delete(cHabitacionDTO)) {
            mensaje = "El registro se eliminó existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo eliminar";
        }
        return mensaje;
    }

    public CaracteristicaHabitacionDTO Buscar(int id) {
        cHabitacionDTO = new CaracteristicaHabitacionDTO(id);
        if (cHabitacionDAO.Search(cHabitacionDTO) != null) {
            return cHabitacionDAO.Search(cHabitacionDTO);
        } else {
            return null;
        }

    }
}
