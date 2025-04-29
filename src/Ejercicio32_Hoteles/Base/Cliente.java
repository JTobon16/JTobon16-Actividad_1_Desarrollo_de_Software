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
public class Cliente {
    private int cliente_Id;
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo_Electronico;
    private String direccion;
    
    private List<Reserva> reservas;
    private List<Estancia> estancias;
    private List<Actividad> actividadesParticipadas;
    
    
    public Cliente() {}

    public Cliente(
        int cliente_Id,
        String dni,
        String nombre,
        String apellido,
        String telefono,
        String correo_Electronico,
        String direccion,
        List<Reserva> reservas,
        List<Estancia> estancias,
        List<Actividad> actividadesParticipadas
    ) {
            this.cliente_Id = cliente_Id;
            this.dni = dni;
            this.nombre = nombre;
            this.apellido = apellido;
            this.telefono = telefono;
            this.correo_Electronico = correo_Electronico;
            this.direccion = direccion;
            this.reservas = reservas;
            this.estancias = estancias;
            this.actividadesParticipadas = actividadesParticipadas;
    }
}