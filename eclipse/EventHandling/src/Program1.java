
import java.awt.*;
import java.awt.event.*;

class Myframe1 extends Frame
{
	Panel mainPanel;
	Label lblmsg;
	Button btnday, btnmonth, btnyear;
	
	public Myframe1()
	{
		setSize(320,300);
		setTitle("Myframe1");
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
		Font f1 = new Font("verdena", Font.BOLD, 20);
		Font f2 = new Font("verdena", Font.BOLD, 15);
		
		//adding mainPanel
		mainPanel = new Panel();
		mainPanel.setBounds(0,0,getWidth(),getHeight());
		mainPanel.setBackground(new Color(232, 199, 251));
		mainPanel.setLayout(null);
		
		//adding Label lblmsg
		lblmsg = new Label("Message");
		lblmsg.setBounds(20,60,100,22);
		//lblmsg.setBackground(Color.white);
		lblmsg.setForeground(Color.black);
		lblmsg.setFont(f1);
		mainPanel.add(lblmsg);
		
		//adding Button : btnday, btnmonth, btnyear
		btnday = new Button("DAY");
		btnday.setBounds(20,110,80,30);
		btnday.setFont(f2);
		btnday.setBackground(Color.red);
		btnday.setForeground(Color.yellow);
		btnday.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnday);
		
		btnmonth = new Button("MONTH");
		btnmonth.setBounds(120,110,80,30);
		btnmonth.setFont(f2);
		btnmonth.setBackground(Color.red);
		btnmonth.setForeground(Color.yellow);
		btnmonth.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnmonth);
		
		btnyear = new Button("YEAR");
		btnyear.setBounds(220,110,80,30);
		btnyear.setFont(f2);
		btnyear.setBackground(Color.red);
		btnyear.setForeground(Color.yellow);
		btnyear.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnyear);
		
		//making connections for Button events 
		btnday.addActionListener(new MyActionListener1(this));
		btnmonth.addActionListener(new MyActionListener1(this));
		btnyear.addActionListener(new MyActionListener1(this));
		
		add(mainPanel);
	}
}

class MyActionListener1 implements ActionListener
{
	Myframe1 frame;
	
	public MyActionListener1(Myframe1 temp)
	{
		frame = temp;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Button btntemp;
		btntemp = (Button)e.getSource(); 		//this method returns data of type Object, hence we have to typecast it into Button
		//getSource() method will return object of source Button (i.e. the Object of Button generating Event)
		
		//Note: default Action Command is Label (name) of Button
		String str = btntemp.getActionCommand();
		frame.lblmsg.setText(str);
		
		/*// NOTE: We can compare references
		if(btntemp == frame.btnday)
		{
			frame.lblmsg.setText("DAY");
		}
		else if(btntemp == frame.btnmonth)
		{
			frame.lblmsg.setText("MONTH");
		}
		else if(btntemp == frame.btnyear)
		{
			frame.lblmsg.setText("YEAR");
		}
		*/
	}
}


public class Program1 
{
	public static void main(String[] args) 
	{
		Myframe1 frame = new Myframe1();
	}
}
