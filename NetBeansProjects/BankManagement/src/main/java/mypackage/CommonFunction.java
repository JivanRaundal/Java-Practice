
package mypackage;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CommonFunction
{
     public static Connection getConnection()
    {
        Connection con = null;
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementdb","root","7183");
        } 
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error = "+e);
            e.printStackTrace();
        }
        return con;
    }
    public static void addLabelBackground(JLabel lbl,String path)
    {
        BufferedImage img=null;
        try
        {
            img=ImageIO.read(new File(path));
            Image newimg=img.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon=new ImageIcon(newimg);
            lbl.setIcon(icon);
        } 
        catch (Exception e)
        {
            System.out.println("Exception caught");
        }
    }
    public static void validateIsAlphabetic(java.awt.event.KeyEvent evt)                                  
    {                                      
        if(Character.isAlphabetic(evt.getKeyChar())==false)
        {
            evt.consume();
        }
    }                                 

    public static void validateIsDigit(java.awt.event.KeyEvent evt)                                  
    {                                      
        if(Character.isDigit(evt.getKeyChar())==false)
        {
            evt.consume();
        }
    }
    public static String getTodayDate()
    {
        String mydate;
        Calendar cld=Calendar.getInstance();
        Date d=cld.getTime();
        SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy  hh:mm:ss");
        mydate=sd.format(d);
        return mydate;   
    }
    public static void exitApp(java.awt.Frame parent)
    {
        int res=JOptionPane.showConfirmDialog(parent,"Exit?","Please Confirm",JOptionPane.YES_NO_OPTION);
        if(JOptionPane.YES_NO_OPTION==res)
        {
            parent.dispose();
        }
    }
}
