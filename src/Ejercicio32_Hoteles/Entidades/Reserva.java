/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32_Hoteles.Entidades;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author altoc
 */

@Entity(name = "Reservas")
public class Reserva implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reserva_id")
    private int reservaId;
    @Column(name = "fecha_reserva", nullable = false)
    private LocalDateTime fechaReserva;
    @Temporal(TemporalType.DATE) 
    @Column(name = "fecha_entrada", nullable = false)
    private Date fechaEntrada;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_salida", nullable = false)
    private Date fechaSalida;
    @Column(name = "estado", length = 50)
    private String estado;
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "factura_id")
    private Factura factura;


    //constructor por defecto
    public Reserva() {
    }

    //constructor con parametros

    public Reserva(int reservaId, LocalDateTime fechaReserva, Date fechaEntrada,
                    Date fechaSalida, String estado, Cliente cliente, Hotel hotel, Factura factura) {
        this.reservaId = reservaId;
        this.fechaReserva = fechaReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
        this.cliente = cliente;
        this.hotel = hotel;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
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
        return "Reserva{" + "reservaId=" + reservaId + 
                ", fechaReserva=" + fechaReserva + ", fechaEntrada=" +
                fechaEntrada + ", fechaSalida=" + fechaSalida + ", estado=" + 
                estado + ", cliente=" + cliente + ", hotel=" + hotel + 
                ", factura=" + factura + '}';
    }

    
    
    
    
}
    