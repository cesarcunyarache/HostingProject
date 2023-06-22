package BusinessObject;

import DataAccessObject.HabitacionDAO;
import TransferObject.HabitacionDTO;
import java.util.List;

public class Habitacion {

    private HabitacionDAO habitacionDAO;
    private HabitacionDTO habitacionDTO;

    public Habitacion() {
        habitacionDAO = new HabitacionDAO();
    }

    public void finalize() throws Throwable {

    }

    public String agregar(String numHabitacion, int tipoHabitacion, String estadoHabitacion) {
        String mensaje = "";
        habitacionDTO = new HabitacionDTO(numHabitacion, tipoHabitacion, estadoHabitacion);
        if (habitacionDAO.Create(habitacionDTO)) {
            mensaje = "El registro se agregó existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo agregar";
        }
        return mensaje;
    }

    public String actualizar(int idHabitacion, String numHabitacion, int tipoHabitacion, String estadoHabitacion) {
        String mensaje = "";
        habitacionDTO = new HabitacionDTO(idHabitacion, numHabitacion, tipoHabitacion, mensaje);
        if (habitacionDAO.Update(habitacionDTO)) {
            mensaje = "El registro se actualizo correctamente";
        } else {
            mensaje = "ERROR: El registro no se pudo actualizar";
        }
        return mensaje;
    }

    public String eliminar(int idHabitacion) {
        String mensaje = "";
        habitacionDTO = new HabitacionDTO(idHabitacion);
        if (habitacionDAO.Delete(habitacionDTO)) {
            mensaje = "El registro se eliminó correctamente";
        } else {
            mensaje = "ERROR: El registro no se pudo eliminar";
        }
        return mensaje;
    }

    public HabitacionDTO buscar(int idHabitacion) {
        habitacionDTO = habitacionDAO.Search(new HabitacionDTO(idHabitacion));
        if (habitacionDTO != null) {
            return habitacionDTO;
        } else {
            return null;
        }
    }
    
    
    public HabitacionDTO buscar(String nHabitacion) {
        habitacionDTO = habitacionDAO.SearchNHabitacion(new HabitacionDTO(nHabitacion));
        if (habitacionDTO != null) {
            return habitacionDTO;
        } else {
            return null;
        }
    }

    public List<HabitacionDTO> listarR() {
        if (habitacionDAO.Read() != null) {
            return habitacionDAO.Read();
        } else {
            return null;
        }
    }

    public List<HabitacionDTO> listarR(String filtro) {
        if (habitacionDAO.Read() != null) {
            return habitacionDAO.Read(filtro);
        } else {
            return null;
        }
    }

    public HabitacionDAO getHabitacionDAO() {
        return habitacionDAO;
    }

    public void setHabitacionDAO(HabitacionDAO habitacionDAO) {
        this.habitacionDAO = habitacionDAO;
    }

    public HabitacionDTO getHabitacionDTO() {
        return habitacionDTO;
    }

    public void setHabitacionDTO(HabitacionDTO habitacionDTO) {
        this.habitacionDTO = habitacionDTO;
    }
    
}
