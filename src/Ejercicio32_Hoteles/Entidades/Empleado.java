package Ejercicio32_Hoteles.Entidades;

import java.util.List;
import Ejercicio32_Hoteles.Enumeraciones.RolEmpleado;
import Ejercicio32_Hoteles.Enumeraciones.RolUsuario;
import java.io.Serializable;
/**
 *
 * @author altoc
 */
public class Empleado extends Usuario {
    private int empleadoId;
    private String segundoNombre;
    private String segundoApellido;
    private String cargo;
    private float salario;
    private RolEmpleado rolEmpleado;
    private List<Actividad> actividadesLideradas;

    //constructores

    public Empleado() {
    }

    public Empleado(String codigo, String password, String nombre, String apellido, String dni, RolUsuario rol, String email,
                    int empleadoId, String segundoNombre, String segundoApellido, String cargo, float salario,
                    RolEmpleado rolEmpleado, List<Actividad> actividadesLideradas) {
        super(codigo, password, nombre, apellido, dni, rol, email);
        this.empleadoId = empleadoId;
        this.segundoNombre = segundoNombre;
        this.segundoApellido = segundoApellido;
        this.cargo = cargo;
        this.salario = salario;
        this.rolEmpleado = rolEmpleado;
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
                ", actividadesLideradas=" + actividadesLideradas + '}';
    }
    
    }
    
  
    
    
    
