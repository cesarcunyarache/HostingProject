package BusinessObject;




import DataAccessObject.OrganizacionDAO;
import TransferObject.OrganizacionDTO;
import java.util.List;

public class Organizacion {

    private OrganizacionDAO organizacionDAO;

    public Organizacion() {
        organizacionDAO = new OrganizacionDAO();
    }

    public String Agregar(String nombre, String razonSocial, String ruc, String descripcion, String estado) {
        String mensaje = "";
        OrganizacionDTO organizacionDTO = new OrganizacionDTO(nombre, razonSocial, ruc, descripcion, estado);
        if (organizacionDAO.Create(organizacionDTO)) {
            mensaje = "El registro se agregó exitosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo agregar";
        }
        return mensaje;
    }

    public List<OrganizacionDTO> Listar() {
        return organizacionDAO.Read();
    }

    public String Actualizar(int idOrganizacion, String nombre, String razonSocial, String ruc, String descripcion, String estado) {
        String mensaje = "";
        OrganizacionDTO organizacionDTO = new OrganizacionDTO(idOrganizacion, nombre, razonSocial, ruc, descripcion, estado);
        if (organizacionDAO.Update(organizacionDTO)) {
            mensaje = "El registro se actualizó exitosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo actualizar";
        }
        return mensaje;
    }

    public String Eliminar(int idOrganizacion) {
        String mensaje = "";
        OrganizacionDTO organizacionDTO = new OrganizacionDTO(idOrganizacion);
        if (organizacionDAO.Delete(organizacionDTO)) {
            mensaje = "El registro se eliminó exitosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo eliminar";
        }
        return mensaje;
    }

    public OrganizacionDTO Buscar(int idOrganizacion) {
        OrganizacionDTO organizacionDTO = new OrganizacionDTO(idOrganizacion);
        return organizacionDAO.Search(organizacionDTO);
    }

}

