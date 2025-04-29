/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32_Hoteles.Base;

/**
 *
 * @author altoc
 */
public class Habitacion {
    private int habitacionId;
    private String numero_Habitacion;
    private String tipoHabitacion;
    private double precioNoche;
    private String estado;
    private int hotel_Id;
    
       public Habitacion() {
       }

    public Habitacion(
        int habitacionId,
        int numeroHabitacion,
        String tipoHabitacion,
        float precioNoche,
        String estado,
        int hotelId
    ) {
        this.habitacionId = habitacionId;
        this.numero_Habitacion = numero_Habitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioNoche = precioNoche;
        this.estado = estado;
        this.hotel_Id = hotel_Id;
    }
    
}
