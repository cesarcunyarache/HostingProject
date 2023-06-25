/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObject;

import DataSource.Conexion;
import TransferObject.ModelData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Graf {

    Conexion conexion;

    public Graf() {
        conexion = new Conexion();
    }

    public ArrayList<ModelData> Grafico() {
        ResultSet r = null;
        PreparedStatement p = null;
        Connection con = conexion.getConnection();
        ArrayList<ModelData> lists = new ArrayList<>();
        try {

            String sql = "Select TOP 7 DAY(CONVERT(DATE, fechaIngreso)) AS Dia, Sum(monto) as Monto, Count(*) as Cantidad\n"
                    + "from Pago p \n"
                    + "INNER JOIN RegistroHabitacion r\n"
                    + "on p.idPago = r.idPago\n"
                    + "GROUP by fechaIngreso";
            p = con.prepareStatement(sql);
            r = p.executeQuery();
            while (r.next()) {
                String month = r.getString("Dia");
                double amount = r.getDouble("Monto");
                int cost = r.getInt("Cantidad");
//                double profit = r.getDouble("Importe");
                lists.add(new ModelData(month, amount, cost));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                r.close();
                p.close();
            } catch (SQLException ex) {

            }
        }

        return lists;

    }

}
