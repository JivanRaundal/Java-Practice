/* ActionListener for handling Button Events :-

# Handling events for multiple Buttons using only one Listener class

Note: -ActionEvent e, here e object stores information related to event generated
	  -getSource() method returns data of type Object. Hence, we have to typecase it into type Button
	  -Object class is Base class of all classes, So it can be compatible with any other class
	  
# Note : If button has to go in different states then we have to use getActionCommand() & setActionCommand() methods
     eg- Play-Pause Button, show-hide details, button (means 1 button working for 2 tasks then to do that we use get & setActionCommand)
	 -Note: by default getActionCommand() method returns Label(name) of Button as a String.
*/

import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame
{
	Panel mainPanel;
	Button btnchangeColor;
	
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
		Font f = new Font("times new roman",Font.BOLD,14);
		
		//adding mainPanel
		mainPanel = new Panel();
		mainPanel.setBounds(0,0,getWidth(),getHeight());
		mainPanel.setBackground(Color.CYAN);
		mainPanel.setLayout(null);
		mainPanel.setLayout(null);
		
		//adding Button
		btnchangeColor = new Button("CHANGE COLOR");
		btnchangeColor.setActionCommand("green");				//setActionCommand()
		btnchangeColor.setBounds(100,120,130,40);
		btnchangeColor.setBackground(Color.red);
		btnchangeColor.setForeground(Color.yellow);
		btnchangeColor.setFont(f);
		btnchangeColor.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnchangeColor);
		
		//making connection of Button with ActionListener
		btnchangeColor.addActionListener(new MyActionListsner(this));
		
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
		String str = btntemp.getActionCommand();		//button label is default action command
		
		if(str.equals("green"))
		{
			frame.mainPanel.setBackground(Color.yellow);
			frame.btnchangeColor.setActionCommand("yellow");
		}
		else if(str.equals("yellow"))
		{
			frame.mainPanel.setBackground(Color.green);
			frame.btnchangeColor.setActionCommand("green");
		}
	}
}

class Pro25_getActionCommand_setActionCommand
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
	}
}