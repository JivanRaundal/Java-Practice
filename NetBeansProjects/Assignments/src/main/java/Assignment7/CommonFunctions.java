
package Assignment7;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class CommonFunctions 
{

    private static CommonFunctions obj;
    private static Thread t;
    private static boolean val = true;

    public static void addButtonBackground(JButton btn, String path)
    {
        BufferedImage img = null;
        try
        {
            img = ImageIO.read(new File(path));
            Image newimg = img.getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(newimg);
            btn.setIcon(icon);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void addLabelBackground(JLabel lbl, String path)
    {
        BufferedImage img = null;
        try
        {
            img = ImageIO.read(new File(path));
            Image newimg = img.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(newimg);
            lbl.setIcon(icon);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }   

    public void clock(JLabel lbl)
    {
        t = new Thread()            //Inner anonymous Thred class for running time 
        {
            synchronized public void run()
            {
                try
                {
                    while(val)
                    {
                        Calendar cld = Calendar.getInstance();
                        Date d = cld.getTime();
                        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
                        String str = sd.format(d);
                        lbl.setText(str);
                        wait(1000);
                    }
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        //starting Thread here
        t.start();
    }
    public static void addDateTime(JLabel lbl)
    {
        obj = new CommonFunctions();
        obj.clock(lbl);
    }
    public static void stopThread()    
    {
        //val = false;
        System.exit(0);
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
    public static void integerValidation(java.awt.event.KeyEvent evt)
    {
        char ch = evt.getKeyChar();
        if(Character.isDigit(ch))
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
