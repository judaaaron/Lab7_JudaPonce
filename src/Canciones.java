
import java.io.Serializable;

public class Canciones implements Serializable {

    private String nombre;
    private int segundos;

    public Canciones() {
    }

    public Canciones(String nombre, int segundos) {
        this.nombre = nombre;
        this.segundos = segundos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return "Canciones{" + "nombre=" + nombre + ", segundos=" + segundos + '}';
    }

}
