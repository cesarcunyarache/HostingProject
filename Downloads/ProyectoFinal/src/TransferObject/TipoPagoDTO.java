package TransferObject;

public class TipoPagoDTO {

    private int idTPago;
    private String nombre;

    public TipoPagoDTO() {

    }

    public TipoPagoDTO(int idTPago) {
        this.idTPago = idTPago;
    }

    public TipoPagoDTO(String nombre) {
        this.nombre = nombre;
    }

    public TipoPagoDTO(int idTPago, String nombre) {
        this.idTPago = idTPago;
        this.nombre = nombre;
    }

    public int getIdTPago() {
        return idTPago;
    }

    public void setIdTPago(int idTPago) {
        this.idTPago = idTPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "TipoPagoDTO{" + "idTPago=" + idTPago + ", nombre=" + nombre + '}';
    }
    
    

    public void finalize() throws Throwable {

    }
}//end TipoPagoDTO
