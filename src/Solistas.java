
import java.util.ArrayList;

public class Solistas extends Artistas {

    private int edad;
    private ArrayList<Canciones> songs = new ArrayList();

    public Solistas() {
        super();
    }

    public Solistas(int edad, String usuario, String contraseña, String nombre, String genero) {
        super(usuario, contraseña, nombre, genero);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Canciones> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Canciones> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return super.toString() + "Solistas" + "edad=" + edad;
    }

}
