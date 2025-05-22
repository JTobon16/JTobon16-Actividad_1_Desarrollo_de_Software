package Ejercicio32_Hoteles;

import Ejercicio32_Hoteles.Infraestructura.Config.BD.ConexionBd;


/**
 *
 * @author altoc
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConexionBd.conectar();
        ConexionBd.desconectar();
        
    }
    
}
