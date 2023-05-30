package TransferObject;

public class TipoDocumentoDTO {

    private int idTipoDocumento;
    private String nombre;

    public TipoDocumentoDTO() {

    }

    public TipoDocumentoDTO(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public TipoDocumentoDTO(String nombre) {
        this.nombre = nombre;
    }

    public TipoDocumentoDTO(int idTipoDocumento, String nombre) {
        this.idTipoDocumento = idTipoDocumento;
        this.nombre = nombre;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public void finalize() throws Throwable {

    }
}//end TipoDocumentoDTO
