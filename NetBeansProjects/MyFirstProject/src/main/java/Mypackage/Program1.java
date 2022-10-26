
package Mypackage;

import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class Myframe1 extends Frame
{
    Panel mainPanel, subPanel;
    TextField txtnum1, txtnum2;
    Label lblnum1, lblnum2, lblans;
    Button btnadd, btnsub;    
    
    public Myframe1()
    {
        setSize(400,350);
        setTitle("CALCULATOR");
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        
        initialize();
        
        setVisible(true);
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }

    private void initialize()
    {
        Font f = new Font("verdena", Font.BOLD, 20);
        
        //adding mainPanel & subPanel
        mainPanel = new Panel();
        mainPanel.setBounds(0, 0, getWidth(), getHeight());
        mainPanel.setBackground(new Color(202, 187, 137));
        mainPanel.setLayout(null);
        
        subPanel = new Panel();
        subPanel.setBounds(20,45,360,120);
        subPanel.setLayout(null);
        subPanel.setBackground(new Color(237, 232, 215));
        mainPanel.add(subPanel);
        
        //adding TextField
        txtnum1 = new TextField();
        txtnum1.setBounds(30,60,135,30);
        txtnum1.setFont(f);
        txtnum1.setBackground(new Color(202, 187, 137));
        txtnum1.setForeground(Color.black);
        txtnum1.requestFocus();
        subPanel.add(txtnum1);
        
        txtnum2 = new TextField();
        txtnum2.setBounds(195,60,135,30);
        txtnum2.setFont(f);
        txtnum2.setBackground(new Color(202, 187, 137));
        txtnum2.setForeground(Color.black);
        subPanel.add(txtnum2);
        //connections
        MyKeyListener1 mkl = new MyKeyListener1();
        txtnum1.addKeyListener(mkl);
        txtnum2.addKeyListener(mkl);
        
        //adding Label
        lblnum1 = new Label("NUMBER-1");
        lblnum1.setBounds(30,30,135,30);
        lblnum1.setFont(f);
        lblnum1.setAlignment(Label.CENTER);
        lblnum1.setForeground(new Color(89, 82, 60));
        subPanel.add(lblnum1);
        
        lblnum2 = new Label("NUMBER-2");
        lblnum2.setBounds(195,30,135,30);
        lblnum2.setFont(f);
        lblnum2.setAlignment(Label.CENTER);
        lblnum2.setForeground(new Color(89, 82, 60));
        subPanel.add(lblnum2);
        
        //adding Button
        btnadd = new Button("ADD");
        btnadd.setBounds(50,205,135,35);
        btnadd.setFont(f);
        btnadd.setBackground(new Color(89, 82, 60));
        btnadd.setForeground(Color.yellow);
        btnadd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        mainPanel.add(btnadd);
        
        btnsub = new Button("SUB");
        btnsub.setBounds(215,205,135,35);
        btnsub.setFont(f);
        btnsub.setBackground(new Color(89, 82, 60));
        btnsub.setForeground(Color.yellow);
        btnsub.setCursor(new Cursor(Cursor.HAND_CURSOR));
        mainPanel.add(btnsub);
        //conections
        MyActionListener1 mal = new MyActionListener1(this);
        btnadd.addActionListener(mal);
        btnsub.addActionListener(mal);
        
        //adding Label lblans
        lblans = new Label("ANSWER HERE");
        lblans.setFont(f);
        lblans.setBounds(20,270,360,50);
        lblans.setBackground(new Color(237, 232, 215));
        lblans.setForeground(new Color(89, 82, 60));
        lblans.setAlignment(Label.CENTER);
        mainPanel.add(lblans);
        
        add(mainPanel);
    }
}

//adding KeyListener for TextField for validations
class MyKeyListener1 extends KeyAdapter
{
    public void keyTyped(KeyEvent e)
    {
        char ch = e.getKeyChar();
        if( !Character.isDigit(ch) && ch != '.' )       //for fraction numbers '.' is accepted
        {
            e.consume();
        }
    }
}

//adding ActionListener for Buttons, to calculate result of add,sub & display result on lblans
class MyActionListener1 implements ActionListener
{
    Myframe1 frame;
    
    public MyActionListener1(Myframe1 ref)
    {
        frame = ref;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Button btnclicked = (Button) e.getSource();
        String str1 = frame.txtnum1.getText();
        String str2 = frame.txtnum2.getText();
        
        if(btnclicked.getActionCommand().equals("ADD"))
        {
            try
            {
                double num1 = Double.parseDouble(str1);
                double num2 = Double.parseDouble(str2);
                Double ans = 0.0;
                ans = num1 + num2;
                Double ansRoundOff = Math.round(ans*100.0)/100.0;      //To Round off ans upto 2 digits after decimal
                frame.lblans.setText("ADDITION = " + ansRoundOff);
            } 
            catch(NumberFormatException ne)
            {
                frame.txtnum1.setText("");
                frame.txtnum2.setText("");
                frame.lblans.setText("ANSWER HERE");
                Mydialog1 md = new Mydialog1(frame);
            }
        }
        if(btnclicked.getActionCommand().equals("SUB"))
        {
            try
            {
                double num1 = Double.parseDouble(str1);
                double num2 = Double.parseDouble(str2);
                Double ans = 0.0;
                ans = num1 - num2;
                Double ansRoundOff = Math.round(ans*100.0)/100.0;      //To Round off ans upto 2 digits after decimal
                frame.lblans.setText("SUBSTRACTION = " + ansRoundOff);
            } 
            catch(NumberFormatException ne)
            {
                frame.txtnum1.setText("");
                frame.txtnum2.setText("");
                frame.lblans.setText("ANSWER HERE");
                Mydialog1 d = new Mydialog1(frame);
                      
            }
        }
    }
}

class Mydialog1 extends Dialog
{   
    Label lblmsg1, lblmsg2;
    Button btnok;
    
    public Mydialog1(Myframe1 frame)
    {
        super(frame, false);
        setSize(200,150);
        setLayout(null);
        setBackground(new Color(134, 124, 91));
        setResizable(false);
        setLocationRelativeTo(frame);
        setUndecorated(true);
        
        initialize();
        
        setVisible(true);
    }

    private void initialize()
    {
        Font f = new Font("verdena", Font.BOLD, 12);
        
        //adding Label
        lblmsg1 = new Label("Invalid Data!!");
        lblmsg1.setBounds(10,20,180,20);
        lblmsg1.setFont(f);
        lblmsg1.setForeground(Color.black);
        lblmsg1.setAlignment(Label.CENTER);
        add(lblmsg1);
        
        lblmsg2 = new Label("please enter correct data");
        lblmsg2.setBounds(10,42,180,20);
        lblmsg2.setFont(f);
        lblmsg2.setForeground(Color.black);
        lblmsg2.setAlignment(Label.CENTER);
        add(lblmsg2);
        
        //adding Button
        btnok = new Button("OK");
        btnok.setBounds(75,90,50,30);
        btnok.setFont(new Font("verdena", Font.BOLD, 15));
        btnok.setBackground(Color.red);
        btnok.setForeground(Color.yellow);
        btnok.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btnok);
        
        //adding ActionListener for btnok
        btnok.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                dispose();
            }
        });
    }
}

public class Program1
{
    public static void main(String[] args)    
    {
        Myframe1 frame = new Myframe1();
    }
}
