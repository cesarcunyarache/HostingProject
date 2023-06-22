package TransferObject;

import java.sql.Date;

public class ReservaDTO {

    private int idReserva;
    private int idHabitacion;
    private int idCliente;
    private int idEmpleado;
    private Date fechaReserva;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;

    public ReservaDTO() {

    }

    public ReservaDTO(int idReserva) {
        this.idReserva = idReserva;
    }
    
    
    public ReservaDTO(int idReserva, int idHabitacion, int idCliente, int idEmpleado, Date fechaReserva, Date fechaInicio, Date fechaFin, String estado) {
        this.idReserva = idReserva;
        this.idHabitacion = idHabitacion;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.fechaReserva = fechaReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    public ReservaDTO(int idHabitacion, int idCliente, int idEmpleado, Date fechaReserva, Date fechaInicio, Date fechaFin) {
        this.idHabitacion = idHabitacion;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.fechaReserva = fechaReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
        

    public ReservaDTO(int idHabitacion, int idCliente, int idEmpleado, Date fechaInicio, Date fechaFin, String estado) {
        this.idHabitacion = idHabitacion;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.fechaReserva = fechaReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void finalize() throws Throwable {

    }
}//end ReservaHabitacionDTO
