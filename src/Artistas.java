
import java.util.ArrayList;


public class Artistas {
    
   private String usuario, contraseña, nombre,genero;


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
        return "Artistas{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", genero=" + genero + '}';
    }
    
   
   
   
   
   
}
