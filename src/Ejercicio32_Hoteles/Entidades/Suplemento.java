/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32_Hoteles.Entidades;
import Ejercicio32_Hoteles.Enumeraciones.TipoSuplemento;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Entity (name = "Suplementos")
public class Suplemento implements Serializable{
    
    private static final long serialVersionUID = 0L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int suplemento_Id;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private TipoSuplemento tipoSuplemento;
    @Column(length = 255)
    private String descripcion;
    @Column(nullable = false)
    private float monto;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_inicio", nullable = false)
    private Date fechaInicio;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_fin", nullable = false)
    private Date fechaFin;
   
    @ManyToOne(optional = false) 
    @JoinColumn(name = "hotel_id",referencedColumnName = "id")
    private Hotel hotel;

    
    //constructor por defecto
    public Suplemento() {
    }
    
    //constructor con parametros

    public Suplemento(int suplemento_Id, TipoSuplemento tipoSuplemento, String descripcion,
            float monto, Date fechaInicio, Date fechaFin, Hotel hote) {
        this.suplemento_Id = suplemento_Id;
        this.tipoSuplemento = tipoSuplemento;
        this.descripcion = descripcion;
        this.monto = monto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.hotel = hotel;
    }
    
    //set and get

    public int getSuplemento_Id() {
        return suplemento_Id;
    }

    public void setSuplemento_Id(int suplemento_Id) {
        this.suplemento_Id = suplemento_Id;
    }

    public TipoSuplemento getTipoSuplemento() {
        return tipoSuplemento;
    }

    public void setTipoSuplemento(TipoSuplemento tipoSuplemento) {
        this.tipoSuplemento = tipoSuplemento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
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
        hash = 97 * hash + this.suplemento_Id;
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
        final Suplemento other = (Suplemento) obj;
        return this.suplemento_Id == other.suplemento_Id;
    }
    
    //metodo toString

    @Override
    public String toString() {
        return "Suplemento{" + "suplemento_Id=" + suplemento_Id +
                ", tipoSuplemento=" + tipoSuplemento + ", descripcion=" + 
                descripcion + ", monto=" + monto + ", fechaInicio=" +
                fechaInicio + ", fechaFin=" + fechaFin + ", hotelId=" + 
                hotel + '}';
    }
    
    
}
