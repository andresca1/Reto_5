package com.example.RedFlixApp.repositorios;

/**
 *
 * @author RedFlix16 Team
 */
import com.example.RedFlixApp.modelos.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DirectorRepositorio extends JpaRepository<Director, Integer> {
   
}