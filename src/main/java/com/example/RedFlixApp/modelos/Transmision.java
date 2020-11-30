
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
@Table (name="Transmision")
public class Transmision {
    @Id
    @GeneratedValue
    @Column (name= "id_transmision")
    Integer id_transmision;
    @Column (name= "id_username")
    String id_username;
    @Column (name= "contenido")
    String contenido;
    @Column (name= "fecha_visualizacion")
    String fecha_visualizacion;

    public Integer getId_transmision() {
        return id_transmision;
    }

    public void setId_transmision(Integer id_transmision) {
        this.id_transmision = id_transmision;
    }

    public String getId_username() {
        return id_username;
    }

    public void setId_username(String id_username) {
        this.id_username = id_username;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha_visualizacion() {
        return fecha_visualizacion;
    }

    public void setFecha_visualizacion(String fecha_visualizacion) {
        this.fecha_visualizacion = fecha_visualizacion;
    }

    @Override
    public String toString() {
        return "Transmision{" + "id_transmision=" + id_transmision + ", id_username=" + id_username + ", contenido=" + contenido + ", fecha_visualizacion=" + fecha_visualizacion + '}';
    }
    
    
    
    
}
