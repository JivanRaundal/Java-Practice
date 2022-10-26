
// Checkbox Event Handling code :-
// ItemListener Interface (method => itemStateChanged(ItemEvent e))

import java.awt.*;
import java.awt.event.*;

class Myframe6 extends Frame
{
	Panel mainPanel;
	Checkbox chkone, chktwo, chkthree;
	Label lblmsg;
	
	public Myframe6()
	{
		setSize(300,300);
		setTitle("SelectCheckbox");
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		
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
		Font f = new Font("verdena", Font.BOLD, 15);
		
		//adding mainPanel
		mainPanel = new Panel();
		mainPanel.setBounds(0,0,getWidth(),getHeight());
		mainPanel.setBackground(new Color(209, 150, 5));
		mainPanel.setLayout(null);
		
		//adding Checkbox
		chkone = new Checkbox("One");
		chkone.setBounds(20,50,150,20);
		chkone.setForeground(Color.black);
		chkone.setFont(f);
		mainPanel.add(chkone);
		
		chktwo = new Checkbox("Two");
		chktwo.setBounds(20,90,150,20);
		chktwo.setForeground(Color.black);
		chktwo.setFont(f);
		mainPanel.add(chktwo);
		
		chkthree = new Checkbox("Three");
		chkthree.setBounds(20,130,150,20);
		chkthree.setForeground(Color.black);
		chkthree.setFont(f);
		mainPanel.add(chkthree);
		
		//adding Label
		lblmsg = new Label("Select Checkbox");
		lblmsg.setBounds(10,190,280,30);
		lblmsg.setFont(f);
		lblmsg.setBackground(Color.black);
		lblmsg.setForeground(Color.white);
		lblmsg.setAlignment(Label.CENTER);
		mainPanel.add(lblmsg);
		
		//Connections
		chkone.addItemListener(new MyItemListener6(this));
		chktwo.addItemListener(new MyItemListener6(this));
		chkthree.addItemListener(new MyItemListener6(this));
		
		add(mainPanel);
	}
}

class MyItemListener6 implements ItemListener
{
	Myframe6 frame;
	
	public MyItemListener6(Myframe6 ref)
	{
		frame = ref;
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		Checkbox chktemp;
		chktemp = (Checkbox) e.getSource();	
		
		//NOTE: getState() method will return 'true' if Checkbox is selected else it will return 'false' if Checkbox is not selected
		if(chktemp.getState() == true)
		{
			System.out.println("You selected Checkbox");
		}
		else
		{
			System.out.println("You removed selection");
		}
		
		String str = "You Selected =";
		if(frame.chkone.getState() == true)
		{
			str = str + " ONE ";
		}
		if(frame.chktwo.getState() == true)
		{
			str = str + " TWO ";
		}
		if(frame.chkthree.getState() == true)
		{
			str = str + " THREE ";
		}
		frame.lblmsg.setText(str);
	}
}

public class Program6 
{
	public static void main(String[] args)
	{
		Myframe6 frame = new Myframe6();
	}
}
