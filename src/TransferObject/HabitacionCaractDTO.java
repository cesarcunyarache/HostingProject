/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransferObject;

/**
 *
 * @author chero
 */
public class HabitacionCaractDTO {

    private int id;
    private int idHabitacion;
    private int idCaracteristica;

    public HabitacionCaractDTO(int id, int idHabitacion, int idCaracteristica) {
        this.id = id;
        this.idHabitacion = idHabitacion;
        this.idCaracteristica = idCaracteristica;
    }

    public HabitacionCaractDTO(int id) {
        this.id = id;
    }
    
    public HabitacionCaractDTO() {
    }

    public HabitacionCaractDTO(int idHabitacion, int idCaracteristica) {
        this.idHabitacion = idHabitacion;
        this.idCaracteristica = idCaracteristica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getIdCaracteristica() {
        return idCaracteristica;
    }

    public void setIdCaracteristica(int idCaracteristica) {
        this.idCaracteristica = idCaracteristica;
    }

}
