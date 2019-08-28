package practica14.Repositories;

import arkham.knight.practica13.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findUsuarioById(Long id);
    Usuario findByUsername(String username);

}
