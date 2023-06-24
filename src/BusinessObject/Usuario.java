package BusinessObject;

import java.util.List;
import TransferObject.UsuarioDTO;
import DataAccessObject.UsuarioDAO;
import TransferObject.Encriptado;

public class Usuario {

    private UsuarioDTO usuarioDTO;
    private UsuarioDAO usuarioDAO;
    private Encriptado enc;

    public Usuario() {
        usuarioDAO = new UsuarioDAO();
        enc = new Encriptado();
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

    public String Actualizar(int idUsuario, int idEmpleado, String user, String password, String rol) {
        String mensaje = "";
        boolean isUpdate = usuarioDAO.Update(new UsuarioDTO(idUsuario, idEmpleado, user, password, rol));
        if (isUpdate) {
            mensaje = "El registro se actualizo existosamente";
        } else {
            mensaje = "ERROR: El registro no se pudo actualizar";
        }
        return mensaje;
    }

    public UsuarioDTO Buscar(int id) {
        usuarioDTO = new UsuarioDTO(id);
        
        if (usuarioDAO.Search(usuarioDTO) != null) {
            System.out.println(usuarioDTO.getUsuario() + "usuario en meotoods");
            usuarioDTO = usuarioDAO.Search(usuarioDTO);
            return usuarioDTO;
        } else {
            return null;
        }
    }

    public UsuarioDTO BuscarUsuario(String user) {
        usuarioDTO = new UsuarioDTO(user);
        if (usuarioDAO.SearchUser(usuarioDTO) != null) {
            return usuarioDAO.SearchUser(usuarioDTO);
        } else {
            return null;
        }
    }
    
    public UsuarioDTO BuscarActualizar(String user, int id) {
        UsuarioDTO usu = new UsuarioDTO(id, user);
        UsuarioDTO obj = null;
        if (usuarioDAO.SearchUpadate(usu) != null) {
            obj = usuarioDAO.SearchUpadate(usu);
        } 
        
        return obj;
    }
    
    public UsuarioDTO ValidarUsuario(String user, String password) {
        usuarioDTO = new UsuarioDTO(user);
        UsuarioDTO searchUser = null;
        if (usuarioDAO.SearchUser(usuarioDTO) != null) {
            searchUser = usuarioDAO.SearchUser(usuarioDTO) ;
            String contraseña = enc.deecnode(searchUser.getContrasena());
            if (password.equals(contraseña)) {
                return searchUser;
            } else {
                return null;
            }

        } else {
            return null;
        }
    }   
    
    public UsuarioDTO obtenerRecordarDatos() {
        return usuarioDAO.obtenerDatosGuardados();
    }
    
    public void recordarDatos(int idUser){
        usuarioDAO.guardarDatosUsuario(idUser);
    }
    
    public void noRecordarDatos(){
        usuarioDAO.noGuardarDatosUsuario();
    }
    
}
