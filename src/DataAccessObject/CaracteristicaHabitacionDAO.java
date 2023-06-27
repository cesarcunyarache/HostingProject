/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObject;

import DataSource.Conexion;
import TransferObject.CaracteristicaHabitacionDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chero
 */
public class CaracteristicaHabitacionDAO implements Crud<CaracteristicaHabitacionDTO> {

    Conexion conexion;
    private PreparedStatement ps;
    private ResultSet rs;

    public CaracteristicaHabitacionDAO() {
        conexion = new Conexion();
    }

    @Override
    public boolean Create(CaracteristicaHabitacionDTO t) {
        int r = 0;
        try {
            ps = conexion.getConnection().prepareStatement(
                    "INSERT INTO CaracteristicaHabitacion(nombreCarac,valor) values(?,?) ");

            ps.setString(1, t.getNombre());
            ps.setDouble(2, t.getValor());

            r = ps.executeUpdate();
            return r == 1;
        } catch (SQLException ex) {

            return false;
        } finally {
            conexion.desconectar();
        }
    }

    @Override
    public boolean Update(CaracteristicaHabitacionDTO t) {
        int r = 0;
        try {
            ps = conexion.getConnection().prepareStatement("UPDATE CaracteristicaHabitacion set nombreCarac=?,valor=?  WHERE idCaracteristica=? ");
            ps.setString(1, t.getNombre());
            ps.setDouble(2, t.getValor());
            ps.setInt(3, t.getId());

            r = ps.executeUpdate();
            return r == 1;
        } catch (SQLException ex) {

            return false;
        } finally {
            conexion.desconectar();
        }
    }

    @Override
    public List<CaracteristicaHabitacionDTO> Read() {
        List<CaracteristicaHabitacionDTO> listaPelis = new ArrayList<>();

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM CaracteristicaHabitacion");
            rs = ps.executeQuery();

            //registros por leer
            while (rs.next()) {
                CaracteristicaHabitacionDTO t = new CaracteristicaHabitacionDTO();
                t.setId(rs.getInt(1));
                t.setNombre(rs.getString(2));
                t.setValor(rs.getDouble(3));

                listaPelis.add(t);
            }

            return listaPelis;
        } catch (SQLException ex) {
            return null;

        } finally {
            conexion.desconectar();
        }
    }

    public List<CaracteristicaHabitacionDTO> Read(int idHabitacion) {
        List<CaracteristicaHabitacionDTO> listaPelis = new ArrayList<>();
        try {
            ps = conexion.getConnection().prepareStatement("EXEC ObtenerCaracteristicasHabitacion @idHabitacion = " + idHabitacion + ";");
            rs = ps.executeQuery();

            // registros por leer
            while (rs.next()) {
                CaracteristicaHabitacionDTO t = new CaracteristicaHabitacionDTO();
                        
                t.setId(rs.getInt(1));
                t.setNombre(rs.getString(2));
                t.setValor(rs.getDouble(3));
                

                listaPelis.add(t);
            }

            for (CaracteristicaHabitacionDTO listaPeli : listaPelis) {
                System.out.println(listaPeli.getNombre());
            }
            
            return listaPelis;
        } catch (SQLException ex) {
            return null;
        } finally {
            conexion.desconectar();
        }
    }

    @Override
    public boolean Delete(CaracteristicaHabitacionDTO t) {
        return false;
    }

    @Override
    public CaracteristicaHabitacionDTO Search(CaracteristicaHabitacionDTO t) {
        boolean encontrado = false;

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM CaracteristicaHabitacion WHERE idCaracteristica=?");
            ps.setInt(1, t.getId());
            rs = ps.executeQuery();

            //registros por leer
            while (rs.next()) {

                t.setId(rs.getInt(1));
                t.setNombre(rs.getString(2));
                t.setValor(rs.getDouble(3));

                encontrado = true;
            }

            if (encontrado) {
                return t;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;

        } finally {
            conexion.desconectar();
        }
    }

}
