package TransferObject;

public class EmpleadoDTO extends PersonaDTO {

    private int idEmpleado;
    private int TipoEmpleadoID;
    private int estado;

    public EmpleadoDTO(int idEmpleado, String cargo, int TipoEmpleadoID, int estado, String nombres, String apellidos, String telefono, String correo, String direccion, int edad, String nacionalidad, char genero, String numDocumento) {
        super(nombres, apellidos, telefono, correo, direccion, edad, nacionalidad, genero, numDocumento);
        this.idEmpleado = idEmpleado;

        this.TipoEmpleadoID = TipoEmpleadoID;
        this.estado = estado;
    }

    public EmpleadoDTO(int idEmpleado, int TipoEmpleadoID, int estado, String nombres, String apellidos, String telefono, String correo, String direccion, int edad, String nacionalidad, char genero, String numDocumento) {
        super(nombres, apellidos, telefono, correo, direccion, edad, nacionalidad, genero, numDocumento);
        this.idEmpleado = idEmpleado;
        this.TipoEmpleadoID = TipoEmpleadoID;
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

    public EmpleadoDTO(int TipoEmpleadoID, String nombres, String apellidos, String telefono, String correo, String direccion, int edad, String nacionalidad, char genero, String numDocumento) {
        super(nombres, apellidos, telefono, correo, direccion, edad, nacionalidad, genero, numDocumento);
        this.TipoEmpleadoID = TipoEmpleadoID;
    }

    public EmpleadoDTO(String nombres, String apellidos, String telefono, String correo, String direccion, int edad, String nacionalidad, char genero, String numDocumento) {
        super(nombres, apellidos, telefono, correo, direccion, edad, nacionalidad, genero, numDocumento);
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


}//end EmpleadoDTO
