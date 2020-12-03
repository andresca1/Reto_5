
package com.example.RedFlixApp.modelos;

/**
 *
 * @author Andrés Candela
 */
import com.example.RedFlixApp.repositorios.SerieRepositorio;
import java.util.Optional;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Serie")
public class Serie {
    @Id
  //  @GeneratedValue
  //  @Column (name="id_serie")
  //  Integer id_serie;
    @Column (name="titulo")
    String titulo;
    @Column (name="num_episodios")
    String num_episodios;
    @Column (name="num_temporadas")
    String num_temporadas;  

//    public Integer getId_serie() {
//        return id_serie;
//    }

//    public void setId_serie(Integer id_serie) {
//        this.id_serie = id_serie;
//    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNum_episodios() {
        return num_episodios;
    }

    public void setNum_episodios(String num_episodios) {
        this.num_episodios = num_episodios;
    }

    public String getNum_temporadas() {
        return num_temporadas;
    }

    public void setNum_temporadas(String num_temporadas) {
        this.num_temporadas = num_temporadas;
    }

    @Override
    public String toString() {
        return "Serie{" + "id_serie=" + ", titulo=" + titulo + ", num_episodios=" + num_episodios + ", num_temporadas=" + num_temporadas + '}';
    }
    
    public boolean validarSerie(String serie_name, SerieRepositorio serie) {
       Optional<Serie> serieConsulta = serie.findById(serie_name);
        //select * from Usuarios where nom_usuario = "Laura";
        if (serieConsulta.isPresent()) {
            return true;
        } else {
            return false;
        }

    }
        public Serie getDatos(String serieName, SerieRepositorio serie)
    {
        Optional<Serie> serieConsulta = serie.findById(serieName);
        if(serieConsulta.isPresent())
        {
            return serieConsulta.get();
        }
        else
        {
            return null;
        }
    }

}
