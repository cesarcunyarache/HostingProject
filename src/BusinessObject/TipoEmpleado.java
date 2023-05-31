package BusinessObject;

import java.util.List;
import TransferObject.TipoEmpleadoDTO;
import DataAccessObject.TipoEmpleadoDAO;

public class TipoEmpleado {

    private TipoEmpleadoDTO tipoEmpleadoDTO;
    private TipoEmpleadoDAO tipoEmpleadoDAO;

    public TipoEmpleado() {
        tipoEmpleadoDAO = new TipoEmpleadoDAO();
    }

    public String Agregar(String nombre, double sueldo) {
        String mensaje = "";
        tipoEmpleadoDTO = new TipoEmpleadoDTO(nombre, sueldo);
        if (tipoEmpleadoDAO.Create(tipoEmpleadoDTO)) {
            mensaje = "El registro se agregó existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo agregar";
        }
        return mensaje;
    }

    public List<TipoEmpleadoDTO> Listar() {
        if (tipoEmpleadoDAO.Read() != null) {
            return tipoEmpleadoDAO.Read();
        } else {
            return null;
        }
    }

    public String Actualizar(int id, String nombre, Double sueldo) {
        String mensaje = "";
        tipoEmpleadoDTO = new TipoEmpleadoDTO(id, nombre, sueldo);
        if (tipoEmpleadoDAO.Update(tipoEmpleadoDTO)) {
            mensaje = "El registro se actualizo existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo actualizar";
        }
        return mensaje;
    }

    public String Eliminar(int id) {
        String mensaje = "";
        tipoEmpleadoDTO = new TipoEmpleadoDTO(id);
        if (tipoEmpleadoDAO.Delete(tipoEmpleadoDTO)) {
            mensaje = "El registro se eliminó existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo eliminar";
        }
        return mensaje;
    }

    public TipoEmpleadoDTO Buscar(int id) {
        tipoEmpleadoDTO = new TipoEmpleadoDTO(id);
        if (tipoEmpleadoDAO.Search(tipoEmpleadoDTO) != null) {
            return tipoEmpleadoDAO.Search(tipoEmpleadoDTO);
        } else {
            return null;
        }

    }

    public TipoEmpleadoDTO BuscarName(String name) {
        tipoEmpleadoDTO = new TipoEmpleadoDTO(name);
        if (tipoEmpleadoDAO.SearchName(tipoEmpleadoDTO) != null) {
            return tipoEmpleadoDAO.Search(tipoEmpleadoDTO);
        } else {
            return null;
        }

    }

}
