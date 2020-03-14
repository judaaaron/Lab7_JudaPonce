
import java.io.Serializable;
import java.util.ArrayList;

public class Usuarios implements Serializable {

    private String usuario, password, nombre, edad;
    private ArrayList<Eventos> events = new ArrayList();
    private ArrayList<Artistas> artists = new ArrayList();
    private static final long SerialVersionUID = 778L;

    public Usuarios() {
    }

    public Usuarios(String usuario, String password, String nombre, String edad) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public ArrayList<Eventos> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Eventos> events) {
        this.events = events;
    }

    public ArrayList<Artistas> getArtists() {
        return artists;
    }

    public void setArtists(ArrayList<Artistas> artists) {
        this.artists = artists;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", password=" + password + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

}
