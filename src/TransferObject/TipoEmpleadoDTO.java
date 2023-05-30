package TransferObject;

public class TipoEmpleadoDTO {

    private int idTipoEmpleado;
    private String nombre;
    private Double sueldo;

    public TipoEmpleadoDTO() {

    }

    public void finalize() throws Throwable {

    }

    public TipoEmpleadoDTO(String nombre, Double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
 
    public TipoEmpleadoDTO(int idTipoEmpleado, String nombre, Double sueldo) {
        this.idTipoEmpleado = idTipoEmpleado;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public TipoEmpleadoDTO(int idTipoEmpleado) {
        this.idTipoEmpleado = idTipoEmpleado;
    }

    public int getIdTipoEmpleado() {
        return idTipoEmpleado;
    }

    public void setIdTipoEmpleado(int idTipoEmpleado) {
        this.idTipoEmpleado = idTipoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

}//end TipoEmpleadoDTO
