
// ComboBox (Choice) Event Handling using ItemListsner :-
// Note: 1) cmbobj.getSelectedItem()  : method returns selected element of Combobox
//       2) cmbobj.getSelectedIndex() : method returns index of selected element from combobox

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

class Myframe7 extends Frame
{
	Panel mainPanel;
	Choice cmbday, cmbmonth, cmbyear;
	Label lblday, lblmonth, lblyear, lblmsg;
	
	public Myframe7()
	{
		setSize(350,300);
		setTitle("Myframe7");
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		
		addComponent();
		
		fillcmbday();
		fillcmbmonth();
		fillcmbyear();
		
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
		Font f = new Font("verdena", Font.BOLD, 16);
		
		//adding mainPanel
		mainPanel = new Panel();
		mainPanel.setBounds(0,0,getWidth(),getHeight());
		mainPanel.setBackground(new Color(244, 231, 199));
		mainPanel.setLayout(null);
		
		//adding Label
		lblday = new Label("DAY");
		lblday.setBounds(20,80,90,20);
		lblday.setForeground(Color.black);
		lblday.setFont(f);
		lblday.setAlignment(Label.CENTER);
		mainPanel.add(lblday);
		
		lblmonth = new Label("MONTH");
		lblmonth.setBounds(130,80,90,20);
		lblmonth.setForeground(Color.black);
		lblmonth.setFont(f);
		lblmonth.setAlignment(Label.CENTER);
		mainPanel.add(lblmonth);
		
		lblyear = new Label("YEAR");
		lblyear.setBounds(240,80,90,20);
		lblyear.setForeground(Color.black);
		lblyear.setFont(f);
		lblyear.setAlignment(Label.CENTER);
		mainPanel.add(lblyear);
	
		lblmsg = new Label("SELECT BIRTHDATE");
		lblmsg.setBounds(20,200,310,40);
		lblmsg.setFont(f);;
		lblmsg.setBackground(new Color(209, 150, 5));
		lblmsg.setForeground(Color.black);
		lblmsg.setAlignment(Label.CENTER);
		mainPanel.add(lblmsg);
		
		//adding Combobox (Choice)
		cmbday = new Choice();
		cmbday.setBounds(20,100,90,30);
		cmbday.setBackground(new Color(224, 185, 88));
		cmbday.setForeground(Color.black);
		cmbday.setFont(f);
		mainPanel.add(cmbday);
		
		cmbmonth = new Choice();
		cmbmonth.setBounds(130,100,90,30);
		cmbmonth.setBackground(new Color(224, 185, 88));
		cmbmonth.setForeground(Color.black);
		cmbmonth.setFont(f);
		mainPanel.add(cmbmonth);
		
		cmbyear = new Choice();
		cmbyear.setBounds(240,100,90,30);
		cmbyear.setBackground(new Color(224, 185, 88));
		cmbyear.setForeground(Color.black);
		cmbyear.setFont(f);
		mainPanel.add(cmbyear);
		
		//Connections
		cmbday.addItemListener(new MyItemListener7(this));
		cmbmonth.addItemListener(new MyItemListener7(this));
		cmbyear.addItemListener(new MyItemListener7(this));
		
		add(mainPanel);
	}
	
	//methods for filling comboboxes
	public void fillcmbday()
	{
		int i;
		for(i=1; i<=31; i++)
		{
			cmbday.add(String.valueOf(i));
		}
	}
	
	public void fillcmbmonth()
	{
		int i;
		for(i=1; i<=12; i++)
		{
			cmbmonth.add(String.valueOf(i));
		}
	}
	
	public void fillcmbyear()
	{
		int i;
		Calendar cal = Calendar.getInstance();
		int current_yr = cal.get(Calendar.YEAR);
		
		for(i=1990; i<=current_yr; i++)
		{
			cmbyear.add(String.valueOf(i));
		}
	}
}

//Defining ItemListener for Handling ComboBox (Choice) events 
class MyItemListener7 implements ItemListener
{
	Myframe7 frame;
	
	public MyItemListener7(Myframe7 temp)
	{
		frame = temp;
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		Choice cmbtemp = (Choice) e.getSource();			//getSource() method returns data of type Object hence, typecasting is needed
		String str = cmbtemp.getSelectedItem();				//will return selected element as a string
		int ind    = cmbtemp.getSelectedIndex();			//will return index of selected item
	
		System.out.println("You selected = " + str + " at index = " + ind);
		
		//frame.lblmsg.setText("Selected Date = " + str);
		String date = "Selected Date = ";
		date = date + frame.cmbday.getSelectedItem() + " / " + frame.cmbmonth.getSelectedItem() + " / " + frame.cmbyear.getSelectedItem();
		frame.lblmsg.setText(date);
	}
	
}

public class Program7 
{
	public static void main(String[] args) 
	{
		Myframe7 frame = new Myframe7();
	}
}
