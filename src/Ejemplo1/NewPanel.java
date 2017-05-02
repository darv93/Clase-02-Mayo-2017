/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 */
public class NewPanel extends JPanel implements ActionListener{
    
    private Timer timer;
    private int x;

    public NewPanel() {
        this.timer = new Timer(25,this);
        this.timer.start();
        this.x=50;
        
    }
    
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        
//        g.drawLine(0, 0, 50, 50);
//        g.drawString("Banner", 0, 40);
//        g.setColor(Color.red);
//        g.drawRect(25, 75, 25, 50);
//        g.setColor(Color.BLUE);
//        g.drawRect(100, 25, 25, 50);
//        g.setColor(Color.CYAN);
//        g.drawRect(125, 50, 25, 50);
//        g.setColor(Color.GREEN);
//        g.drawRect(200, 75, 25, 50);
//        g.setColor(Color.RED);
//        g.drawRect(75, 150, 50, 50);
//        g.drawRect(80, 200, 10, 75);
//        g.drawRect(110, 200, 10, 75);
//        g.drawOval(87, 125, 25, 25);
        
        g.setColor(Color.red);
        g.fillOval(x, 275, 50, 50);
        g.fillOval(x+100, 275, 50, 50);
        g.setColor(Color.BLUE);
        g.fillRect(x-25, 225, 200, 50);
        int[] x = {this.x,this.x+50,this.x+100,this.x+150};
        int[] y = {225,175,175,225};
        g.fillPolygon(x, y, 4);
        g.setColor(Color.WHITE);
        g.drawRect(this.x-25, 175, 200, 150);
        
       
        System.out.println("Clik !!!");
       
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
       repaint();
       x=x+1;
    }
}
