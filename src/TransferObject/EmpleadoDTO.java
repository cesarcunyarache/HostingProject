package TransferObject;
import java.sql.*;
public class EmpleadoDTO extends PersonaDTO {

    private int idEmpleado;
    private int TipoEmpleadoID;
    private int estado;
    private Date fechaNacimiento;

    public EmpleadoDTO(int idEmpleado, String cargo, int TipoEmpleadoID, int estado, String nombres, String apellidos, String telefono, String correo, String direccion, Date fechaNacimiento, String nacionalidad, char genero, String numDocumento) {
        super(nombres, apellidos, telefono, correo, direccion, nacionalidad, genero, numDocumento);
        this.idEmpleado = idEmpleado;
        this.fechaNacimiento = fechaNacimiento;

        this.TipoEmpleadoID = TipoEmpleadoID;
        this.estado = estado;
    }

    public EmpleadoDTO(int idEmpleado, int TipoEmpleadoID, int estado, String nombres, String apellidos, String telefono, String correo, String direccion, Date fechaNacimiento, String nacionalidad, char genero, String numDocumento) {
        super(nombres, apellidos, telefono, correo, direccion, nacionalidad, genero, numDocumento);
        this.idEmpleado = idEmpleado;
        this.TipoEmpleadoID = TipoEmpleadoID;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public EmpleadoDTO(int TipoEmpleadoID, String nombres, String apellidos, String telefono, String correo, String direccion, String nacionalidad, char genero, String numDocumento) {
        super(nombres, apellidos, telefono, correo, direccion, nacionalidad, genero, numDocumento);
        this.TipoEmpleadoID = TipoEmpleadoID;
    }

    public EmpleadoDTO(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public EmpleadoDTO(String numDocumento) {
        super(numDocumento);
    }

    public EmpleadoDTO(int TipoEmpleadoID, String nombres, String apellidos, String telefono, String correo, String direccion, Date fechaNacimiento, String nacionalidad, char genero, String numDocumento) {
        super(nombres, apellidos, telefono, correo, direccion, nacionalidad, genero, numDocumento);
        this.TipoEmpleadoID = TipoEmpleadoID;
         this.fechaNacimiento = fechaNacimiento;
        
    }

    public EmpleadoDTO(String nombres, String apellidos, String telefono, String correo, String direccion, Date fechaNacimiento, String nacionalidad, char genero, String numDocumento) {
        super(nombres, apellidos, telefono, correo, direccion, nacionalidad, genero, numDocumento);
         this.fechaNacimiento = fechaNacimiento;
    }

    public EmpleadoDTO() {
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getTipoEmpleadoID() {
        return TipoEmpleadoID;
    }

    public void setTipoEmpleadoID(int TipoEmpleadoID) {
        this.TipoEmpleadoID = TipoEmpleadoID;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    


}//end EmpleadoDTO
