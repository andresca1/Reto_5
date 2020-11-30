

package com.example.RedFlixApp.repositorios;

/**
 *
 * @author Andrés Candela
 */
import com.example.RedFlixApp.modelos.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SerieRepositorio extends JpaRepository<Serie, Integer>{
    
}
