
import java.util.ArrayList;

public class Bandas extends Artistas {

    private int nIntegrantes;
    private ArrayList<Canciones> songss = new ArrayList();

    public Bandas() {
        super();
    }

    public Bandas(int nIntegrantes, String usuario, String contraseña, String nombre, String genero) {
        super(usuario, contraseña, nombre, genero);
        this.nIntegrantes = nIntegrantes;
    }

    public int getnIntegrantes() {
        return nIntegrantes;
    }

    public void setnIntegrantes(int nIntegrantes) {
        this.nIntegrantes = nIntegrantes;
    }

    public ArrayList<Canciones> getSongss() {
        return songss;
    }

    public void setSongss(ArrayList<Canciones> songss) {
        this.songss = songss;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
