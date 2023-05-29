package BusinessObject;



import java.util.List;
import TransferObject.TipoDocumentoDTO;
import DataAccessObject.TipoDocumentoDAO;

public class TipoDocumento {

    private TipoDocumentoDTO tipoDocumentoDTO;
    private TipoDocumentoDAO tipoDocumentoDAO;

    public TipoDocumento() {
        tipoDocumentoDAO = new TipoDocumentoDAO();
    }

    public String Agregar(String nombre) {
        String mensaje = "";
        tipoDocumentoDTO = new TipoDocumentoDTO(nombre);
        if (tipoDocumentoDAO.Create(tipoDocumentoDTO)) {
            mensaje = "El registro se agregó existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo agregar";
        }
        return mensaje;
    }
    
    public List<TipoDocumentoDTO> Listar() {
        if (tipoDocumentoDAO.Read() != null) {
            return tipoDocumentoDAO.Read();
        } else {
            return null;
        }
    }


    public String Actualizar(int id, String nombre) {
        String mensaje = "";
        tipoDocumentoDTO =  new TipoDocumentoDTO(id, nombre);
        if (tipoDocumentoDAO.Update(tipoDocumentoDTO)) {
            mensaje = "El registro se actualizo existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo actualizar";
        }
        return mensaje;
    }

    public String Eliminar(int id) {
        String mensaje = "";
        tipoDocumentoDTO = new TipoDocumentoDTO(id);
        if (tipoDocumentoDAO.Delete(tipoDocumentoDTO)) {
            mensaje = "El registro se eliminó existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo eliminar";
        }
        return mensaje;
    }
    
    public TipoDocumentoDTO Buscar (int id){
        tipoDocumentoDTO =  new TipoDocumentoDTO(id);
        if (tipoDocumentoDAO.Search(tipoDocumentoDTO)!= null){
            return tipoDocumentoDAO.Search(tipoDocumentoDTO);
        } else {
            return null;
        }
         
    }

    
}
