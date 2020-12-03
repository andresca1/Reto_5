package com.example.RedFlixApp;

/**
 *
 * @author RedFlix16 Team
 */

import com.example.RedFlixApp.vistas.VentanaPrincipal;
import com.example.RedFlixApp.vistas.VentanaUsuarios;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan("com.example.RedFlixApp")
public class Reto5Application {

	public static void main(String[] args) {
                VentanaPrincipal ventana = new VentanaPrincipal();
                ventana.setVisible(true);
	}
        
        public static void runServer(String[] args) {
            SpringApplication.run(Reto5Application.class, args);
        }

}
