
// Button & TextField Event Handling code :-

//Note: for validations on TextField or To handle TextField events, we have to use KeyListener interface 

import java.awt.*;
import java.awt.event.*;

class Myframe5 extends Frame
{
	Panel mainPanel;
	Button btnadd, btnsub;
	TextField txtnum1, txtnum2;
	Label lblnum1, lblnum2, lblans;
	
	public Myframe5()
	{
		setSize(300,300);
		setTitle("MyCalculator");
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		
		addComponent();
		txtnum1.requestFocus();			//will set cursor on num1 textfield for input		
		
		setVisible(true);
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
	}
	
	private void addComponent()
	{
		Font f = new Font("verdena", Font.BOLD, 16);
		
		//adding mainPanel
		mainPanel = new Panel();
		mainPanel.setBounds(0,0,getWidth(),getHeight());
		mainPanel.setBackground(new Color(77, 77, 77));
		mainPanel.setLayout(null);
		
		//adding TextField txtnum1 & txtnum2
		txtnum1 = new TextField();
		txtnum1.setBounds(20,80,120,30);
		txtnum1.setForeground(Color.white);
		txtnum1.setBackground(new Color(48, 48, 48));
		txtnum1.setFont(f);
		mainPanel.add(txtnum1);
		
		txtnum2 = new TextField();
		txtnum2.setBounds(160,80,120,30);
		txtnum2.setForeground(Color.white);
		txtnum2.setBackground(new Color(48, 48, 48));
		txtnum2.setFont(f);
		mainPanel.add(txtnum2);
		
		//adding Button
		btnadd = new Button("ADD");
		btnadd.setBounds(100,150,100,30);
		btnadd.setBackground(new Color(27, 27, 27));
		btnadd.setForeground(Color.white);
		btnadd.setFont(f);
		btnadd.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnadd);
		
		//adding Label : lblnum1, lblnum2, lblans
		lblnum1 = new Label("Number-1");
		lblnum1.setBounds(20,50,120,20);
		lblnum1.setForeground(Color.white);
		lblnum1.setFont(f);
		lblnum1.setAlignment(Label.CENTER);
		mainPanel.add(lblnum1);
		
		lblnum2 = new Label("Number-2");
		lblnum2.setBounds(160,50,120,20);
		lblnum2.setForeground(Color.white);
		lblnum2.setFont(f);
		lblnum2.setAlignment(Label.CENTER);
		mainPanel.add(lblnum2);
		
		lblans = new Label("ANSWER HERE");
		lblans.setBounds(20,210,260,30);
		lblans.setForeground(Color.white);
		lblans.setBackground(new Color(48, 48, 48));
		lblans.setFont(f);
		lblans.setAlignment(Label.CENTER);
		mainPanel.add(lblans);
		
		//making Connection here 
		btnadd.addActionListener(new MyActionListener5(this));
		
		txtnum1.addKeyListener(new MyKeyListener5(this));
		txtnum2.addKeyListener(new MyKeyListener5(this));
		
		add(mainPanel);
	}
}

class MyActionListener5 implements ActionListener
{
	Myframe5 frame;
	
	public MyActionListener5(Myframe5 temp)
	{
		frame = temp;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		//code which we want to execute when clicked on 'ADD' Button is written here
		String str1,str2;
		str1 = frame.txtnum1.getText();
		str2 = frame.txtnum2.getText();
		
		try
		{
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			int ans = num1 + num2;
			
			frame.lblans.setText("ANSWER = " + String.valueOf(ans));
		}
		catch(NumberFormatException ne)
		{
			frame.lblans.setText("Enter Correct Data");
			frame.txtnum1.setText("");
			frame.txtnum2.setText("");					
			frame.txtnum1.requestFocus();				//this method will move cursor on txtnum1 only
			return;
		}
	}
}

//Note: for validations on TextField or To handle TextField events, we have to use KeyListener interface 
class MyKeyListener5 implements KeyListener
{
	Myframe5 frame;
	
	public MyKeyListener5(Myframe5 temp)
	{
		frame = temp;
	}
	
	//@Overriden methods
	public void keyPressed(KeyEvent e)
	{
		
	}
	public void keyReleased(KeyEvent e)
	{
		
	}
	public void keyTyped(KeyEvent e)
	{
		/*//Note: this will not work as it will print string in textfield and not character
		TextField txttemp = (TextField) e.getSource();
		String str = txttemp.getText();
		System.out.println("You Typed = " + str); */
		
		//For validations, we have to access event generating character
		char ch = e.getKeyChar();				//this method will return event generating character
		System.out.println("You Typed = " + ch);
		
		//validating Input
		if(Character.isDigit(ch) == true)
		{
			//let the event happen as it is
		}
		else
		{
			//event must be cancelled as input is alphabet & not digit/number 
			e.consume();				//this method will consume generated event
		}
	}
}

public class Program5 
{
	public static void main(String[] args) 
	{
		Myframe5 frame = new Myframe5();
	}
}
