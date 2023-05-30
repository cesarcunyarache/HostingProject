package TransferObject;

public class OrganizacionDTO {

    private int idOrganizacion;
    private String nombre;
    private String razonSocial;
    private String ruc;
    private String descripcion;
    private String estado;

    public OrganizacionDTO() {

    }

    public OrganizacionDTO(int idOrganizacion, String nombre, String razonSocial, String ruc, String descripcion, String estado) {
        this.idOrganizacion = idOrganizacion;
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.ruc = ruc;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public OrganizacionDTO(String nombre, String razonSocial, String ruc, String descripcion, String estado) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.ruc = ruc;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public OrganizacionDTO(int idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }

    public int getIdOrganizacion() {
        return idOrganizacion;
    }

    public void setIdOrganizacion(int idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "OrganizacionDTO{" + "idOrganizacion=" + idOrganizacion + ", nombre=" + nombre + ", razonSocial=" + razonSocial + ", ruc=" + ruc + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
    
    

    public void finalize() throws Throwable {

    }
}//end OrganizacionDTO
