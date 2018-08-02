/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg5;

/**
 *
 * @author admin
 */
public class Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Navegar navegar = new Navegar();
        Modelo modelo = new Modelo();
        Pantalla vista = new Pantalla();  
                
        navegar.modelo = modelo;
        navegar.vista = vista;
        vista.navegar = navegar;
        vista.modelo=modelo;
        
    
    
        
        vista.iniciar();
        
        
       
       
        
        
    }
    
}
