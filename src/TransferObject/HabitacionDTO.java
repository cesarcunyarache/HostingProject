package TransferObject;

public class HabitacionDTO {

    private int numHabitacion;
    private int tipoHabitacionID;
    private String estado;
    private String descripcion;

    public HabitacionDTO(int nHabitacion) {
        numHabitacion = nHabitacion;
    }

    public HabitacionDTO(int numHabitacion, int tipoHabitacionID, String estado, String descripcion) {
        this.numHabitacion = numHabitacion;
        this.tipoHabitacionID = tipoHabitacionID;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public HabitacionDTO(int tipoHabitacionID, String estado, String descripcion) {
        this.tipoHabitacionID = tipoHabitacionID;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public HabitacionDTO(int numHabitacion, int tipoHabitacionID, String estado) {
        this.numHabitacion = numHabitacion;
        this.tipoHabitacionID = tipoHabitacionID;
        this.estado = estado;

    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public HabitacionDTO(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public int getTipoHabitacionID() {
        return tipoHabitacionID;
    }

    public void setTipoHabitacionID(int tipoHabitacionID) {
        this.tipoHabitacionID = tipoHabitacionID;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void finalize() throws Throwable {

    }
}
