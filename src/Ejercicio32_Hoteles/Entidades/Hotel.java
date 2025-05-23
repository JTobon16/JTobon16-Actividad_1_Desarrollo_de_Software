/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32_Hoteles.Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author altoc
 */
@Entity(name = "Hoteles")
public class Hotel implements Serializable{
    
     private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_id") 
    private int hotelId;
    @Column(name = "nombre_hotel", nullable = false, length = 100)
    private String nombre_hotel;
    @Column(name = "categoria_estrella", nullable = false)
    private int categoria_estrella;
    @Column(name = "direccion", length = 150)
    private String direccion;
    @Column(name = "telefono_contacto", length = 20)
    private String telefono_contacto;
    
    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Empleado> empleados;
    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Habitacion> habitaciones;
    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reserva> reservasRecibidas;
    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Suplemento> suplementos;
    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Actividad> actividades;
    

    
    //constructor por defecto

    public Hotel() {
    }
    
    //constructor con parametros

    public Hotel(int hotelId, String nombre_hotel, int categoria_estrella, 
            String direccion, String telefono_contacto, List<Empleado> empleados,
            List<Habitacion> habitaciones, List<Reserva> reservasRecibidas,
            List<Suplemento> suplementos, List<Actividad> actividades) {
        this.hotelId = hotelId;
        this.nombre_hotel = nombre_hotel;
        this.categoria_estrella = categoria_estrella;
        this.direccion = direccion;
        this.telefono_contacto = telefono_contacto;
        this.empleados = empleados;
        this.habitaciones = habitaciones;
        this.reservasRecibidas = reservasRecibidas;
        this.suplementos = suplementos;
        this.actividades = actividades;
    }
    
    //set and get

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getNombre_hotel() {
        return nombre_hotel;
    }

    public void setNombre_hotel(String nombre_hotel) {
        this.nombre_hotel = nombre_hotel;
    }

    public int getCategoria_estrella() {
        return categoria_estrella;
    }

    public void setCategoria_estrella(int categoria_estrella) {
        this.categoria_estrella = categoria_estrella;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono_contacto() {
        return telefono_contacto;
    }

    public void setTelefono_contacto(String telefono_contacto) {
        this.telefono_contacto = telefono_contacto;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public List<Reserva> getReservasRecibidas() {
        return reservasRecibidas;
    }

    public void setReservasRecibidas(List<Reserva> reservasRecibidas) {
        this.reservasRecibidas = reservasRecibidas;
    }

    public List<Suplemento> getSuplementos() {
        return suplementos;
    }

    public void setSuplementos(List<Suplemento> suplementos) {
        this.suplementos = suplementos;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }
    
    //equal and hash

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.hotelId;
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
        final Hotel other = (Hotel) obj;
        return this.hotelId == other.hotelId;
    }
    
    //metodo toString

    @Override
    public String toString() {
        return "Hotel{" + "hotelId=" + hotelId + ", nombre_hotel=" + nombre_hotel +
                ", categoria_estrella=" + categoria_estrella + ", direccion=" +
                direccion + ", telefono_contacto=" + telefono_contacto + ", empleados=" +
                empleados + ", habitaciones=" + habitaciones + ", reservasRecibidas=" +
                reservasRecibidas + ", suplementos=" + suplementos + ", actividades=" +
                actividades + '}';
    }
}