
package Ejercicio32_Hoteles.Entidades;

import Ejercicio32_Hoteles.Enumeraciones.NombreActividad;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author altoc
 */

@Entity(name = "Actividades")
public class Actividad implements Serializable{
    
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actividad_id")
    private int actividad_id;
    @Enumerated(EnumType.STRING)
    @Column(name = "nombre_actividad", nullable = false)
    private NombreActividad nombre_actividad;
    @Column(name = "horario", length = 50)
    private String horario;
    @Column(name = "descripcion", length = 255)
    private String descripcion;
    @Column(name = "tipo_actividad", length = 50)
    private String tipo_actividad;
    @ManyToOne
    @JoinColumn(name = "empleado_encargado_id") 
    private Empleado empleadoEncargado;
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
    @Column(name = "precio_persona", nullable = false)
    private float precio_persona;
    @ManyToMany
    @JoinTable(
        name = "actividad_cliente",
        joinColumns = @JoinColumn(name = "actividad_id"),
        inverseJoinColumns = @JoinColumn(name = "cliente_id")
    )
    private List<Cliente> clientesParticipantes;
    
    
    //constructor por defecto

    public Actividad() {
    }
    
    //constructor con parametros

    public Actividad(int actividad_id, NombreActividad nombre_actividad, 
            String horario, String descripcion, String tipo_actividad,Empleado empleadoEncargado,Hotel hotel, 
            float precio_persona, List<Cliente> clientesParticipantes) {
        this.actividad_id = actividad_id;
        this.nombre_actividad = nombre_actividad;
        this.horario = horario;
        this.descripcion = descripcion;
        this.tipo_actividad = tipo_actividad;
        this.empleadoEncargado = empleadoEncargado;
        this.hotel = hotel;
        this.precio_persona = precio_persona;
        this.clientesParticipantes = clientesParticipantes;
    }

  
    //set and get

    public int getActividad_id() {
        return actividad_id;
    }

    public void setActividad_id(int actividad_id) {
        this.actividad_id = actividad_id;
    }

    public NombreActividad getNombre_actividad() {
        return nombre_actividad;
    }

    public void setNombre_actividad(NombreActividad nombre_actividad) {
        this.nombre_actividad = nombre_actividad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo_actividad() {
        return tipo_actividad;
    }

    public void setTipo_actividad(String tipo_actividad) {
        this.tipo_actividad = tipo_actividad;
    }
    
    public Empleado getEmpleadoEncargado() {
        return empleadoEncargado;
    }

    public void setEmpleadoEncargado(Empleado empleadoEncargado) {
        this.empleadoEncargado = empleadoEncargado;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
   
    public float getPrecio_persona() {
        return precio_persona;
    }

    public void setPrecio_persona(float precio_persona) {
        this.precio_persona = precio_persona;
    }

    public List<Cliente> getClientesParticipantes() {
        return clientesParticipantes;
    }

    public void setClientesParticipantes(List<Cliente> clientesParticipantes) {
        this.clientesParticipantes = clientesParticipantes;
    }
    
    //equal and hash

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.actividad_id;
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
        final Actividad other = (Actividad) obj;
        return this.actividad_id == other.actividad_id;
    }
    
    //metodo toString

    @Override
    public String toString() {
        return "Actividad{" + "actividad_id=" + actividad_id + 
                ", nombre_actividad=" + nombre_actividad + ", horario=" + 
                horario + ", descripcion=" + descripcion + ", tipo_actividad=" +
                tipo_actividad + ", empleadoEncargado=" + empleadoEncargado +
                ", hotel=" + hotel + ", precio_persona=" + precio_persona +
                ", clientesParticipantes=" + clientesParticipantes + '}';
    }

    
   
}
