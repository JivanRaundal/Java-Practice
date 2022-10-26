
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;

class Myframe2 extends Frame
{
	Panel mainPanel;
	Label lbltitle, lblyear, lblmonth, lblday, lblmsg;
	Button btnshowBirthDate;
	Choice cmbyear, cmbmonth, cmbday;
	
	public Myframe2()
	{
		setSize(450,320);
		setTitle("BirthDate");
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
		Font f = new Font("verdena", Font.BOLD, 14);
		
		//adding mainPanel
		mainPanel = new Panel();
		mainPanel.setBounds(0,0,this.getWidth(),this.getHeight());
		mainPanel.setLayout(null);
		mainPanel.setBackground(new Color(255, 149, 109));
		
		//adding Label lbltitle, lblyear, lblmonth & lblday
		lbltitle = new Label("Select your birth date =");
		lbltitle.setBounds(20,40,400,20);
		lbltitle.setFont(f);
		mainPanel.add(lbltitle);
		
		lblyear = new Label("Select Year");
		lblyear.setBounds(40,100,96,20);
		lblyear.setFont(f);
		mainPanel.add(lblyear);
		
		lblmonth = new Label("Select Month");
		lblmonth.setBounds(176,100,96,20);
		lblmonth.setFont(f);
		mainPanel.add(lblmonth);
		
		lblday = new Label("Select Day");
		lblday.setBounds(312,100,96,20);
		lblday.setFont(f);
		mainPanel.add(lblday);
		
		//adding ComboBox(Choice) cmbyear, cmbmonth & cmbday
		cmbyear = new Choice();
		cmbyear.setBounds(40,120,96,20);
		cmbyear.setFont(f);
		mainPanel.add(cmbyear);
		
		cmbmonth = new Choice();
		cmbmonth.setBounds(176,120,96,20);
		cmbmonth.setFont(f);
		mainPanel.add(cmbmonth);
		
		cmbday = new Choice();
		cmbday.setBounds(312,120,96,20);
		cmbday.setFont(f);
		mainPanel.add(cmbday);
		//connections for Comboboxes
		cmbmonth.addItemListener(new MyItemListener2(this));			//need to connect month only
		//methods to fill ComboBox cmbyear, cmbmonth & cmbday
		fillcmbyear();
		fillcmbmonth();
		//Note: we will call fillcmbday() from ItemListener bcz, it needs event handling
		
		//adding Button btnshowBirthDate
		btnshowBirthDate = new Button("SHOW BIRTHDATE");
		btnshowBirthDate.setBounds(150,170,150,40);
		btnshowBirthDate.setBackground(Color.red);
		btnshowBirthDate.setForeground(Color.yellow);
		btnshowBirthDate.setFont(f);
		btnshowBirthDate.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnshowBirthDate);
		//connecting ActionListener
		btnshowBirthDate.addActionListener(new MyActionListener2(this));
		
		//adding Label lblmsg;
		lblmsg = new Label("Your BirthDate");
		lblmsg.setBounds(40,230,370,40);
		lblmsg.setFont(new Font("verdena", Font.BOLD, 16));
		lblmsg.setBackground(new Color(0, 15, 255));
		lblmsg.setForeground(Color.YELLOW);
		lblmsg.setAlignment(Label.CENTER);
		mainPanel.add(lblmsg);
		
		add(mainPanel);
	}
	
	public void fillcmbday(int year, int month)
	{
		//Note: Here, we have to apply validations that if selected year is leap year, then number of days in feb will be 29 else 28
		int total_day = 0;
		if(month == 2)
		{
			if(isLeap(year))
				total_day = 29;
			else		//not an leap year
				total_day = 28;
		}
		else if(month==4 || month==6 || month==9 || month==11)
		{
			//month has 30 days
			total_day = 30;
		}
		else
		{
			//month has 31 days
			total_day = 31;
		}
		
		for(int i=1; i<=total_day; i++)
		{
			this.cmbday.add(String.valueOf(i));
		}
	}
	
	private boolean isLeap(int year)				//this function will check if year is leap year or not
	{
		if(year%100 == 0 && year%400 ==0)			//yr is multiple of 100 & multiple of 400
			return true;
		else if(year%100 != 0 && year%4 == 0)		//yr is not multiple of 100 but multiple of 4
			return true;
		else										//otherwise not a leap year
			return false;
	}

	private void fillcmbmonth()
	{
		for(int i=1; i<=12; i++)
		{
			cmbmonth.add(String.valueOf(i));
		}
	}

	private void fillcmbyear()
	{
		int yr;
		Calendar cal = Calendar.getInstance();
		
		for(yr=1990; yr <= cal.get(Calendar.YEAR); yr++)
		{
			cmbyear.add(String.valueOf(yr));
		}
	}
}

class MyItemListener2 implements ItemListener
{
	Myframe2 frame;
	
	public MyItemListener2(Myframe2 ref)
	{
		frame = ref;
	}
	public void itemStateChanged(ItemEvent e) 
	{
		int year = Integer.parseInt(frame.cmbyear.getSelectedItem());
		int month = Integer.parseInt(frame.cmbmonth.getSelectedItem());
		frame.cmbday.removeAll();				//to remove previous items
		frame.fillcmbday(year, month);		//according to year & month, days in cmbday will get filled
	}
}

class MyActionListener2 implements ActionListener
{
	Myframe2 frame;
	
	public MyActionListener2(Myframe2 ref)
	{
		frame = ref;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		frame.lblmsg.setText("BirthDate = "+frame.cmbday.getSelectedItem()+" / "+frame.cmbmonth.getSelectedItem()+" / "+
							 frame.cmbyear.getSelectedItem());
	}
}

public class Program2
{
	public static void main(String args[])
	{
		Myframe2 frame = new Myframe2();
	}
}