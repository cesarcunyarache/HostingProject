package TransferObject;

public class TipoHabitacionDTO {

    private int idTipo;
    private String nombre;
    private double precio;

    public TipoHabitacionDTO() {

    }

    public TipoHabitacionDTO(int idTipo) {
        this.idTipo = idTipo;
    }

    public TipoHabitacionDTO(int idTipo, String nombre, double precio) {
        this.idTipo = idTipo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public TipoHabitacionDTO(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public void finalize() throws Throwable {

    }
}//end TipoHabitacionDTO
