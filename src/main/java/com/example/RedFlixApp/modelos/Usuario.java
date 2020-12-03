package com.example.RedFlixApp.modelos;

/**
 *
 * @author RedFlix16 Team
 */

import com.example.RedFlixApp.repositorios.UsuarioRepositorio;
import java.util.Optional;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                     //La clase Usuario es una Entidad
@Table(name = "usuario")  //Asociada a una tabla (MySQL) llamada "Usuario" 
public class Usuario {

    // Clase-Entidad relacionada con Atributos-Columnas 
    //El Id será el nombre del usuario, también es posible generar uno aparte y diferente con @GeneratedValue
    @Id
    @Column(name = "id_username")
    String id_username;
    @Column(name = "nombre")
    String nombre;
    @Column(name = "apellido")
    String apellido;
    @Column (name = "email")
    String email;
    @Column(name = "celular")
    String celular;
    @Column(name = "contrasenia")
    String contrasenia;
    @Column(name = "fecha_nacimiento")
    String fecha_nacimiento;

    public String getId_username() {
        return id_username;
    }

    public void setId_username(String id_username) {
        this.id_username = id_username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_username=" + id_username + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", celular=" + celular + ", contrasenia=" + contrasenia + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }

    public boolean validarUsuario(String username, UsuarioRepositorio usuario) {
        Optional<Usuario> usuarioConsulta = usuario.findById(username);
        //select * from Usuarios where nom_usuario = "Laura";
        if (usuarioConsulta.isPresent()) {
            return true;
        } else {
            return false;
        }

    }
    public Usuario getDatos(String username, UsuarioRepositorio usuario)
    {
        Optional<Usuario> usuarioConsulta = usuario.findById(username);
        if(usuarioConsulta.isPresent())
        {
            return usuarioConsulta.get();
        }
        else
        {
            return null;
        }
    }
    
}
