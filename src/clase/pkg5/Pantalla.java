/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg5;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author admin
 */
public class Pantalla implements ActionListener, IMostrar{
    JFrame marco;
    JPanel panel;
    JButton bprimero, banterior, bsiguiente, bultimo, buscar;
    JLabel imagen;
    JLabel mensaje;
    JTextField insertar;
    
    
    
    Timer temporizador;
    public int contador;
    public int delay = 1000;
    public int revoluciones;
    
    
    private final String ruta="peces/";
    int i = 1;
    IModelo modelo;
    INavegacion navegar;
    IBusquedaCodigo bcodigo;
    IBusquedaPosicion modelo2;
    
    
    public Pantalla(){
        marco = new JFrame();
        
        marco.setSize(1000, 900);
        marco.setVisible(true);        
        marco.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel = new JPanel();
        
        panel = (JPanel) marco.getContentPane();
        
        panel.setLayout(null);
        
        bprimero = new JButton("<<");
        banterior = new JButton("<");
        bsiguiente = new JButton(">");
        bultimo = new JButton(">>");
        imagen = new JLabel();
        mensaje = new JLabel("Código: ");
        insertar = new JTextField();
        buscar = new JButton("Buscar");
       
        
        panel.add(bprimero);
        panel.add(banterior);
        panel.add(bsiguiente);
        panel.add(bultimo);
        panel.add(imagen);
        panel.add (mensaje);
        panel.add (insertar);
        panel.add(buscar);
        
        bprimero.setBounds(200, 500, 100, 75);
        banterior.setBounds(400, 500, 100, 75);
        bsiguiente.setBounds(600, 500, 100, 75);
        bultimo.setBounds(800, 500, 100, 75);
        imagen.setBounds(500, 200, 200, 100);
        mensaje.setBounds(400, 300, 100, 50);
        insertar.setBounds(500,300, 100, 50);
        buscar.setBounds(650, 300, 100, 50);
        
        bprimero.setActionCommand("1");
        bprimero.addActionListener(this);
        banterior.setActionCommand("A");
        banterior.addActionListener(this);
        bsiguiente.setActionCommand("S");
        bsiguiente.addActionListener(this);
        bultimo.setActionCommand("U");
        bultimo.addActionListener(this);
        buscar.setActionCommand("B");
        buscar.addActionListener(this);
        
        
        temporizador =new Timer(delay,this);
        temporizador.setActionCommand("0");  
    }
    
    @Override
    public void actionPerformed (ActionEvent e){
        
        if("0".equals(e.getActionCommand()))
        {
           // bsiguiente.setEnabled(true);
            //bultimo.setEnabled(true);
            navegar.siguiente();
            contador++;
            if ( contador>=(modelo.getSize()-1)){
             //  bultimo.setEnabled(false);
             //  bsiguiente.setEnabled(false);
               contador=0;
               navegar.irprimero();
                
            }
            System.out.println(contador);
           
            
            
        }
        else
        
        if ("1".equals(e.getActionCommand())){
            navegar.irprimero();
        }
        else if ("A".equals(e.getActionCommand())){
            navegar.anterior();
        }
        else if ("S".equals(e.getActionCommand())){
            navegar.siguiente();
        }
        else if ("U".equals(e.getActionCommand())){
            navegar.irultimo();
        }
        else if ("B".equals(e.getActionCommand())){
            if (bcodigo.getCodigo() == insertar.getText()){
                MostrarPez(modelo2.getPosicion(insertar.getText()));
            }
                
            }
        }
        
       

    @Override
    public void MostrarPez(Pez p) {
        
       ImageIcon ic;
        ic = new ImageIcon("peces/"+ p.ruta);
        imagen.setIcon(ic); 
        
        
    }

    public void iniciar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       // temporizador.start();
       navegar.irprimero();
    }

    @Override
    public void mostrarEstados(List<Boolean> estados) {
        
        bprimero.setEnabled(estados.get(0).booleanValue());
        this.banterior.setEnabled(estados.get(1).booleanValue());
        
    }

   
    
    
}
