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
public class Empleado {
    private int empleado_Id;
    private String nombre;
    private String apellido;
    private String dni;
    private String cargo;
    private double salario;
    private String tipoEmpleado;
    private int hotel_Id;
    
      private List<Actividad> actividadesLideradas;
    
      
      
      public Empleado (){
      
      
      }
      
       public Empleado(
        int empleado_Id,
        String nombre,
        String apellido,
        String dni,
        String cargo,
        float salario,
        String tipoEmpleado,
        int hotelId,
        List<Actividad> actividadesLideradas
    ) {
        this.empleado_Id = empleado_Id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cargo = cargo;
        this.salario = salario;
        this.tipoEmpleado = tipoEmpleado;
        this.hotel_Id = hotelId;
        this.actividadesLideradas = actividadesLideradas;
    }
}