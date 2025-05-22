/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32_Hoteles.Entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author altoc
 */
public class Estancia {
    private int estancia_id;
    private Date fecha_inicio_estancia;
    private Date fecha_fin_estancia;
    private int numero_personas;
    private List<Habitacion> habitaciones;
    private List<Suplemento> suplementos;

    //constructor por defecto
    public Estancia() {
    }
    
    //constructor con parametros

    public Estancia(int estancia_id, Date fecha_inicio_estancia, Date fecha_fin_estancia,
            int numero_personas, List<Habitacion> habitaciones, List<Suplemento> suplementos) {
        this.estancia_id = estancia_id;
        this.fecha_inicio_estancia = fecha_inicio_estancia;
        this.fecha_fin_estancia = fecha_fin_estancia;
        this.numero_personas = numero_personas;
        this.habitaciones = habitaciones;
        this.suplementos = suplementos;
    }
    

 


}
