/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Jivan
 */
public class CommonFunctions
{
    public static void addLabelBackground(JLabel lblJLabel, String path)
    {
        BufferedImage img = null;
        try
        {
            img = ImageIO.read(new File(path));
            Image newimg = img.getScaledInstance(lblJLabel.getWidth(), lblJLabel.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(newimg);
            lblJLabel.setIcon(icon);
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public static void alphabetValidation(java.awt.event.KeyEvent evt)
    {
        char ch = evt.getKeyChar();
        if(Character.isAlphabetic(ch))
        {
            //let the event happened
        }
        else
        {
            //consume the event
            evt.consume();
        }
    }
        
    public static void numericValidation(java.awt.event.KeyEvent evt)
    {
        char ch = evt.getKeyChar();
        if(Character.isDigit(ch) || ch=='.')
        {
            //let the event happened
        }
        else
        {
            //consume the event
            evt.consume();
        }
    }
}
