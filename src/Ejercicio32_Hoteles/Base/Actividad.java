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
public class Actividad {
    private int actividad_Id;
    private String nombreActividad;
    private String horario;
    private String descripcion;
    private String tipoActividad;
    private double precioPersona;
    private int empleadoId;
    private int hotelId;
    
       private List<Cliente> clientesParticipantes;
       
       
        public Actividad() {}

    public Actividad(
        int actividad_Id,
        String nombreActividad,
        String horario,
        String descripcion,
        String tipoActividad,
        float precioPersona,
        int empleadoId,
        int hotelId,
        List<Cliente> clientesParticipantes
    ) {
            this.actividad_Id = actividad_Id;
            this.nombreActividad = nombreActividad;
            this.horario = horario;
            this.descripcion = descripcion;
            this.tipoActividad = tipoActividad;
            this.precioPersona = precioPersona;
            this.empleadoId = empleadoId;
            this.hotelId = hotelId;
            this.clientesParticipantes = clientesParticipantes;
    }
}
