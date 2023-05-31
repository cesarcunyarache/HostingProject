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

        EncriptadoAES encrip = new EncriptadoAES();
        System.out.println(encrip.ecnode("Contraseña12346"));

        // Cifrado Cesar
        CifradoCesar cif = new CifradoCesar();
        System.out.println(cif.encrypt("Contraseña12346", 10));

        //AES Dinamico
        Encriptador en = new Encriptador();

        String clave = "contraseña123";

        String mensajeEncriptado = en.encriptarClave(clave);
        
        System.out.println("Mensaje encriptado: " + mensajeEncriptado);
        

        String mensajeDesencriptado = en.desencriptarClave(mensajeEncriptado);
        System.out.println("Mensaje desencriptado: " + mensajeDesencriptado);
    }

}
