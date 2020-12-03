package com.example.RedFlixApp;

import com.example.RedFlixApp.vistas.VentanaPrincipal;
import com.example.RedFlixApp.vistas.VentanaUsuarios;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan("com.example.RedFlixApp")
public class Reto5Application {

	public static void main(String[] args) {
		//SpringApplication.run(Reto5Application.class, args);
                
                VentanaPrincipal ventana = new VentanaPrincipal();
                ventana.setVisible(true);
//                  VentanaUsuarios ventanaU = new VentanaUsuarios();
//                  ventanaU.setVisible(true);
	}
        
        public static void runServer(String[] args) {
            /*
            ConfigurableApplicationContext ctx = new SpringApplicationBuilder(Application.class)
                    .headless(false).run(args);
            */
            SpringApplication.run(Reto5Application.class, args);
            
        }

}
