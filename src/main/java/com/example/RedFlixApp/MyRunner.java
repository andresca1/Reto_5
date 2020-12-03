
package com.example.RedFlixApp;

import com.example.RedFlixApp.modelos.Serie;
import com.example.RedFlixApp.modelos.Usuario;
import com.example.RedFlixApp.repositorios.SerieRepositorio;
import com.example.RedFlixApp.repositorios.UsuarioRepositorio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Andrés Candela
 */
@Component
public class MyRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);
            

//    private UsuarioRepositorio UsuarioRepositorio;
//    private SerieRepositorio SerieRepositorio;
//    @Autowired
//    private SerieRepositorio SerieRepositorio;

    @Override
    public void run(String... args) throws Exception {
//        logger.info("Antes: # de canciones: {}", UsuarioRepositorio.count());
//        logger.info("Antes: # de canciones: {}", SerieRepositorio.count());
       // logger.info("Antes: # de canciones: {}", SerieRepositorio.count());
//        Usuario NewUsuario = new Usuario();
//        NewUsuario.setId_username("WlsonDark");
//        NewUsuario.setNombre("Wilson");
//        NewUsuario.setApellido("Andrade");
//        NewUsuario.setFecha_nacimiento("1990-12-22");
//        NewUsuario.setCelular("3154771111");
//        NewUsuario.setContrasenia("123456");
//        NewUsuario.setEmail("wilaonandrade@gmail.com");
//        UsuarioRepositorio.save(NewUsuario);
    }
    

//    public void crearUsuario (Usuario usuario) {
//        UsuarioRepositorio.save(usuario);
//    }
// 
//    public void crearSerie (Serie serie) {
//        SerieRepositorio.save(serie);
//    }
}
//    public void crearSerie (Serie serie) {
//        SerieRepositorio.save(serie);
//    }


