/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo1;

import javax.swing.JFrame;

/**
 *
 * @author Estudiante
 */
public class TestPainComponent extends JFrame {

    public TestPainComponent(){
        add(new NewPanel());
    }
    
     public static void main(String[] args) {
        TestPainComponent frame = new TestPainComponent();
        frame.setTitle("TestPaintComponent");
        frame.setSize(800,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
       
    }
}
