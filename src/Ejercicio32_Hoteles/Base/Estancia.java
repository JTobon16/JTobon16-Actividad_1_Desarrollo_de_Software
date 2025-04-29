/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32_Hoteles.Base;

import java.util.Date;
import java.util.List;

/**
 *
 * @author altoc
 */
public class Estancia {
    private int estancia_Id;
    private Date fechaInicioEstancia;
    private Date fechaFinEstancia;
    private int reservaId;
    private int numeroPersonas;
    private int clienteId;
    
        
    private List<Habitacion> habitaciones;
    private List<Suplemento> suplementos;

 public Estancia() {}

    public Estancia(
        int estancia_Id,
        Date fechaInicioEstancia,
        Date fechaFinEstancia,
        int reservaId,
        int numeroPersonas,
        int clienteId,
        List<Habitacion> habitaciones,
        List<Suplemento> suplementos
    ) {
        this.estancia_Id = estancia_Id;
        this.fechaInicioEstancia = fechaInicioEstancia;
        this.fechaFinEstancia = fechaFinEstancia;
        this.reservaId = reservaId;
        this.numeroPersonas = numeroPersonas;
        this.clienteId = clienteId;
        this.habitaciones = habitaciones;
        this.suplementos = suplementos;
    }


}
