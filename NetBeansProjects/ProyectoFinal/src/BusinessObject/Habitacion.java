package BusinessObject;

//package BusinessObject;
//
//import DataAccessObject.HabitacionDAO;
//import TransferObject.HabitacionDTO;
//import java.util.List;
//
//public class Habitacion {
//
//    private HabitacionDAO habitacionDAO;
//    private HabitacionDTO habitacionDTO;
//
//    public Habitacion() {
//        habitacionDAO = new HabitacionDAO();
//    }
//
//    public void finalize() throws Throwable {
//
//    }
//
//    public String agregar(int tipoHabitacion, String estadoHabitacion) {
//        String mensaje = "";
//        habitacionDTO = new HabitacionDTO(tipoHabitacion, estadoHabitacion);
//        if (habitacionDAO.agregar(habitacionDTO)) {
//            mensaje = "El registro se agregó existosamente";
//        } else {
//            mensaje = "ERROR: El registro no se pudo agregar";
//        }
//        return mensaje;
//    }
//
//    public String actualizar(int idHabitacion, int tipoHabitacion, String estadoHabitacion) {
//        String mensaje = "";
//        habitacionDTO = new HabitacionDTO(idHabitacion, tipoHabitacion, estadoHabitacion);
//        if (habitacionDAO.actualizar(habitacionDTO)) {
//            mensaje = "El registro se actualizo correctamente";
//        } else {
//            mensaje = "ERROR: El registro no se pudo actualizar";
//        }
//        return mensaje;
//    }
//
//    public boolean actualizarEstado(int idHabitacion, int cambio) {
//        //1 para asignacion
//        //2 para registro
//        HabitacionDTO t = new HabitacionDTO();
//        t.setNumeroHabitacion(idHabitacion);
//        return habitacionDAO.actualizarEstado(t, cambio);
//    }
//
//    public String eliminar(int idHabitacion) {
//        return "";
//    }
//
//    public HabitacionDTO buscar(int idHabitacion) {
//        return null;
//    }
//
//    public List<HabitacionDTO> listarR() {
//        if (habitacionDAO.listar() != null) {
//            return habitacionDAO.listar();
//        } else {
//            return null;
//        }
//    }
//
//    public List<HabitacionDTO> listar(int idTipo) {
//        HabitacionDTO t = new HabitacionDTO();
//        t.setTipoHabitacion(idTipo);
//        if (habitacionDAO.listarPorTipo(t) != null) {
//            return habitacionDAO.listarPorTipo(t);
//        } else {
//            return null;
//        }
//    }
//}//end Habitacion
