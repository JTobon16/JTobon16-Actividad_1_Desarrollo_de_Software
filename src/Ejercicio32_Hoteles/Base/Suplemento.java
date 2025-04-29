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
public class Suplemento {
    private int suplemento_Id;
    private String tipoSuplemento;
    private String descripcion;
    private double monto;
    private Date fechaInicio;
    private Date fechaFin;
    private int hotelId;
    
    
    public Suplemento() {}

    public Suplemento(
        int suplemento_Id,
        String tipoSuplemento,
        String descripcion,
        float monto,
        Date fechaInicio,
        Date fechaFin,
        int hotelId
    ) {
            this.suplemento_Id = suplemento_Id;
            this.tipoSuplemento = tipoSuplemento;
            this.descripcion = descripcion;
            this.monto = monto;
            this.fechaInicio = fechaInicio;
            this.fechaFin = fechaFin;
            this.hotelId = hotelId;
    }
}
