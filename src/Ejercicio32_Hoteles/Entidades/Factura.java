/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32_Hoteles.Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author altoc
 */

@Entity(name = "Facturas" )
public class Factura implements Serializable{
    
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "factura_id")
    private int factura_Id;
    @ManyToOne
    @JoinColumn(name = "reserva_id", referencedColumnName = "reserva_id")
    private Reserva reserva;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_emision")
    private Date fechaEmision;
    @Column(name = "dias_estancia")
    private int diasEstancia;
    @Column(name = "precio_total_habitaciones")
    private double precioTotalHabitaciones;
    @Column(name = "precio_total_suplementos")
    private double precioTotalSuplementos;
    @Column(name = "precio_total_actividades")
    private double precioTotalActividades;
    @Column(name = "precio_total_final")
    private double precioTotalFinal;
    
    
    
    //contructor por defecto

    public Factura() {
    }
    
    //constructor con parametros

    public Factura(int factura_Id, Reserva reserva, Date fechaEmision, 
            int diasEstancia, double precioTotalHabitaciones, 
            double precioTotalSuplementos, double precioTotalActividades,
            double precioTotalFinal) {
        this.factura_Id = factura_Id;
        this.reserva = reserva;
        this.fechaEmision = fechaEmision;
        this.diasEstancia = diasEstancia;
        this.precioTotalHabitaciones = precioTotalHabitaciones;
        this.precioTotalSuplementos = precioTotalSuplementos;
        this.precioTotalActividades = precioTotalActividades;
        this.precioTotalFinal = precioTotalFinal;
    }
    
    
    // set and get

    public int getFactura_Id() {
        return factura_Id;
    }

    public void setFactura_Id(int factura_Id) {
        this.factura_Id = factura_Id;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public int getDiasEstancia() {
        return diasEstancia;
    }

    public void setDiasEstancia(int diasEstancia) {
        this.diasEstancia = diasEstancia;
    }

    public double getPrecioTotalHabitaciones() {
        return precioTotalHabitaciones;
    }

    public void setPrecioTotalHabitaciones(double precioTotalHabitaciones) {
        this.precioTotalHabitaciones = precioTotalHabitaciones;
    }

    public double getPrecioTotalSuplementos() {
        return precioTotalSuplementos;
    }

    public void setPrecioTotalSuplementos(double precioTotalSuplementos) {
        this.precioTotalSuplementos = precioTotalSuplementos;
    }

    public double getPrecioTotalActividades() {
        return precioTotalActividades;
    }

    public void setPrecioTotalActividades(double precioTotalActividades) {
        this.precioTotalActividades = precioTotalActividades;
    }

    public double getPrecioTotalFinal() {
        return precioTotalFinal;
    }

    public void setPrecioTotalFinal(double precioTotalFinal) {
        this.precioTotalFinal = precioTotalFinal;
    }
    
    // equal and hash

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.factura_Id;
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
        final Factura other = (Factura) obj;
        return this.factura_Id == other.factura_Id;
    }
    
    // metodo toString

    @Override
    public String toString() {
        return "Factura{" + "factura_Id=" + factura_Id + ", reserva=" +
                reserva + ", fechaEmision=" + fechaEmision + ", diasEstancia=" +
                diasEstancia + ", precioTotalHabitaciones=" +
                precioTotalHabitaciones + ", precioTotalSuplementos=" + 
                precioTotalSuplementos + ", precioTotalActividades=" + 
                precioTotalActividades + ", precioTotalFinal=" + 
                precioTotalFinal + '}';
    }
    
    
}
