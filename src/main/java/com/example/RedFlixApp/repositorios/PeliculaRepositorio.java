
package com.example.RedFlixApp.repositorios;

/**
 *
 * @author Andrés Candela
 */
import com.example.RedFlixApp.modelos.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PeliculaRepositorio extends JpaRepository <Pelicula, Integer>{
    
}
