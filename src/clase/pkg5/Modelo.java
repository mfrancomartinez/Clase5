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
public class Modelo implements IModelo{
    ArrayList <Pez> lista;
    int i;
    public Modelo(){
    
    lista = new ArrayList();
    Pez p = new Pez();
    for (i = 1; i<lista.size();i++)
    p.nombre = "Pez"+i;
    p.codigo = "P"+i;
    p.ruta ="pez"+i+".jpg";
    
}

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Pez get(int posicion) {
        return lista.get(posicion);
    }
    
    
   
    
}
