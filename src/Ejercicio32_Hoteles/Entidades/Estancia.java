/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32_Hoteles.Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author altoc
 */
@Entity(name = "Estancias")
public class Estancia implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estancia_id")
    private int estancia_id;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_inicio_estancia", nullable = false)
    private Date fecha_inicio_estancia;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_fin_estancia", nullable = false)
    private Date fecha_fin_estancia;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @Column(name = "numero_personas", nullable = false)
    private int numero_personas;
    @ManyToMany
    @JoinTable(name = "Estancia_Habitacion",
        joinColumns = @JoinColumn(name = "estancia_id"),
        inverseJoinColumns = @JoinColumn(name = "habitacion_id")
    )
    private List<Habitacion> habitaciones;
    @ManyToMany
    @JoinTable(
        name = "Estancia_Suplemento",
        joinColumns = @JoinColumn(name = "estancia_id"),
        inverseJoinColumns = @JoinColumn(name = "suplemento_id")
    )
    private List<Suplemento> suplementos;
    

    //constructor por defecto
    public Estancia() {
    }
    
    //constructor con parametros

    public Estancia(int estancia_id, Date fecha_inicio_estancia, Date fecha_fin_estancia,Cliente cliente,
            int numero_personas, List<Habitacion> habitaciones, List<Suplemento> suplementos) {
        this.estancia_id = estancia_id;
        this.fecha_inicio_estancia = fecha_inicio_estancia;
        this.fecha_fin_estancia = fecha_fin_estancia;
        this.cliente = cliente;
        this.numero_personas = numero_personas;
        this.habitaciones = habitaciones;
        this.suplementos = suplementos;
    }
    
    //set and get

    public int getEstancia_id() {
        return estancia_id;
    }

    public void setEstancia_id(int estancia_id) {
        this.estancia_id = estancia_id;
    }

    public Date getFecha_inicio_estancia() {
        return fecha_inicio_estancia;
    }

    public void setFecha_inicio_estancia(Date fecha_inicio_estancia) {
        this.fecha_inicio_estancia = fecha_inicio_estancia;
    }

    public Date getFecha_fin_estancia() {
        return fecha_fin_estancia;
    }

    public void setFecha_fin_estancia(Date fecha_fin_estancia) {
        this.fecha_fin_estancia = fecha_fin_estancia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumero_personas() {
        return numero_personas;
    }

    public void setNumero_personas(int numero_personas) {
        this.numero_personas = numero_personas;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public List<Suplemento> getSuplementos() {
        return suplementos;
    }

    public void setSuplementos(List<Suplemento> suplementos) {
        this.suplementos = suplementos;
    }
    
    
    // equal and hash

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.estancia_id;
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
        final Estancia other = (Estancia) obj;
        return this.estancia_id == other.estancia_id;
    }
    
    // metodo ToString

    @Override
    public String toString() {
        return "Estancia{" + "estancia_id=" + estancia_id +
                ", fecha_inicio_estancia=" + fecha_inicio_estancia +
                ", fecha_fin_estancia=" + fecha_fin_estancia + ", cliente=" +
                cliente + ", numero_personas=" + numero_personas + 
                ", habitaciones=" + habitaciones + ", suplementos=" 
                + suplementos + '}';
    }
     
 

}
