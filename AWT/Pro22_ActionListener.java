// ActionListener for Handling Button Event :-
// ActionListener is an interface dedicated for handling button events
// It has only one method i.e. 'actionPerformed()', we have to override that method

// Note:- We can also use MouseListener to handle button events, in this case event source will be button.
// eg- btnobj.addMouseListsner(new MyMouseListener()); 

import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame
{
	Panel mainPanel;
	Label lblmsg;
	Button btnclick;
	
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
		Font f = new Font("times new roman",Font.BOLD,20);
		
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
		lblmsg.setFont(f);
		mainPanel.add(lblmsg);
		
		//adding Button
		btnclick = new Button("CLICK");
		btnclick.setBounds(115,120,100,40);
		btnclick.setBackground(Color.red);
		btnclick.setForeground(Color.yellow);
		btnclick.setFont(f);
		btnclick.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnclick);
		
		//making connection of Button with ActionListener
		
		/*MyActionListsner mal = new MyActionListsner();
		btnclick.addActionListener(mal);*/
		
		//OR
		btnclick.addActionListener(new MyActionListsner(this));
		
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
		System.out.println("Button Clicked");
		
		frame.lblmsg.setText("Button Clicked");
	}
}

class Pro22_ActionListener
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
	}
}