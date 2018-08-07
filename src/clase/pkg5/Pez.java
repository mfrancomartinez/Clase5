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
public class Pez implements IBusquedaCodigo{
    public String codigo;
    public String nombre;
    public String ruta;

    @Override
    public String getCodigo() {
        return codigo;
    }
}
