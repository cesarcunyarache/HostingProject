package TransferObject;

public class ClienteDTO extends PersonaDTO {

    private int idCliente;
    private int tipoDocumentoID;
    

    public ClienteDTO() {

    }

    public ClienteDTO(int idCliente) {
        this.idCliente = idCliente;
    }

    public ClienteDTO(String numDocumento) {
        super(numDocumento);
    }

    
    public ClienteDTO(int idCliente, String numDocumento) {
        super(numDocumento);
        this.idCliente = idCliente;
    }

    public ClienteDTO(String numDocumento, int tipoDocumentoID, String nombres, String apellidos, String telefono, String nacionalidad, String correo, String direccion, char genero) {
        super(nombres, apellidos, telefono, correo, direccion, nacionalidad, genero, numDocumento);
        this.tipoDocumentoID = tipoDocumentoID;
    }

    public ClienteDTO(int idCliente, String numDocumento, int tipoDocumentoID, String nombres, String apellidos, String telefono, String nacionalidad, String correo, String direccion, char genero) {
        super(nombres, apellidos, telefono, correo, direccion, nacionalidad, genero, numDocumento);
        this.idCliente = idCliente;
        this.tipoDocumentoID = tipoDocumentoID;
    }
    
    

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getTipoDocumentoID() {
        return tipoDocumentoID;
    }

    public void setTipoDocumentoID(int tipoDocumentoID) {
        this.tipoDocumentoID = tipoDocumentoID;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" + "idCliente=" + idCliente + ", tipoDocumentoID=" + tipoDocumentoID + '}';
    }
    
    
    

    public void finalize() throws Throwable {
        super.finalize();
    }
}//end ClienteDTO
