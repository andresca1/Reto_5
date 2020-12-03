
package com.example.RedFlixApp.repositorios;

import com.example.RedFlixApp.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andrés Candela
 */
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, String> {
    
}
