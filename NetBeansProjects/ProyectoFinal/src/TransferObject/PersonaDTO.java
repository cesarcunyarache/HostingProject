package TransferObject;

public class PersonaDTO {

    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;
    private String direccion;
    private int edad;
    private String nacionalidad;
    private char genero;
    private String numDocumento;

    public PersonaDTO() {
    }

    public PersonaDTO(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public PersonaDTO(String nombres, String apellidos, String telefono, String correo, String direccion, int edad, String nacionalidad, char genero, String numDocumento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.numDocumento = numDocumento;
    }

    public PersonaDTO(String nombres, String apellidos, String telefono, String correo, String direccion, String nacionalidad, char genero, String numDocumento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.numDocumento = numDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    @Override
    public String toString() {
        return "PersonaDTO{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono + ", correo=" + correo + ", direccion=" + direccion + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", genero=" + genero + ", numDocumento=" + numDocumento + '}';
    }

}//end PersonaDTO
