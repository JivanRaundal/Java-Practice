/* Adding Components :-
	1) Panel 
	2) Label
	3) Button
	4) TextField
	
NOTE: setBounds(x,y,height,width);
-Do not add components directly on frame, take help of Panel always.
-Always add containers(Frame & Panel) after adding all components.
*/

import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame
{
	Panel mainPanel;
	Label lblusername, lblpassword;
	TextField txtusername, txtpassword;
	Button btnlogin;
	
	public Myframe()
	{
		setSize(360,300);
		setTitle("LOGIN WINDOW");
		setLocationRelativeTo(null);
		setBackground(Color.CYAN);
		setUndecorated(true);				//BCZ, login window does not hava Titile bar area
		setLayout(null);
		
		addComponent();
		
		setVisible(true);					//frame should be visible at last after adding components
		//Inner class for window closing
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
		Font f1 = new Font("times new roman", Font.BOLD, 20);
		Font f2 = new Font("times new roman", Font.BOLD, 13);
		
		//adding Panel
		mainPanel = new Panel();
		mainPanel.setBackground(new Color(232, 199, 251));
		mainPanel.setLayout(null);
		mainPanel.setBounds(0,0,this.getWidth(),this.getHeight());		//getWidth() & getHeight() will return width & height of frame
		
		//adding Labels
		lblusername = new Label("Username :: ");
		lblusername.setBounds(25,70,120,40);
		//lblusername.setForeground(Color.red);
		lblusername.setFont(f1);
		mainPanel.add(lblusername);
		
		lblpassword = new Label("Password :: ");
		lblpassword.setBounds(25,140,120,40);
		//lblpassword.setForeground(Color.red);
		lblpassword.setFont(f1);
		mainPanel.add(lblpassword);
		
		//adding TextField
		txtusername = new TextField();
		txtusername.setBounds(150,75,180,30);
		txtusername.setFont(f2);
		//txtusername.setBackground(Color.yellow);
		mainPanel.add(txtusername);
	
		txtpassword = new TextField();
		txtpassword.setBounds(150,145,180,30);
		txtpassword.setFont(f2);
		//txtpassword.setBackground(Color.yellow);
		txtpassword.setEchoChar('*');				//for password security
		mainPanel.add(txtpassword);
		
		//adding Button
		btnlogin = new Button("LOGIN");
		btnlogin.setBounds(130,210,100,30);
		btnlogin.setBackground(new Color(125, 99, 116));
		btnlogin.setForeground(Color.black);
		btnlogin.setFont(f2);
		btnlogin.setCursor(new Cursor(Cursor.HAND_CURSOR));			//for hand cursor on button
		mainPanel.add(btnlogin);
		
		add(mainPanel);				//will add mainPanel inside frame (NOTE: Always add containers (frame & Panel at last))
	}
}

class Pro17_login_window
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
	}
}