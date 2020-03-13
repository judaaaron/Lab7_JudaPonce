
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminBandas {

    private ArrayList<Bandas> bands = new ArrayList();
    private File archivo = null;

    public adminBandas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Bandas> getBands() {
        return bands;
    }

    public void setBands(ArrayList<Bandas> bands) {
        this.bands = bands;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setBanda(Bandas a) {
        bands.add(a);
    }

    public void cargarArchivoBandas() {
        try {
            bands = new ArrayList();
            Bandas temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Bandas) objeto.readObject()) != null) {
                        bands.add(temp);
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

    public void escribirArchivoBandas() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Bandas t : bands) {
                bw.writeObject(t);
                System.out.println(t);
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
