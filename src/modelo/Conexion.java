package modelo;

import java.sql.*;

public class Conexion {

    private String url = "jdbc:sqlserver://localhost;databaseName=BDELEmperador;trustServerCertificate=true";
    private String usuario = "sa";
    private String password = "yourStrong(!)Password";
    private Connection conex;

    public Conexion() {

    }

    public Connection getConexion() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conex = DriverManager.getConnection(url, usuario, password);
            return conex;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }

    }

    public void desconectar() {

        if (conex != null) {
            try {
                if (!conex.isClosed()) {
                    conex.close();
                }
            } catch (Exception e) {
            }
        }

    }
}
