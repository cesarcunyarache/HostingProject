package TransferObject;

public class PagoDTO {

    private int idPago;
    private double monto;
    private int idTipo;
    private String descripcion;

    public PagoDTO() {

    }

    public PagoDTO(int idPago) {
        this.idPago = idPago;
    }

    public PagoDTO(double monto, int idTipo, String descripcion) {
        this.monto = monto;
        this.idTipo = idTipo;
        this.descripcion = descripcion;
    }

    public PagoDTO(int idPago, double monto, int idTipo, String descripcion) {
        this.idPago = idPago;
        this.monto = monto;
        this.idTipo = idTipo;
        this.descripcion = descripcion;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void finalize() throws Throwable {

    }
}//end PagoDTO
