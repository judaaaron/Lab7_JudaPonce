
import java.io.Serializable;

public class Artistas implements Serializable {

    private String usuario, contraseña, nombre, genero;

    private static final long SerialVersionUID = 777L;

    public Artistas() {
    }

    public Artistas(String usuario, String contraseña, String nombre, String genero) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
