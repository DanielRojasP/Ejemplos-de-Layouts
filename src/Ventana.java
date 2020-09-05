
import javax.swing.*;
import java.awt.BorderLayout; //    Bordes
import java.awt.GridLayout; //Tabla
import java.awt.FlowLayout; //Fluidos

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author (2020) Daniel Rojas Porras
 */
public class Ventana extends JFrame {
    
    private JPanel panel1;
    private JPanel panel2;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    public Ventana(){
        this.setLayout(new BorderLayout()); //Layout que se maneja por direccion en la ventana
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        
        panel2.setLayout(new GridLayout(4,4,6,11)); //los numeros correspomden a:
        //filas, columnas, espacio libre en filas y espacio libre entre columnas
        
        b1 = new JButton("b1");
        b2 = new JButton("b2");
        b3 = new JButton("b3");
        b4 = new JButton("b4");
        b5 = new JButton("b5");
        b6 = new JButton("b6");
        b7 = new JButton("b7");
        b8 = new JButton("b8");
        b9 = new JButton("b9");
         
        //se añaden los paneles a la ventana (JFrame)
        
        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.SOUTH);
       
        
        
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        panel2.add(b4);
        panel2.add(b5);
        panel2.add(b6);
        panel2.add(b7);
        panel2.add(b8);
        panel2.add(b9);
             
        
    }
    
}
