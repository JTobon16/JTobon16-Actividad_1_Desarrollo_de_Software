
package Ejercicio32_Hoteles.Entidades;
import Ejercicio32_Hoteles.Enumeraciones.TipoHabitacion;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 *
 * @author altoc
 */
@Entity (name = "Habitaciones")
public class Habitacion implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "habitacion_id")
    private int habitacionId;
    @Column(name = "numero_habitacion", nullable = false)
    private int numeroHabitacion;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_habitacion", nullable = false)
    private TipoHabitacion tipoHabitacion;
    @Column(name = "precio_noche", nullable = false)
    private double precioNoche;
    @Column(name = "estado", length = 50, nullable = false)
    private String estado;
    @ManyToOne
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

    //constructor por defecto
    public Habitacion() {
    }

    //constructor con parametros
    public Habitacion(int habitacionId, int numeroHabitacion, TipoHabitacion tipoHabitacion, double precioNoche, String estado, Hotel hotel) {
        this.habitacionId = habitacionId;
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioNoche = precioNoche;
        this.estado = estado;
        this.hotel = hotel;
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

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotelId(Hotel hotel) {
        this.hotel = hotel;
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
                + ", hotel=" + (hotel != null ? hotel.getNombre_hotel() : "null") +
                '}';
    }
    
    
}

