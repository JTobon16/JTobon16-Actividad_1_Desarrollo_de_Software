/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32_Hoteles.Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author altoc
 */

@Entity (name = "Clientes")
public class Cliente implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private int cliente_Id;
    @Column(name = "dni", nullable = false, unique = true, length = 20)
    private String dni;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;
    @Column(name = "telefono", length = 20)
    private String telefono;
    @Column(name = "correo_electronico", length = 100)
    private String correo_Electronico;
    @Column(name = "direccion", length = 150)
    private String direccion;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reserva> reservas;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Estancia> estancias;
    @ManyToMany(mappedBy = "clientesParticipantes", cascade = CascadeType.ALL)
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
        return "Cliente{" +
                "cliente_Id=" + cliente_Id +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo_Electronico='" + correo_Electronico + '\'' +
                ", direccion='" + direccion + '\'' +
                ", reservas=" + (reservas != null ? reservas.size() : 0) +
                ", estancias=" + (estancias != null ? estancias.size() : 0) +
                ", actividadesParticipadas=" + (actividadesParticipadas != null ? actividadesParticipadas.size() : 0) +
                '}';
    
    
     }
}

