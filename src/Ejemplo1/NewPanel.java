/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 */
public class NewPanel extends JPanel implements ActionListener,MouseListener {
    
    private Timer timer;
    private int x;
    private int y;

    public NewPanel() {
        this.addMouseListener(this);
        this.timer = new Timer(25,this);
        this.timer.start();
        this.x=0;
        
        
    }
    
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Image fondo = loadImage("fondo.png");
         g.drawImage(fondo, 0, 0, 800, 400, this);
//        g.drawLine(0, 0, 50, 50);
//        g.drawString("Banner", 0, 40);
        g.setColor(Color.red);
        g.fillRect(25, y+75, 25, 50);
        g.setColor(Color.BLUE);
        g.fillRect(100, y+25, 25, 50);
        g.setColor(Color.CYAN);
        g.fillRect(125, y+50, 25, 50);
        g.setColor(Color.GREEN);
        g.fillRect(200, y+75, 25, 50);
        g.setColor(Color.RED);
//        g.drawRect(75, 150, 50, 50);
//        g.drawRect(80, 200, 10, 75);
//        g.drawRect(110, 200, 10, 75);
//        g.drawOval(87, 125, 25, 25);
//        
        g.setColor(Color.red);
        g.fillOval(x, 275, 50, 50);
        g.fillOval(x+100, 275, 50, 50);
        g.setColor(Color.BLUE);
        g.fillRect(x-25, 225, 200, 50);
        int[] x = {this.x,this.x+50,this.x+100,this.x+150};
        int[] y = {225,175,175,225};
        g.fillPolygon(x, y, 4);
        g.setColor(Color.WHITE);
        //g.drawRect(this.x-25, 175, 200, 150);
        g.fillRect(500, 175, 20, 150);
        
        
       
       
        //System.out.println("Clik !!!");
       
            
    }
    
    public Image loadImage(String imageName){
        ImageIcon ii= new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
    
    public Rectangle getBounds(){
        return new Rectangle(this.x-25, 175, 200, 150);
    }

    public void CheckColission(){
        Rectangle carro = this.getBounds();
        Rectangle obstaculo1 = new Rectangle(500, 175, 20, 150);
        Rectangle obstaculo2 = new Rectangle(25, y+75, 25, 50);
        
        if(carro.intersects(obstaculo1)||carro.intersects(obstaculo2)){
            System.out.println("Colisión!!!");
            this.timer.stop();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       this.CheckColission();
       repaint();
       x=x+3;
       y=y+5;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hiciste click!!");
        Point mp = e.getPoint();
        if(getBounds().contains(mp)){
            try {
                this.timer.stop();
                Thread.sleep(1000);
                this.timer.start();
            } catch (InterruptedException ex) {
                Logger.getLogger(NewPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
