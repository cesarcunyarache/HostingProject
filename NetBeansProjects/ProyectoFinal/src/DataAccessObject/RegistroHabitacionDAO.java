package DataAccessObject;

import DataSource.Conexion;
import TransferObject.RegistroHabitacionDTO;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class RegistroHabitacionDAO implements Crud<RegistroHabitacionDTO> {

    private Conexion conexion;
    private PreparedStatement ps;
    private ResultSet rs;

    public RegistroHabitacionDAO() {
        conexion = new Conexion();
    }

    @Override
    public boolean Create(RegistroHabitacionDTO t) {
        int r = 0;
        try {
            ps = conexion.getConnection().prepareStatement("INSERT INTO RegistroHabitacion(idHabitacion, idCliente, idEmpleado,fechaIngreso) values(?,?,?,?) ");
            ps.setInt(1, t.getHabitacionID());
            ps.setInt(2, t.getClienteID());
            ps.setInt(3, t.getEmpleadoID());
            ps.setDate(4, new java.sql.Date(t.getFechaIngreso().getTime()));

            r = ps.executeUpdate();
            return r == 1;
        } catch (SQLException ex) {

            return false;
        } finally {
            conexion.desconectar();
        }
    }

    @Override
    public boolean Update(RegistroHabitacionDTO t) {
        int r = 0;
        try {
            ps = conexion.getConnection().prepareStatement("UPDATE RegistroHabitacion set fechaSalida=?  WHERE idRegistro=? ");
            ps.setDate(1, new java.sql.Date(t.getFechaSalida().getTime()));
            ps.setInt(2, t.getIdRegistroHabitacion());

            r = ps.executeUpdate();
            return r == 1;
        } catch (SQLException ex) {

            return false;
        } finally {
            conexion.desconectar();
        }

    }

    @Override
    public List<RegistroHabitacionDTO> Read() {
        List<RegistroHabitacionDTO> listaRegistros = new ArrayList<>();

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM RegistroHabitacion");
            rs = ps.executeQuery();

            //registros por leer
            while (rs.next()) {
                RegistroHabitacionDTO t = new RegistroHabitacionDTO();
                t.setIdRegistroHabitacion(rs.getInt(1));
                t.setHabitacionID(rs.getInt(2));
                t.setClienteID(rs.getInt(3));
                t.setEmpleadoID(rs.getInt(4));

                String fechaIngresoString = rs.getString(5);
                String fechaSalidaString = rs.getString(6);
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date fechaIngreso = null;
                Date fechaSalida = null;

                try {
                    fechaIngreso = dateFormat.parse(fechaIngresoString);
                    fechaSalida = dateFormat.parse(fechaSalidaString);
                } catch (ParseException e) {
                }
                t.setFechaIngreso(fechaIngreso);
                t.setFechaSalida(fechaSalida);

                listaRegistros.add(t);
            }

            return listaRegistros;
        } catch (SQLException ex) {
            return null;

        } finally {
            conexion.desconectar();
        }
    }

    @Override
    public boolean Delete(RegistroHabitacionDTO t) {

        return false;

    }

    @Override
    public RegistroHabitacionDTO Search(RegistroHabitacionDTO t) {
        boolean encontrado = false;

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM RegistroHabitacion WHERE idRegistro=?");
            ps.setInt(1, t.getIdRegistroHabitacion());
            rs = ps.executeQuery();

            //registros por leer
            while (rs.next()) {
                t.setIdRegistroHabitacion(rs.getInt(1));
                t.setHabitacionID(rs.getInt(2));
                t.setClienteID(rs.getInt(3));
                t.setEmpleadoID(rs.getInt(4));
                Date fechaIngreso = rs.getDate(5);
                t.setFechaIngreso(fechaIngreso);

                Date fechaSalida = rs.getDate(6);
                t.setFechaSalida(fechaSalida);
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

    public List<RegistroHabitacionDTO> buscarIDhabitacion(RegistroHabitacionDTO t) {

        List<RegistroHabitacionDTO> listaHabitaciones = new ArrayList<>();

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM RegistroHabitacion WHERE idHabitacion=?");
            ps.setInt(1, t.getHabitacionID());
            rs = ps.executeQuery();

            //registros por leer
            if (!rs.isBeforeFirst()) {
                return null;
            } else {
                while (rs.next()) {
                    t.setIdRegistroHabitacion(rs.getInt(1));
                    t.setHabitacionID(rs.getInt(2));
                    t.setClienteID(rs.getInt(3));
                    t.setEmpleadoID(rs.getInt(4));
                    Date fechaIngreso = rs.getDate(5);
                    t.setFechaIngreso(fechaIngreso);

                    Date fechaSalida = rs.getDate(6);
                    t.setFechaSalida(fechaSalida);
                    listaHabitaciones.add(t);
                }
            }

        } catch (SQLException ex) {
            return null;

        } finally {
            conexion.desconectar();
        }
        return listaHabitaciones;

    }

    public List<RegistroHabitacionDTO> buscarIDCliente(RegistroHabitacionDTO t) {

        List<RegistroHabitacionDTO> listaHabitaciones = new ArrayList<>();

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM RegistroHabitacion WHERE ClienteID=?");
            ps.setInt(1, t.getClienteID());
            rs = ps.executeQuery();

            //registros por leer
            if (!rs.isBeforeFirst()) {
                return null;
            } else {
                while (rs.next()) {
                    t.setIdRegistroHabitacion(rs.getInt(1));
                    t.setHabitacionID(rs.getInt(2));
                    t.setClienteID(rs.getInt(3));
                    t.setEmpleadoID(rs.getInt(4));
                    Date fechaIngreso = rs.getDate(5);
                    t.setFechaIngreso(fechaIngreso);
                    Date fechaSalida = rs.getDate(6);
                    t.setFechaSalida(fechaSalida);
                    listaHabitaciones.add(t);
                }
            }

        } catch (SQLException ex) {
            return null;

        } finally {
            conexion.desconectar();
        }
        return listaHabitaciones;

    }

    public List<RegistroHabitacionDTO> buscarIDEmpleado(RegistroHabitacionDTO t) {

        List<RegistroHabitacionDTO> listaHabitaciones = new ArrayList<>();

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM RegistroHabitacion WHERE EmpleadoID=?");
            ps.setInt(1, t.getEmpleadoID());
            rs = ps.executeQuery();

            //registros por leer
            if (!rs.isBeforeFirst()) {
                return null;
            } else {
                while (rs.next()) {
                    t.setIdRegistroHabitacion(rs.getInt(1));
                    t.setHabitacionID(rs.getInt(2));
                    t.setClienteID(rs.getInt(3));
                    t.setEmpleadoID(rs.getInt(4));
                    Date fechaIngreso = rs.getDate(5);
                    t.setFechaIngreso(fechaIngreso);
                    Date fechaSalida = rs.getDate(6);
                    t.setFechaSalida(fechaSalida);
                    listaHabitaciones.add(t);
                }
            }

        } catch (SQLException ex) {
            return null;

        } finally {
            conexion.desconectar();
        }
        return listaHabitaciones;

    }

    public List<RegistroHabitacionDTO> buscarFechaIngreso(RegistroHabitacionDTO t) {

        List<RegistroHabitacionDTO> listaHabitaciones = new ArrayList<>();

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM RegistroHabitacion WHERE fechaIngreso>=? AND fechaIngreso<=?");
            ps.setString(1, t.getFechaIngreso() + " 00:00:00");
            ps.setString(2, t.getFechaIngreso() + " 23:59:59");
            rs = ps.executeQuery();

            //registros por leer
            if (!rs.isBeforeFirst()) {
                return null;
            } else {
                while (rs.next()) {
                    t.setIdRegistroHabitacion(rs.getInt(1));
                    t.setHabitacionID(rs.getInt(2));
                    t.setClienteID(rs.getInt(3));
                    t.setEmpleadoID(rs.getInt(4));
                    Date fechaIngreso = rs.getDate(5);
                    t.setFechaIngreso(fechaIngreso);
                    Date fechaSalida = rs.getDate(6);
                    t.setFechaSalida(fechaSalida);
                    listaHabitaciones.add(t);
                }
            }

        } catch (SQLException ex) {
            return null;

        } finally {
            conexion.desconectar();
        }
        return listaHabitaciones;

    }

    public List<RegistroHabitacionDTO> buscarFechaSalida(RegistroHabitacionDTO t) {

        List<RegistroHabitacionDTO> listaHabitaciones = new ArrayList<>();

        try {
            ps = conexion.getConnection().prepareStatement("SELECT * FROM RegistroHabitacion WHERE fechaSalida>=? AND fechaSalida<=?");
            ps.setString(1, t.getFechaSalida() + " 00:00:00");
            ps.setString(2, t.getFechaSalida() + " 23:59:59");
            rs = ps.executeQuery();

            //registros por leer
            if (!rs.isBeforeFirst()) {
                return null;
            } else {
                while (rs.next()) {
                    t.setIdRegistroHabitacion(rs.getInt(1));
                    t.setHabitacionID(rs.getInt(2));
                    t.setClienteID(rs.getInt(3));
                    t.setEmpleadoID(rs.getInt(4));
                    Date fechaIngreso = rs.getDate(5);
                    t.setFechaIngreso(fechaIngreso);
                    Date fechaSalida = rs.getDate(6);
                    t.setFechaSalida(fechaSalida);
                    listaHabitaciones.add(t);
                }
            }

        } catch (SQLException ex) {
            return null;

        } finally {
            conexion.desconectar();
        }
        return listaHabitaciones;
    }

}
