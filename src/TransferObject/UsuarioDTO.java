package TransferObject;

public class UsuarioDTO {

    private int idUsuario;
    private int empleadoID;
    private String usuario;
    private String contrasena;
    private String rol;

    public UsuarioDTO() {

    }

    public void finalize() throws Throwable {

    }

    public UsuarioDTO(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public UsuarioDTO(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public UsuarioDTO(int empleadoID, String usuario, String contrasena, String rol) {
        this.empleadoID = empleadoID;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public UsuarioDTO(int idUsuario, int empleadoID, String usuario, String contrasena, String rol) {
        this.idUsuario = idUsuario;
        this.empleadoID = empleadoID;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(int empleadoID) {
        this.empleadoID = empleadoID;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}//end UsuarioDTO
