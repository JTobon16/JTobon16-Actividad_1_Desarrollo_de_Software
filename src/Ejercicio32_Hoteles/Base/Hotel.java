/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32_Hoteles.Base;

import java.util.List;

/**
 *
 * @author altoc
 */
public class Hotel {
    
  private  int hotel_id;
  private String nombre_hotel;
  private int categoria_estrella;
  private String direccion;
  private String telefono_contacto;
  private int director_id;
  
    private List<Empleado> empleados;
    private List<Habitacion> habitaciones;
    private List<Reserva> reservasRecibidas;
    private List<Suplemento> suplementos;
    private List<Actividad> actividades;
    
    
        public Hotel() {
    }
        
        
        public Hotel(
    int hotel_id,
    String nombre_hotel,
    int categoria_estrella,
    String direccion,
    String telefono_contacto,
    int director_id,
    List<Empleado> empleados,
    List<Habitacion> habitaciones,
    List<Reserva> reservasRecibidas,
    List<Suplemento> suplementos,
    List<Actividad> actividades
) {
             this.hotel_id = hotel_id;
             this.nombre_hotel = nombre_hotel;
             this.categoria_estrella = categoria_estrella;
             this.direccion = direccion;
             this.telefono_contacto = telefono_contacto;
             this.director_id = director_id;
             this.empleados = empleados;
             this.habitaciones = habitaciones;
             this.reservasRecibidas = reservasRecibidas;
             this.suplementos = suplementos;
             this.actividades = actividades;
        }
} 