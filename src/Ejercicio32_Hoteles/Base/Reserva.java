/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32_Hoteles.Base;

import java.util.Date;

/**
 *
 * @author altoc
 */
public class Reserva {
    private int reservaId;
    private Date fechaReserva;
    private Date fechaEntrada;
    private Date fechaSalida;
    private String estado;
    private int clienteId;
    private int hotelId;

       private Factura factura;
       
       
        public Reserva() {}

    public Reserva(
        int reservaId,
        Date fechaReserva,
        Date fechaEntrada,
        Date fechaSalida,
        String estado,
        int clienteId,
        int hotelId,
        Factura factura
    ) {
            this.reservaId = reservaId;
            this.fechaReserva = fechaReserva;
            this.fechaEntrada = fechaEntrada;
            this.fechaSalida = fechaSalida;
            this.estado = estado;
            this.clienteId = clienteId;
            this.hotelId = hotelId;
            this.factura = factura;
    }
}
