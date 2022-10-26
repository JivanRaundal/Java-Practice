
//Note :- Handle Button Event without ActionListsner. Means you have to use MouseListsner
// We will use setActionCommand() & getActionCommand() methods here

import java.awt.*;
import java.awt.event.*;

class Myframe2 extends Frame
{
	Panel mainPanel;
	Button btnyellow, btnblue, btngreen;
	
	public Myframe2()
	{
		setSize(320,300);
		setTitle("Myframe2");
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		
		addComponent();
		
		setVisible(true);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});	
	}

	private void addComponent() 
	{
		
		//adding mainPanel
		mainPanel = new Panel();
		mainPanel.setBounds(0,0,getWidth(),getHeight());
		//mainPanel.setBackground(new Color(232, 199, 251));
		mainPanel.setLayout(null);
		
		//adding Button : btnyellow, btnblue, btngreen
		btnyellow = new Button();
		btnyellow.setActionCommand("yellow");
		btnyellow.setBounds(20,110,80,30);
		btnyellow.setBackground(Color.yellow);
		btnyellow.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnyellow);
		
		btnblue = new Button();
		btnblue.setActionCommand("blue");
		btnblue.setBounds(120,110,80,30);
		btnblue.setBackground(Color.blue);
		btnblue.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnblue);
		
		btngreen = new Button();
		btngreen.setActionCommand("green");
		btngreen.setBounds(220,110,80,30);
		btngreen.setBackground(Color.green);
		btngreen.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btngreen);
		
		//making connections for Button events 
		btnyellow.addMouseListener(new MyMouseListener2(this));
		btnblue.addMouseListener(new MyMouseListener2(this));
		btngreen.addMouseListener(new MyMouseListener2(this));
		
		add(mainPanel);
	}
}

class MyMouseListener2 extends MouseAdapter
{
	Myframe2 frame;
	
	public MyMouseListener2(Myframe2 temp)
	{
		frame = temp;
	}
	
	public void mouseClicked(MouseEvent e)
	{
		Button btntemp;
		btntemp = (Button)e.getSource();
		String str = btntemp.getActionCommand();
		
		if(str.equals("yellow"))
		{
			frame.mainPanel.setBackground(Color.yellow);
		}
		else if(str.equals("blue"))
		{
			frame.mainPanel.setBackground(Color.blue);
		}
		else if(str.equals("green"))
		{
			frame.mainPanel.setBackground(Color.green);
		}
	}
}

public class Program2 
{
	public static void main(String[] args) 
	{
		Myframe2 frame = new Myframe2();
	}
}
