/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32_Hoteles.Entidades;

import Ejercicio32_Hoteles.Enumeraciones.NombreActividad;
import java.util.List;

/**
 *
 * @author altoc
 */
public class Actividad {
    private int actividad_id;
    private NombreActividad nombre_actividad;
    private String horario;
    private String descripcion;
    private String tipo_actividad;
    private float precio_persona;
    private List<Cliente> clientesParticipantes;
    
    
    //constructor por defecto

    public Actividad() {
    }
    
    //constructor con parametros

    public Actividad(int actividad_id, NombreActividad nombre_actividad, 
            String horario, String descripcion, String tipo_actividad, 
            float precio_persona, List<Cliente> clientesParticipantes) {
        this.actividad_id = actividad_id;
        this.nombre_actividad = nombre_actividad;
        this.horario = horario;
        this.descripcion = descripcion;
        this.tipo_actividad = tipo_actividad;
        this.precio_persona = precio_persona;
        this.clientesParticipantes = clientesParticipantes;
    }
   
    //set and get

    public int getActividad_id() {
        return actividad_id;
    }

    public void setActividad_id(int actividad_id) {
        this.actividad_id = actividad_id;
    }

    public NombreActividad getNombre_actividad() {
        return nombre_actividad;
    }

    public void setNombre_actividad(NombreActividad nombre_actividad) {
        this.nombre_actividad = nombre_actividad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo_actividad() {
        return tipo_actividad;
    }

    public void setTipo_actividad(String tipo_actividad) {
        this.tipo_actividad = tipo_actividad;
    }

    public float getPrecio_persona() {
        return precio_persona;
    }

    public void setPrecio_persona(float precio_persona) {
        this.precio_persona = precio_persona;
    }

    public List<Cliente> getClientesParticipantes() {
        return clientesParticipantes;
    }

    public void setClientesParticipantes(List<Cliente> clientesParticipantes) {
        this.clientesParticipantes = clientesParticipantes;
    }
    
    //equal and hash

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.actividad_id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actividad other = (Actividad) obj;
        return this.actividad_id == other.actividad_id;
    }
    
    //metodo toString

    @Override
    public String toString() {
        return "Actividad{" + "actividad_id=" + actividad_id + ", nombre_actividad=" +
                nombre_actividad + ", horario=" + horario + ", descripcion=" + descripcion +
                ", tipo_actividad=" + tipo_actividad + ", precio_persona=" + precio_persona + 
                ", clientesParticipantes=" + clientesParticipantes + '}';
    }
    
}
