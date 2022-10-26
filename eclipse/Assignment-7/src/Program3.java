
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Myframe3 extends Frame
{
	Panel mainPanel;
	Checkbox chkwindows, chklinux, chkmac;
	Label lblmsg;
	
	public Myframe3()
	{
		setSize(400,400);
		setTitle("Checkbox");
		setLocationRelativeTo(null);
		setLayout(null);
		//setResizable(false);
		
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
		Font f = new Font("verdena", Font.BOLD, 12);
		
		//adding mainPanel
		mainPanel = new Panel();
		mainPanel.setBounds(0,0,getWidth(),getHeight());
		mainPanel.setBackground(new Color(0, 112, 244));
		mainPanel.setLayout(null);
		
		//adding Checkbox chkwindows, chklinux, chkmac;
		chkwindows = new Checkbox("WINDOWS");
		chkwindows.setBounds(20,50,200,15);
		chkwindows.setFont(f);
		mainPanel.add(chkwindows);
		
		chklinux = new Checkbox("LINUX");
		chklinux.setBounds(20,85,200,15);
		chklinux.setFont(f);
		mainPanel.add(chklinux);
		
		chkmac = new Checkbox("MAC");
		chkmac.setBounds(20,120,200,15);
		chkmac.setFont(f);
		mainPanel.add(chkmac);
		
		//adding Label lblmsg
		lblmsg = new Label("You Selected = ");
		lblmsg.setBounds(20,165,300,30);
		lblmsg.setForeground(Color.white);
		lblmsg.setBackground(Color.black);
		lblmsg.setFont(f);
		mainPanel.add(lblmsg);
		
		//Connections
		chkwindows.addItemListener(new MyItemListener3(this));
		chklinux.addItemListener(new MyItemListener3(this));
		chkmac.addItemListener(new MyItemListener3(this));
		
		add(mainPanel);
	}
}

class MyItemListener3 implements ItemListener
{
	Myframe3 frame;
	
	public MyItemListener3(Myframe3 temp)
	{
		frame = temp;
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		String str = "You Selected =";
		
		//NOTE: getState() method will retuen 'true' if Checkbox is selected, else it will returns 'false' if not selected
		if(frame.chkwindows.getState() == true)
		{
			str = str + " WINDOWS ";
		}
		if(frame.chklinux.getState() == true)
		{
			str = str + " LINUX ";
		}
		if(frame.chkmac.getState() == true)
		{
			str = str + " MAC ";
		}
		frame.lblmsg.setText(str);
	}
}


public class Program3
{
	public static void main(String[] args) 
	{
		Myframe3 frame = new Myframe3();
	}
}
