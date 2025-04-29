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
public class Factura {
    private int factura_Id;
    private int reservaId;
    private Date fechaEmision;
    private int diasEstancia;
    private double precioTotalHabitaciones;
    private double precioTotalSuplementos;
    private double precioTotalActividades;
    private double precioTotalFinal;
    
    
     public Factura() {}

    public Factura(
        int factura_Id,
        int reservaId,
        Date fechaEmision,
        int diasEstancia,
        float precioTotalHabitaciones,
        float precioTotalSuplementos,
        float precioTotalActividades,
        float precioTotalFinal
    ) {
            this.factura_Id = factura_Id;
            this.reservaId = reservaId;
            this.fechaEmision = fechaEmision;
            this.diasEstancia = diasEstancia;
            this.precioTotalHabitaciones = precioTotalHabitaciones;
            this.precioTotalSuplementos = precioTotalSuplementos;
            this.precioTotalActividades = precioTotalActividades;
            this.precioTotalFinal = precioTotalFinal;
    }
}
