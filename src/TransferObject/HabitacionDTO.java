package TransferObject;

public class HabitacionDTO {

    private int numHabitacion;
    private int tipoHabitacionID;
    private String estado;

    public HabitacionDTO(int nHabitacion) {
        numHabitacion = nHabitacion;
    }
    
    public HabitacionDTO(int numHabitacion, int tipoHabitacionID, String estado) {
        this.numHabitacion = numHabitacion;
        this.tipoHabitacionID = tipoHabitacionID;
        this.estado = estado;
    }
    
    public int getNumHabitacion() {
        return numHabitacion;
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
