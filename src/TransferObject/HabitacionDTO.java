package TransferObject;

public class HabitacionDTO {

    private int id;
    private String numHabitacion;
    private int tipoHabitacionID;
    private String estado;

    public HabitacionDTO() {
    }
    public HabitacionDTO(int id) {
        this.id = id;
    }
    
    public HabitacionDTO(String nHabitacion) {
        this.id = Integer.valueOf(nHabitacion);
    }
    
    
    public HabitacionDTO(String numHabitacion, int tipoHabitacionID, String estado) {
        this.numHabitacion = numHabitacion;
        this.tipoHabitacionID = tipoHabitacionID;
        this.estado = estado;
    }
    public HabitacionDTO(int id, String numHabitacion, int tipoHabitacionID, String estado) {
        this.id = id;
        this.numHabitacion = numHabitacion;
        this.tipoHabitacionID = tipoHabitacionID;
        this.estado = estado;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumHabitacion() {
        return numHabitacion;
    }
    public void setNumHabitacion(String numHabitacion) {
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
}//end HabitacionDTO
