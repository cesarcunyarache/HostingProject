package BusinessObject;

import java.util.List;
import TransferObject.UsuarioDTO;
import DataAccessObject.UsuarioDAO;

public class Usuario {

    private UsuarioDTO usuarioDTO;
    private UsuarioDAO usuarioDAO;

    public Usuario() {
        usuarioDAO = new UsuarioDAO();
    }

    public String Agregar(int idEmpleado, String usuario, String contrasena, String rol) {
        String mensaje = "";
        usuarioDTO = new UsuarioDTO(idEmpleado, usuario, contrasena, rol);
        if (usuarioDAO.Create(usuarioDTO)) {
            mensaje = "El registro se agregó existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo agregar";
        }
        return mensaje;
    }

    public List<UsuarioDTO> Listar() {
        if (usuarioDAO.Read() != null) {
            return usuarioDAO.Read();
        } else {
            return null;
        }
    }

    public String Actualizar(int idEmpleado, String user, String password, String rol, int idUsuario) {
        String mensaje = "";
        usuarioDTO = new UsuarioDTO(idUsuario, idEmpleado, user, mensaje, rol);
        if (usuarioDAO.Update(usuarioDTO)) {
            mensaje = "El registro se actualizo existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo actualizar";
        }
        return mensaje;
    }

//    public String Eliminar(int id) {
//        String mensaje = "";
//        tipoEmpleadoDTO = new TipoEmpleadoDTO(id);
//        if (tipoEmpleadoDAO.Delete(tipoEmpleadoDTO)) {
//            mensaje = "El registro se eliminó existosamente";
//        } else {
//            mensaje = "ERROR: El registro no se pudo eliminar";
//        }
//        return mensaje;
//    }
    public UsuarioDTO Buscar(int id) {
        usuarioDTO = new UsuarioDTO(id);
        if (usuarioDAO.Search(usuarioDTO) != null) {
            return usuarioDAO.Search(usuarioDTO);
        } else {
            return null;
        }

    }

}
