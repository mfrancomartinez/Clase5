/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class Pantalla implements ActionListener{
    JFrame marco;
    JPanel panel;
    JButton bprimero, banterior, bsiguiente, bultimo;
    JLabel imagen;
    ImageIcon ic;
    private final String ruta="peces/";
    int i = 1;
    
    public Pantalla(){
        marco = new JFrame();
        
        marco.setSize(1000, 700);
        marco.setVisible(true);        
        marco.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel = new JPanel();
        
        panel = (JPanel) marco.getContentPane();
        
        bprimero = new JButton("<<");
        banterior = new JButton("<");
        bsiguiente = new JButton(">");
        bultimo = new JButton(">>");        
        ic = new ImageIcon(ruta+"pez1.jpg");
        imagen = new JLabel(ic);
        
        panel.add(bprimero);
        panel.add(banterior);
        panel.add(bsiguiente);
        panel.add(bultimo);
        panel.add(imagen);
        
        bprimero.setBounds(20, 800, 100, 75);
        banterior.setBounds(200, 800, 100, 75);
        bsiguiente.setBounds(350, 800, 100, 75);
        bultimo.setBounds(500, 800, 100, 75);
        imagen.setBounds(450, 50, 200, 100);
        
        bprimero.setActionCommand("1");
        bprimero.addActionListener(this);
        banterior.setActionCommand("A");
        banterior.addActionListener(this);
        bsiguiente.setActionCommand("S");
        bsiguiente.addActionListener(this);
        bultimo.setActionCommand("U");
        bultimo.addActionListener(this);
         
    }
    
    @Override
    public void actionPerformed (ActionEvent e){
        if ("1".equals(e.getActionCommand())){
            
        }
        else if ("A".equals(e.getActionCommand())){
            
        }
        else if ("S".equals(e.getActionCommand())){
            
        }
        else if ("U".equals(e.getActionCommand())){
            
        }
    }

   
    
    
}
