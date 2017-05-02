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

    public NewPanel() {
        this.timer = new Timer(25,this);
        this.timer.start();
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
        g.fillOval(350, 275, 50, 50);
        g.fillOval(450, 275, 50, 50);
        g.setColor(Color.BLUE);
        g.fillRect(325, 225, 200, 50);
        int[] x = {350,400,450,500};
        int[] y = {225,175,175,225};
        g.fillPolygon(x, y, 4);
        g.setColor(Color.WHITE);
        g.drawRect(325, 175, 200, 150);
        
        
        g.setColor(Color.red);
        g.fillOval(400, 275, 50, 50);
        g.fillOval(500, 275, 50, 50);
        g.setColor(Color.BLUE);
        g.fillRect(375, 225, 200, 50);
        int[] x1 = {400,450,500,550};
        int[] y1 = {225,175,175,225};
        g.fillPolygon(x1, y1, 4);
        g.setColor(Color.WHITE);
        g.drawRect(375, 175, 200, 150);
        
        
        g.setColor(Color.red);
        g.fillOval(550, 275, 50, 50);
        g.fillOval(650, 275, 50, 50);
        g.setColor(Color.BLUE);
        g.fillRect(525, 225, 200, 50);
        int[] x2 = {550,600,650,700};
        int[] y2 = {225,175,175,225};
        g.fillPolygon(x2, y2, 4);
        g.setColor(Color.WHITE);
        g.drawRect(525, 175, 200, 150);
        System.out.println("Clik !!!");
       
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       repaint();
    }
}
