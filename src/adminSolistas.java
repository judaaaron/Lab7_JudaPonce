
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminSolistas {

    private ArrayList<Solistas> solis = new ArrayList();
    private File archivo = null;

    public adminSolistas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Solistas> getSolis() {
        return solis;
    }

    public void setSolis(ArrayList<Solistas> solis) {
        this.solis = solis;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setySolista(Solistas a) {
        solis.add(a);
    }

    public void cargarArchivoSolistas() {
        try {
            solis = new ArrayList();
            Solistas temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Solistas) objeto.readObject()) != null) {
                        solis.add(temp);
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

    public void escribirArchivoSolistas() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Solistas t : solis) {
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
