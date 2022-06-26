
import java.util.ArrayList;


public class Cancion {
    String nombre;
    String categoria;
    String caracteres;

    public Cancion(String nombre, String categoria, String caracteres) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.caracteres = caracteres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(String caracteres) {
        this.caracteres = caracteres;
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", categoria=" + categoria + ", caracteres=" + caracteres + '}';
    }

    
    
}
