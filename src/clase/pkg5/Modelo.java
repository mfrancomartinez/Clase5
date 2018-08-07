/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg5;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Modelo implements IModelo, IBusquedaPosicion{
    ArrayList <Pez> lista;
    
    public Modelo(){
    
    lista = new ArrayList();
    
    for (int i = 0; i<47;i++)
    {
        Pez p = new Pez();
        p.nombre = "Pez "+i;
        p.codigo = "P"+i;
        p.ruta ="pez"+(i+1)+".jpg";
        lista.add(p);
    }
    
}

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Pez get(int posicion) {
        return lista.get(posicion);
    }

    @Override
    public Pez getPosicion(String codigo) {        
        Pez elpez=null;
        int i;
        
        for ( i = 0; i<lista.size(); i++){
          if (lista.get(i).codigo == codigo){
              break;
          }        
        }        
        if(i!=lista.size())
        {
            elpez= lista.get(i);
        }
        
        return elpez;
    }

    
    
    
   
    
}
