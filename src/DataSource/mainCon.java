
package DataSource;

/**
 *
 * @author Fabian
 */
public class mainCon {
    public static void main(String[] args) {
         Conexion conx = new Conexion();
        if (conx.getConnection()!=null) {
            System.out.println("Conexion exitosa");
        }else{
             System.out.println("Conexion no exitosa");
        }
    }
}
