/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DataAccessObject;

import TransferObject.ClienteDTO;
import TransferObject.ClienteOrganizacionDTO;
import TransferObject.HabitacionDTO;
import TransferObject.OrganizacionDTO;
import TransferObject.TipoDocumentoDTO;
import TransferObject.TipoHabitacionDTO;
import TransferObject.TipoPagoDTO;

/**
 *
 * @author cesarcunyarache
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         TipoPagoDAO d =  new TipoPagoDAO();
         System.out.println(d.Create(new TipoPagoDTO("efectivo")));
         System.out.println(d.Read());
         System.out.println(d.Update(new TipoPagoDTO(1, "tarjeta")));
         
         System.out.println(d.Search(new TipoPagoDTO(1)));
         
         

        //System.out.println(d.Update(new ClienteDTO(2, "8989", 2, "Juan", "Pérez", "1234567890", "Peruana", "juan@example.com", "Calle Principal 123", 'M')));
 
    }
    
}
