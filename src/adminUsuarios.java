
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminUsuarios {

    private ArrayList<Usuarios> usis = new ArrayList();
    private File archivo = null;

    public adminUsuarios(String path) {

        archivo = new File(path);
    }

    public ArrayList<Usuarios> getUsis() {
        return usis;
    }

    public void setUsis(ArrayList<Usuarios> usis) {
        this.usis = usis;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setUsuarios(Usuarios a) {
        usis.add(a);
    }

    public void cargarArchivoUsuario() {
        try {
            usis = new ArrayList();
            Usuarios temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuarios) objeto.readObject()) != null) {
                        usis.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivoUsuario() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuarios t : usis) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
