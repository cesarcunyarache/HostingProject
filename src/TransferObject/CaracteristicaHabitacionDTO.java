package TransferObject;

public class CaracteristicaHabitacionDTO {

    private int id;
    private String nombre;
    private double valor;

    public CaracteristicaHabitacionDTO(int id, String nombre, double valor) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
    }

    public CaracteristicaHabitacionDTO(int id) {
        this.id = id;
    }
    
    public CaracteristicaHabitacionDTO() {
        
    }
    
    public CaracteristicaHabitacionDTO(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}