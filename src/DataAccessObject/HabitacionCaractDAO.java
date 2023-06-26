/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObject;

import DataSource.Conexion;
import TransferObject.HabitacionCaractDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chero
 */
public class HabitacionCaractDAO implements Crud<HabitacionCaractDTO> {

    Conexion conexion;
    private PreparedStatement ps;
    private ResultSet rs;

    public HabitacionCaractDAO() {
        conexion = new Conexion();
    }
    
    @Override
    public boolean Create(HabitacionCaractDTO t) {

        int r = 0;
        try {
            ps = conexion.getConnection().prepareStatement(
                    "INSERT INTO HabitacionCaract(idHabitacion,idCaracteristica) values(?,?) ");

            ps.setInt(1, t.getIdHabitacion());
            ps.setInt(2, t.getIdCaracteristica());

            r = ps.executeUpdate();
            return r == 1;
        } catch (SQLException ex) {

            return false;
        } finally {
            conexion.desconectar();
        }
    }

    @Override
    public boolean Update(HabitacionCaractDTO t) {
        int r = 0;
        try {
            ps = conexion.getConnection().prepareStatement("UPDATE HabitacionCaract set idHabitacion=?,idCaracteristica=?  WHERE id=? ");
            ps.setInt(1, t.getIdHabitacion());
            ps.setInt(2, t.getIdCaracteristica());
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
    public List<HabitacionCaractDTO> Read() {

        List<HabitacionCaractDTO> listaPelis = new ArrayList<>();

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM HabitacionCaract");
            rs = ps.executeQuery();

            //registros por leer
            while (rs.next()) {
                HabitacionCaractDTO t = new HabitacionCaractDTO();
                t.setIdHabitacion(rs.getInt(1));
                t.setIdCaracteristica(rs.getInt(2));
                t.setId(rs.getInt(3));

                listaPelis.add(t);
            }

            return listaPelis;
        } catch (SQLException ex) {
            return null;

        } finally {
            conexion.desconectar();
        }
    }

    @Override
    public boolean Delete(HabitacionCaractDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HabitacionCaractDTO Search(HabitacionCaractDTO t) {

        boolean encontrado = false;

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM HabitacionCaract WHERE id=?");
            ps.setInt(1, t.getId());
            rs = ps.executeQuery();

            //registros por leer
            while (rs.next()) {

                t.setIdHabitacion(rs.getInt(1));
                t.setIdCaracteristica(rs.getInt(2));
                t.setId(rs.getInt(3));

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

