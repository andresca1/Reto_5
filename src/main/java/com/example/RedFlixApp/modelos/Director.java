
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
@Table (name="Director")
public class Director {
    @Id
    @Column (name="id_director")
    Integer id_director;
    @Column (name="nombre")
    Integer nombre;
    @Column (name="apellido")
    Integer apellido;
    @Column (name="nacionalidad")
    Integer nacionalidad;

    public Integer getId_director() {
        return id_director;
    }

    public void setId_director(Integer id_director) {
        this.id_director = id_director;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public Integer getApellido() {
        return apellido;
    }

    public void setApellido(Integer apellido) {
        this.apellido = apellido;
    }

    public Integer getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Integer nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Director{" + "id_director=" + id_director + ", nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + '}';
    }
    
    
    
}
