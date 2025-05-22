/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32_Hoteles.Entidades;

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

    
    //constructor por defecto
    public Cliente(){
    }
    
    //constructor con parametros
    public Cliente(int cliente_Id, String dni, String nombre, String apellido,
            String telefono, String correo_Electronico, String direccion, 
            List<Reserva> reservas, List<Estancia> estancias, List<Actividad> 
            actividadesParticipadas) {
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

    
    // get and set
    public int getCliente_Id() {
        return cliente_Id;
    }

    public void setCliente_Id(int cliente_Id) {
        this.cliente_Id = cliente_Id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_Electronico() {
        return correo_Electronico;
    }

    public void setCorreo_Electronico(String correo_Electronico) {
        this.correo_Electronico = correo_Electronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public List<Estancia> getEstancias() {
        return estancias;
    }

    public void setEstancias(List<Estancia> estancias) {
        this.estancias = estancias;
    }

    public List<Actividad> getActividadesParticipadas() {
        return actividadesParticipadas;
    }

    public void setActividadesParticipadas(List<Actividad> actividadesParticipadas) {
        this.actividadesParticipadas = actividadesParticipadas;
    }

    //equal and hash
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.cliente_Id;
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
        final Cliente other = (Cliente) obj;
        return this.cliente_Id == other.cliente_Id;
    }
//metodo toString
    @Override
    public String toString() {
        return "Cliente{" + "cliente_Id=" + cliente_Id + ", dni=" + dni 
                + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" 
                + telefono + ", correo_Electronico=" + correo_Electronico 
                + ", direccion=" + direccion + ", reservas=" + reservas 
                + ", estancias=" + estancias + ", actividadesParticipadas=" 
                + actividadesParticipadas + '}';
    }
    
    
    
}

