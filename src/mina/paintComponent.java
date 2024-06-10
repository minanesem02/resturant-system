/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thomas;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author CM
 */
public class jPanelGradient extends JPanel {

    public paintComponent(java.awt.Graphics g) {
   Graphics2D g2d = (Graphics2D) g;
int width = getWidth();

int height = getHeight();

Color colorl = new Color (52,50,80);

Color color2= new Color (86,180,211);
GradientPaint gp = new GradientPaint (0,0,colorl, 180, height,color2);

g2d.setPaint (gp);

g2d.fillRect(0, 0, width, height);

    }

    paintComponent() {
    }
   
    
}
