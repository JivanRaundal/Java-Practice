
import java.awt.*;
import java.awt.event.*;

class Myframe4 extends Frame
{
	Panel mainPanel;
	Button btnchangeColor;
	
	public Myframe4()
	{
		setSize(320,300);
		setTitle("Myframe4");
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
		mainPanel.setBackground(Color.white);
		mainPanel.setLayout(null);
		
		//adding Button btnchangeColor
		btnchangeColor = new Button("LIGHT THEME");
		btnchangeColor.setActionCommand("LIGHT");
		btnchangeColor.setBounds(100,135,120,30);
		btnchangeColor.setBackground(new Color(212, 212, 212));
		btnchangeColor.setForeground(Color.black);
		btnchangeColor.setFont(new Font("verdena", Font.BOLD, 12));
		btnchangeColor.setCursor(new Cursor(Cursor.HAND_CURSOR));;
		mainPanel.add(btnchangeColor);
		
		//making connections with ActionListener
		btnchangeColor.addActionListener(new MyActionListener4(this));
		
		add(mainPanel);
	}
}

class MyActionListener4 implements ActionListener
{
	Myframe4 frame;
	
	public MyActionListener4(Myframe4 temp)
	{
		frame = temp;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Button btntemp = (Button)e.getSource();
		String str = btntemp.getActionCommand();
		
		if(str.equals("LIGHT"))
		{
			frame.btnchangeColor.setLabel("DARK THEME");
			frame.btnchangeColor.setBackground(new Color(23, 23, 24));
			frame.btnchangeColor.setForeground(Color.white);
			
			frame.mainPanel.setBackground(new Color(69, 70, 73));
			frame.btnchangeColor.setActionCommand("DARK");
		}
		else if(str.equals("DARK"))
		{
			frame.btnchangeColor.setLabel("LIGHT THEME");
			frame.btnchangeColor.setBackground(new Color(212, 212, 212));
			frame.btnchangeColor.setForeground(Color.black);
			
			frame.mainPanel.setBackground(Color.white);
			frame.btnchangeColor.setActionCommand("LIGHT");
		}
	}
}

public class Program4 
{
	public static void main(String[] args)
	{
		Myframe4 frame = new Myframe4();
	}
}
