
import java.util.ArrayList;


public class Cancion {
    String nombre;
    String categoria;
    ArrayList caracteres = new ArrayList();

    public Cancion(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
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

    public ArrayList getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(ArrayList caracteres) {
        this.caracteres = caracteres;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
