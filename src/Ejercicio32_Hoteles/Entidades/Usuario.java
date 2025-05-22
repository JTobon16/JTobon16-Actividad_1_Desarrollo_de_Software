/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32_Hoteles.Entidades;

import java.io.Serializable;
import Ejercicio32_Hoteles.Enumeraciones.RolUsuario;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
/**
 *
 * @author altoc
 * 
 */
@Entity(name = "Usuarios")
public class Usuario implements Serializable {
    @Id
    @Column (name = "ID", length = 20)
    protected String codigo;
    @Column(nullable = false, length = 64)
    protected String password;
    @Column(nullable = false, length = 50)
    protected String nombre;
    @Column(nullable = false, length = 50)
    protected String apellido;
    @Column(nullable = false, length = 10, unique = true)
    protected String dni;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    protected RolUsuario rol;
    @Column(nullable = false, unique = true, length = 100)
    protected String email;

    // constructor por defecto
    public Usuario() {
    }
    // constructor con parametros
    public Usuario(String codigo, String password, String nombre, String apellido, String dni, RolUsuario rol, String email) {
        this.codigo = codigo;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.rol = rol;
        this.email = email;
    }

    //get and Set
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public RolUsuario getRol() {
        return rol;
    }

    public void setRol(RolUsuario rol) {
        this.rol = rol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //equal and hash
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.codigo);
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
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
   
    //metodo toString
    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + ", password=" + password + 
                ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" +
                dni + ", rol=" + rol + ", email=" + email + '}';
    }
    
    
}
