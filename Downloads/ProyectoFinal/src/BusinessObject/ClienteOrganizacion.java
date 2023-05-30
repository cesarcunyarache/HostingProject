package BusinessObject;

import DataAccessObject.ClienteOrganizacionDAO;
import TransferObject.ClienteOrganizacionDTO;
import java.util.List;

public class ClienteOrganizacion {

    private ClienteOrganizacionDTO clienteOrganizacionDTO;
    private ClienteOrganizacionDAO clienteOrganizacionDAO;

    public ClienteOrganizacion() {
        clienteOrganizacionDAO = new ClienteOrganizacionDAO();
    }

    public String Agregar(int idCliente, int idOrganizacion) {
        String mensaje = "";
        clienteOrganizacionDTO = new ClienteOrganizacionDTO(idCliente, idOrganizacion);
        if (clienteOrganizacionDAO.Create(clienteOrganizacionDTO)) {
            mensaje = "El registro se agregó exitosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo agregar";
        }
        return mensaje;
    }

    public List<ClienteOrganizacionDTO> Listar() {
        if (clienteOrganizacionDAO.Read() != null) {
            return clienteOrganizacionDAO.Read();
        } else {
            return null;
        }
    }

    public String Actualizar(int id, int idCliente, int idOrganizacion) {
        String mensaje = "";
        clienteOrganizacionDTO = new ClienteOrganizacionDTO(id, idCliente, idOrganizacion);
        if (clienteOrganizacionDAO.Update(clienteOrganizacionDTO)) {
            mensaje = "El registro se actualizó exitosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo actualizar";
        }
        return mensaje;
    }

    public String Eliminar(int id) {
        String mensaje = "";
        clienteOrganizacionDTO = new ClienteOrganizacionDTO(id);
        if (clienteOrganizacionDAO.Delete(clienteOrganizacionDTO)) {
            mensaje = "El registro se eliminó exitosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo eliminar";
        }
        return mensaje;
    }

    public ClienteOrganizacionDTO Buscar(int id) {
        clienteOrganizacionDTO = new ClienteOrganizacionDTO(id);
        if (clienteOrganizacionDAO.Search(clienteOrganizacionDTO) != null) {
            return clienteOrganizacionDAO.Search(clienteOrganizacionDTO);
        } else {
            return null;
        }
    }
}
