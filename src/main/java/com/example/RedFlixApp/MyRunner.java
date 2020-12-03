
package com.example.RedFlixApp;

/**
 *
 * @author RedFlix16 Team
 */

import com.example.RedFlixApp.modelos.Serie;
import com.example.RedFlixApp.modelos.Usuario;
import com.example.RedFlixApp.repositorios.SerieRepositorio;
import com.example.RedFlixApp.repositorios.UsuarioRepositorio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Override
    public void run(String... args) throws Exception {

    }
}


