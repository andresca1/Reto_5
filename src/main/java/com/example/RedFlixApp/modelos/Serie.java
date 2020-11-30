
package com.example.RedFlixApp.modelos;

/**
 *
 * @author Andrés Candela
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Serie")
public class Serie {
    @Id
    @GeneratedValue
    @Column (name="id_serie")
    Integer id_serie;
    @Column (name="titulo")
    String titulo;
    @Column (name="num_episodios")
    String num_episodios;
    @Column (name="num_temporadas")
    String num_temporadas;    
    
}
