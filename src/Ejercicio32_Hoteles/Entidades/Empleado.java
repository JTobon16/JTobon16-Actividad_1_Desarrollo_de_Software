package Ejercicio32_Hoteles.Entidades;

import java.util.List;
import Ejercicio32_Hoteles.Enumeraciones.RolEmpleado;
import Ejercicio32_Hoteles.Enumeraciones.RolUsuario;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
/**
 *
 * @author altoc
 */
@Entity(name = "Empleados")
public class Empleado extends Usuario implements Serializable{
    
     private static final long serialVersionUID = 1L;
     
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empleado_id")
    private int empleadoId;
    @Column(name = "segundo_nombre", length = 50)
    private String segundoNombre;
    @Column(name = "segundo_apellido", length = 50)
    private String segundoApellido;
    @Column(name = "cargo", length = 50)
    private String cargo;
    @Column(name = "salario", nullable = false)
    private float salario;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "rol_empleado", nullable = false)
    private RolEmpleado rolEmpleado;
    @ManyToOne
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;
   @OneToMany(mappedBy = "empleadoEncargado", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Actividad> actividadesLideradas;

    //constructores

    public Empleado() {
    }

    public Empleado(String codigo, String password, String nombre, String apellido,
            String dni, RolUsuario rol, String email,
            int empleadoId, String segundoNombre, String segundoApellido, String cargo, float salario,
             RolEmpleado rolEmpleado,Hotel hotel, List<Actividad> actividadesLideradas) {
        super(codigo, password, nombre, apellido, dni, rol, email);
        this.empleadoId = empleadoId;
        this.segundoNombre = segundoNombre;
        this.segundoApellido = segundoApellido;
        this.cargo = cargo;
        this.salario = salario;
        this.rolEmpleado = rolEmpleado;
        this.hotel = hotel;
        this.actividadesLideradas = actividadesLideradas;
    }
    

    // get and set

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public RolEmpleado getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(RolEmpleado rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
    
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<Actividad> getActividadesLideradas() {
        return actividadesLideradas;
    }

    public void setActividadesLideradas(List<Actividad> actividadesLideradas) {
        this.actividadesLideradas = actividadesLideradas;
    }
    
      //metodo toString

    @Override
    public String toString() {
        return "Empleado{" + "empleadoId=" + empleadoId + ", segundoNombre=" +
                segundoNombre + ", segundoApellido=" + segundoApellido + ", cargo=" +
                cargo + ", salario=" + salario + ", rolEmpleado=" + rolEmpleado +
                ", hotel=" + (hotel != null ? hotel.getNombre_hotel() : "null") +
                ", actividadesLideradas=" + actividadesLideradas + '}';
    }
    
    }
    
  
    
    
    
