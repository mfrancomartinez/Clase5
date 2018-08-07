/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase.pkg5;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;

/**
 *
 * @author admin
 */
public class Navegar implements INavegacion,IActivarDesactivar {

    IModelo modelo;
    IMostrar vista;
    public int posicion;
    private List<Boolean> listaEstados;
    

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    
    public Navegar()
    {
        listaEstados=new ArrayList();
        for(int i=0;i<4; i++)
        {
         
         listaEstados.add(new Boolean(true));
        }
    }
    
  
    @Override
    public void siguiente() {
        
        posicion = posicion + 1;
        if (posicion == modelo.getSize()) {
            posicion = modelo.getSize() - 1;
        }
        if (posicion == modelo.getSize()-1){
        }
        Pez p = modelo.get(posicion);
        activarDesactivar();
        
        vista.MostrarPez(p);
       vista.mostrarEstados(listaEstados);
    }

    @Override
    public void anterior() {
        posicion = posicion - 1;
        if (posicion < 0) {
            posicion = 0;
        }

        Pez p = modelo.get(posicion);
        activarDesactivar();
        vista.MostrarPez(p);
vista.mostrarEstados(listaEstados);
    }

    @Override
    public void irprimero() {

        posicion = 0;
        Pez p = modelo.get(posicion);
        activarDesactivar();
        vista.MostrarPez(p);
        vista.mostrarEstados(listaEstados);
    }

    @Override
    public void irultimo() {
        posicion = modelo.getSize() - 1;
        Pez p = modelo.get(posicion);
        activarDesactivar();
        vista.MostrarPez(p);
        vista.mostrarEstados(listaEstados);
        
    }

    @Override
    public void activarDesactivar() {
       
        listaEstados.set(0, posicion!=0);
        listaEstados.set(1, posicion!=0);
        
        listaEstados.set(2, posicion!= modelo.getSize()-1);
        listaEstados.set(3, posicion!= modelo.getSize()-1);
                
        
    }

  

}
