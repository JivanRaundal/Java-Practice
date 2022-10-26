/* Adding Components :-
	1) Panel 
	2) Checkbox
	3) RadioButton
	4) Choice(ComboBox)
	
NOTE: setBounds(x,y,height,width);
-Do not add components directly on frame, take help of Panel always.
-Always add containers(Frame & Panel) after adding all components.
*/

import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame
{
	Panel mainPanel;								//Panel
	Checkbox chkcpp, chkjava;						//Checkbox
	Checkbox rdbmale, rdbfemale, rdbother;			//RadioButton
	Choice cmbday, cmbtransport;					//To create a ComboBox, we have to create object of type Choice
	
	public Myframe()
	{
		setSize(600,600);
		setTitle("Myframe");
		setLocationRelativeTo(null);
		setBackground(Color.CYAN);
		setLayout(null);
		setResizable(false);
		
		addComponent();
		fillcmbday();
		fillcmbtransport();
		
		setVisible(true);
	}
	
	public void addComponent()
	{
		Font f = new Font("verdena", Font.BOLD, 20);
		
		//adding Panel
		mainPanel = new Panel();
		mainPanel.setBounds(0, 0, getWidth(), getHeight());
		mainPanel.setBackground(new Color(232, 199, 251));
		mainPanel.setLayout(null);
		
		//adding Checkbox
		chkcpp = new Checkbox("CPP");
		chkcpp.setBounds(30,50,65,40);
		chkcpp.setFont(f);
		//chkcpp.setBackground(Color.red);
		//chkcpp.setForeground(Color.yellow);
		mainPanel.add(chkcpp);
		
		chkjava = new Checkbox("JAVA");
		chkjava.setBounds(30,100,70,40);
		chkjava.setFont(f);
		//chkjava.setBackground(Color.red);
		//chkjava.setForeground(Color.yellow);
		mainPanel.add(chkjava);
		
		//adding RadioButton
		//NOTE: To create RadioButton, we have to create a group of Checkboxes so that only one can be selected from them.
		CheckboxGroup cbggender = new CheckboxGroup();
		
		rdbmale = new Checkbox("MALE", cbggender, false);		//false means not want to tick by default
		rdbmale.setBounds(30,180,70,40);
		rdbmale.setFont(f);
		mainPanel.add(rdbmale);
		
		rdbfemale = new Checkbox("FEMALE", cbggender, false);
		rdbfemale.setBounds(110,180,90,40);
		rdbfemale.setFont(f);
		mainPanel.add(rdbfemale);
		
		rdbother = new Checkbox("OTHER", cbggender, false);
		rdbother.setBounds(210,180,80,40);
		rdbother.setFont(f);
		mainPanel.add(rdbother);
		
		//adding Choice(ComboBox)
		cmbday = new Choice();
		cmbday.setBounds(30,250,80,30);
		cmbday.setFont(f);
		mainPanel.add(cmbday);

		cmbtransport = new Choice();
		cmbtransport.setBounds(130,250,100,30);
		cmbtransport.setFont(f);
		mainPanel.add(cmbtransport);
		
		this.add(mainPanel);
	}
	
	public void fillcmbday()			//this method is defined to fill ComboBox(cmbday)
	{
		int i;
		for(i=1; i<=31; i++)
		{
			cmbday.add(String.valueOf(i));		//add() here, takes only String as a parameter, hence converted i into String.
		}
	}
	
	public void fillcmbtransport()		//this method is defined to fill ComboBox(cmbtransport)
	{
		String list[] = {"Bus", "Car", "Cycle", "Walk", "Taxi"};
		for(String s : list)
		{
			cmbtransport.add(s);
		}
	}
}

class Pro18_adding_components
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
		
		frame.addWindowListener(new WindowCloser(frame));
	}
}