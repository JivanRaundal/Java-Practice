/* ActionListener for handling Button Events :-

# Handling events for multiple Buttons using only one Listener class

Note: -ActionEvent e, here e object stores information related to event generated
	  -getSource() method returns data of type Object. Hence, we have to typecase it into type Button
	  -Object class is Base class of all classes, So it can be compatible with any other class
*/

import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame
{
	Panel mainPanel;
	Label lblmsg;
	Button btnday, btnmonth, btnyear;
	
	public Myframe()
	{
		setSize(330,300);
		setTitle("Myframe");
		setLocationRelativeTo(null);
		setBackground(Color.white);
		setResizable(false);
		setLayout(null);
		
		addComponent();
		
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
		Font f1 = new Font("times new roman",Font.BOLD,20);
		Font f2 = new Font("times new roman",Font.BOLD,16);
		
		//adding mainPanel
		mainPanel = new Panel();
		mainPanel.setBounds(0,0,getWidth(),getHeight());
		mainPanel.setBackground(Color.CYAN);
		mainPanel.setLayout(null);
		mainPanel.setLayout(null);
		
		//adding Label lblmsg
		lblmsg = new Label("Click Button");
		lblmsg.setBounds(20,60,200,30);
		lblmsg.setForeground(Color.black);
		lblmsg.setFont(f1);
		mainPanel.add(lblmsg);
		
		//adding Button
		btnday = new Button("DAY");
		btnday.setBounds(20,120,83,30);
		btnday.setBackground(Color.red);
		btnday.setForeground(Color.yellow);
		btnday.setFont(f2);
		btnday.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnday);
		
		btnmonth = new Button("MONTH");
		btnmonth.setBounds(123,120,83,30);
		btnmonth.setBackground(Color.red);
		btnmonth.setForeground(Color.yellow);
		btnmonth.setFont(f2);
		btnmonth.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnmonth);
		
		btnyear = new Button("YEAR");
		btnyear.setBounds(226,120,83,30);
		btnyear.setBackground(Color.red);
		btnyear.setForeground(Color.yellow);
		btnyear.setFont(f2);
		btnyear.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnyear);
		
		//making connection of Button with ActionListener
		btnday.addActionListener(new MyActionListsner(this));
		btnmonth.addActionListener(new MyActionListsner(this));
		btnyear.addActionListener(new MyActionListsner(this));
		
		add(mainPanel);
	}
}

class MyActionListsner implements ActionListener
{
	Myframe frame;
	
	public MyActionListsner(Myframe temp)
	{
		frame = temp;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Button btntemp;
		btntemp = (Button) e.getSource();				//returns data of type Object, hence typecasted into Button
		
		if(btntemp == frame.btnday)
		{
			frame.lblmsg.setText("DAY CLICKED");
		}
		else if(btntemp == frame.btnmonth)
		{
			frame.lblmsg.setText("MONTH CLICKED");
		}
		else if(btntemp == frame.btnyear)
		{
			frame.lblmsg.setText("YEAR CLICKED");
		}
	}
}

class Pro23_ActionListener_getSource
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
	}
}