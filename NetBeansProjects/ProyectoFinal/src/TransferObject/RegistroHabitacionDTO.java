package TransferObject;

import java.util.Date;

public class RegistroHabitacionDTO {

    private int idRegistroHabitacion;
    private int ClienteID;
    private int EmpleadoID;
    private int HabitacionID;
    private Date fechaIngreso;
    private Date fechaSalida;

    public RegistroHabitacionDTO() {

    }

    public void finalize() throws Throwable {

    }

    public RegistroHabitacionDTO(int idRegistroHabitacion, int ClienteID, int EmpleadoID, int HabitacionID, Date fechaIngreso, Date fechaSalida) {
        this.idRegistroHabitacion = idRegistroHabitacion;
        this.ClienteID = ClienteID;
        this.EmpleadoID = EmpleadoID;
        this.HabitacionID = HabitacionID;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public int getIdRegistroHabitacion() {
        return idRegistroHabitacion;
    }

    public void setIdRegistroHabitacion(int idRegistroHabitacion) {
        this.idRegistroHabitacion = idRegistroHabitacion;
    }

    public int getClienteID() {
        return ClienteID;
    }

    public void setClienteID(int ClienteID) {
        this.ClienteID = ClienteID;
    }

    public int getEmpleadoID() {
        return EmpleadoID;
    }

    public void setEmpleadoID(int EmpleadoID) {
        this.EmpleadoID = EmpleadoID;
    }

    public int getHabitacionID() {
        return HabitacionID;
    }

    public void setHabitacionID(int HabitacionID) {
        this.HabitacionID = HabitacionID;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

}//end RegistroHabitacionDTO
