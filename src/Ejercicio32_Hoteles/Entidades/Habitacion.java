
package Ejercicio32_Hoteles.Entidades;
import Ejercicio32_Hoteles.Enumeraciones.TipoHabitacion;
/**
 *
 * @author altoc
 */
public class Habitacion {
    private int habitacionId;
    private int numeroHabitacion;
    private TipoHabitacion tipoHabitacion;
    private double precioNoche;
    private String estado;
    private int hotelId;

    //constructor por defecto
    public Habitacion() {
    }

    //constructor con parametros
    public Habitacion(int habitacionId, int numeroHabitacion, TipoHabitacion tipoHabitacion, double precioNoche, String estado, int hotelId) {
        this.habitacionId = habitacionId;
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioNoche = precioNoche;
        this.estado = estado;
        this.hotelId = hotelId;
    }

    //set and get
    public int getHabitacionId() {
        return habitacionId;
    }

    public void setHabitacionId(int habitacionId) {
        this.habitacionId = habitacionId;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    //equal and hash
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.habitacionId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Habitacion other = (Habitacion) obj;
        return this.habitacionId == other.habitacionId;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "habitacionId=" + habitacionId + ", numeroHabitacion=" 
                + numeroHabitacion + ", tipoHabitacion=" + tipoHabitacion 
                + ", precioNoche=" + precioNoche + ", estado=" + estado 
                + ", hotelId=" + hotelId + '}';
    }
    
    
}

