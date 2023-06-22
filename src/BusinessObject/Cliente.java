package BusinessObject;

import TransferObject.ClienteDTO;
import DataAccessObject.ClienteDAO;
import java.util.List;

public class Cliente {

    private ClienteDAO clienteDAO;

    public Cliente() {
        clienteDAO = new ClienteDAO();
    }

    public String Agregar(String numDocumento, int tipoDocumentoID, String nombres, String apellidos, String telefono, String nacionalidad, String correo, String direccion, char genero) {
        String mensaje = "";
        ClienteDTO clienteDTO = new ClienteDTO(numDocumento, tipoDocumentoID, nombres, apellidos, telefono, nacionalidad, correo, direccion, genero);
        if (clienteDAO.Create(clienteDTO)) {
            mensaje = "El cliente se agregó exitosamente";
        } else {
            mensaje = "ERROR: El cliente no se pudo agregar";
        }
        return mensaje;
    }

    public List<ClienteDTO> Listar() {
        return clienteDAO.Read();
    }

    public String Actualizar(int idCliente, String numDocumento, int tipoDocumentoID, String nombres, String apellidos, String telefono, String nacionalidad, String correo, String direccion, char genero) {
        String mensaje = "";
        ClienteDTO clienteDTO = new ClienteDTO(idCliente, numDocumento, tipoDocumentoID, nombres, apellidos, telefono, nacionalidad, correo, direccion, genero);
        if (clienteDAO.Update(clienteDTO)) {
            mensaje = "El cliente se actualizó exitosamente";
        } else {
            mensaje = "ERROR: El cliente no se pudo actualizar";
        }
        return mensaje;
    }

    public String Eliminar(int idCliente) {
        String mensaje = "";
        ClienteDTO clienteDTO = new ClienteDTO(idCliente);
        if (clienteDAO.Delete(clienteDTO)) {
            mensaje = "El cliente se eliminó exitosamente";
        } else {
            mensaje = "ERROR: El cliente no se pudo eliminar";
        }
        return mensaje;
    }

    public ClienteDTO Buscar(int id) {
        ClienteDTO clienteDTO = new ClienteDTO(id);
        ClienteDTO obj = null;
        if (clienteDAO.Search(clienteDTO) != null) {
            obj = clienteDAO.Search(clienteDTO);
        }
        return obj;
    }

    public ClienteDTO BuscarDNI(String numDoc) {
        ClienteDTO clienteDTO = new ClienteDTO(numDoc);
        ClienteDTO obj = null;
        if (clienteDAO.SearchDNI(clienteDTO) != null) {
            obj = clienteDAO.SearchDNI(clienteDTO);
        }
        return obj;
    }
}
