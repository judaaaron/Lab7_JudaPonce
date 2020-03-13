
import java.util.ArrayList;


public class Eventos {
    
    private String fecha,ciudad,lugar,capacidad;
    private ArrayList<Canciones> songi = new ArrayList();

    public Eventos() {
    }

    public Eventos(String fecha, String ciudad, String lugar, String capacidad) {
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.capacidad = capacidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Canciones> getSongi() {
        return songi;
    }

    public void setSongi(ArrayList<Canciones> songi) {
        this.songi = songi;
    }

    @Override
    public String toString() {
        return "Eventos{" + "fecha=" + fecha + ", ciudad=" + ciudad + ", lugar=" + lugar + ", capacidad=" + capacidad + '}';
    }
    
    
    
}
