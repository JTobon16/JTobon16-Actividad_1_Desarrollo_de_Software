/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32_Hoteles.Entidades;
import Ejercicio32_Hoteles.Enumeraciones.TipoSuplemento;
import java.util.Date;

/**
 *
 * @author altoc
 */
public class Suplemento {
    private int suplemento_Id;
    private TipoSuplemento tipoSuplemento;
    private String descripcion;
    private float monto;
    private Date fechaInicio;
    private Date fechaFin;
    private int hotelId;

    
    //constructor por defecto
    public Suplemento() {
    }
    
    //constructor con parametros

    public Suplemento(int suplemento_Id, TipoSuplemento tipoSuplemento, String descripcion,
            float monto, Date fechaInicio, Date fechaFin, int hotelId) {
        this.suplemento_Id = suplemento_Id;
        this.tipoSuplemento = tipoSuplemento;
        this.descripcion = descripcion;
        this.monto = monto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.hotelId = hotelId;
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
        return "Suplemento{" + "suplemento_Id=" + suplemento_Id + ", tipoSuplemento=" + tipoSuplemento + ", descripcion=" + descripcion + ", monto=" + monto + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", hotelId=" + hotelId + '}';
    }
    
    
}
