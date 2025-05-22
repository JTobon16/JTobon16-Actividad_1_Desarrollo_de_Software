/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32_Hoteles.Entidades;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author altoc
 */
public class Reserva {
    private int reservaId;
    private LocalDateTime fechaReserva;
    private Date fechaEntrada;
    private Date fechaSalida;
    private String estado;
    private int clienteId;
    private int hotelId;
    private Factura factura;


    //constructor por defecto
    public Reserva() {
    }

    //constructor con parametros

    public Reserva(int reservaId, LocalDateTime fechaReserva, Date fechaEntrada, Date fechaSalida, String estado, int clienteId, int hotelId, Factura factura) {
        this.reservaId = reservaId;
        this.fechaReserva = fechaReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
        this.clienteId = clienteId;
        this.hotelId = hotelId;
        this.factura = factura;
    }

    //set and get
    public int getReservaId() {
        return reservaId;
    }

    public void setReservaId(int reservaId) {
        this.reservaId = reservaId;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public Factura getFactura() {
        return factura;
    }

  
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    //equals and hash
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.reservaId;
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
        final Reserva other = (Reserva) obj;
        return this.reservaId == other.reservaId;
    }
    
    //metodo ToString

    @Override
    public String toString() {
        return "Reserva{" + "reservaId=" + reservaId + ", fechaReserva=" + 
                fechaReserva + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" +
                fechaSalida + ", estado=" + estado + ", clienteId=" + clienteId +
                ", hotelId=" + hotelId + ", factura=" + factura + '}';
    }

    
    
    
}
    