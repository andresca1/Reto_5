
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
@Table (name="Pelicula")
public class Pelicula {
    @Id
    @GeneratedValue
    @Column (name="id_pelicula")
    Integer id_pelicula;
    @Column (name="titulo")
    String titulo;
    @Column (name="resumen")
    String resumen;
    @Column (name="anio")
    String anio; //Suceptible de cambio, en BD está definido como YEAR 
    @Column (name="nombre_director")
    String nombre_director;

    public Integer getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(Integer id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getNombre_director() {
        return nombre_director;
    }

    public void setNombre_director(String nombre_director) {
        this.nombre_director = nombre_director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id_pelicula=" + id_pelicula + ", titulo=" + titulo + ", resumen=" + resumen + ", anio=" + anio + ", nombre_director=" + nombre_director + '}';
    }
    
    
    
    
}
