package TransferObject;

public class ClienteOrganizacionDTO {

    private int id;
    private int idCliente;
    private int idOrganizacion;

    public ClienteOrganizacionDTO() {

    }

    public ClienteOrganizacionDTO(int id) {
        this.id = id;
    }

    public ClienteOrganizacionDTO(int id, int idCliente, int idOrganizacion) {
        this.id = id;
        this.idCliente = idCliente;
        this.idOrganizacion = idOrganizacion;
    }

    public ClienteOrganizacionDTO(int idCliente, int idOrganizacion) {
        this.idCliente = idCliente;
        this.idOrganizacion = idOrganizacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdOrganizacion() {
        return idOrganizacion;
    }

    public void setIdOrganizacion(int idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }

    @Override
    public String toString() {
        return "ClienteOrganizacion{" + "id=" + id + ", idCliente=" + idCliente + ", idOrganizacion=" + idOrganizacion + '}';
    }

    
    
    

    public void finalize() throws Throwable {

    }
}//end ClienteOrganizacionDTO
