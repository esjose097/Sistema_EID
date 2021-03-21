/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloComponentes;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

/**
 *
 * @author Eliu
 */
public class RoundedBorder implements Border{
    
    private int radius;
    
    public RoundedBorder(int radius){
        this.radius=radius;
    }
    
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
         g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }

    @Override
    public Insets getBorderInsets(Component arg0) {
         return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }
    
}
