/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TransferObject;

/**
 *
 * @author cesarcunyarache
 */
public class Testing {

    public static void main(String[] args) {
        // AES

        Encriptado encrip = new Encriptado();
        System.out.println(encrip.ecnode("admin"));

        // Cifrado Cesar
        System.out.println(encrip.deecnode(encrip.ecnode("admin")));

       
    }

}
