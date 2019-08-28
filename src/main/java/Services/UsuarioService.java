package arkham.knight.practica13.Services;

import arkham.knight.practica13.Models.Rol;
import arkham.knight.practica13.Models.Usuario;
import arkham.knight.practica13.Repositories.RolRepository;
import arkham.knight.practica13.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepo;

    @Autowired
    private RolRepository rolRepo;

    public void crearUsuario(Usuario usuario){

        usuarioRepo.save(usuario);
    }


    public List<Usuario> listarUsuarios(){

        return usuarioRepo.findAll();
    }

    public Usuario encontrarUsuarioPorId(long id){

        return usuarioRepo.findUsuarioById(id);
    }

    public void eliminarUsuario(long id){

        // Igualo  el cliente al cliente que buscamos mediante el id
        Usuario usuarioToDelete = usuarioRepo.findUsuarioById(id);

        // y aqui lo borro
        usuarioRepo.delete(usuarioToDelete);
    }


    public void crearRol(Rol rol){

        rolRepo.save(rol);
    }


    public List<Rol> listarRoles(){

        return rolRepo.findAll();
    }


    public Rol encontrarRolPorId(long id){

        return rolRepo.findRolById(id);
    }

    public void borrarTodosLosUsuarios(){

        usuarioRepo.deleteAll();
    }

}
