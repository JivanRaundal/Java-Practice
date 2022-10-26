
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

class Myframe5 extends Frame
{
	Panel mainPanel;
	Label lbltitle, lbldate;
	Button btnday, btnmonth, btnyear, btndisplay;
	
	public Myframe5()
	{
		setSize(360,360);
		setTitle("OPERATION");
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		
		addComponent();
		
		setVisible(true);
		
		//btnday.addActionListener(new MyButtonListener(this));  //when clicked on button, dialog box will open
		
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
		Font f = new Font("verdena", Font.BOLD, 16);
		MyActionListener5 mal = new MyActionListener5(this);
		
		//adding mainPanel
		mainPanel = new Panel();
		mainPanel.setBounds(15,15,330,330);
		mainPanel.setBackground(new Color(255, 201, 180));
		mainPanel.setLayout(null);
		
		//adding Label lbltitle 
		lbltitle = new Label("Click buttons below to choose birthdate");
		lbltitle.setBounds(10,70,310,20);
		lbltitle.setFont(f);
		lbltitle.setAlignment(Label.CENTER);
		mainPanel.add(lbltitle);
		
		//adding Button btnday, btnmonth, btnyear, btndisplay
		btnday = new Button("DAY");
		btnday.setBounds(20,110,83,30);
		btnday.setBackground(Color.red);
		btnday.setForeground(Color.yellow);
		btnday.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnday);
		btnday.addActionListener(mal);
		
		btnmonth = new Button("MONTH");
		btnmonth.setBounds(123,110,83,30);
		btnmonth.setBackground(Color.red);
		btnmonth.setForeground(Color.yellow);
		btnmonth.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnmonth);
		btnmonth.addActionListener(mal);
		
		btnyear = new Button("YEAR");
		btnyear.setBounds(231,110,83,30);
		btnyear.setBackground(Color.red);
		btnyear.setForeground(Color.yellow);
		btnyear.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnyear);
		btnyear.addActionListener(mal);
		
		btndisplay = new Button("DISPLAY");
		btndisplay.setBounds(123,190,83,30);
		btndisplay.setBackground(new Color(0, 14, 255));
		btndisplay.setForeground(Color.yellow);
		btndisplay.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btndisplay);
		btndisplay.addActionListener(mal);
		
		//adding Label lbldate
		lbldate = new Label("See here selected birthdate");
		lbldate.setBounds(10,260,310,20);
		lbldate.setFont(f);
		lbldate.setAlignment(Label.CENTER);
		mainPanel.add(lbldate);
		
		add(mainPanel);
	}
}

class MyActionListener5 implements ActionListener
{
	Myframe5 frame;
	
	public MyActionListener5(Myframe5 ref)
	{
		frame = ref;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Button btnclicked = (Button) e.getSource();
		
		if(btnclicked != frame.btndisplay)
		{	
			Mydialog5 md = new Mydialog5(frame, btnclicked);
		}
		if(btnclicked == frame.btndisplay)
		{
			if(isValidDate())
			{
				String date = "DATE = "+frame.btnday.getActionCommand()+" / "+frame.btnmonth.getActionCommand()+" / "
						+frame.btnyear.getActionCommand();
				frame.lbldate.setText(date);
			}
			else
			{
				//frame.lbldate.setText("Invalid Date");
				Mydialog5_1 d = new Mydialog5_1(frame);
			}
		}
	}
	
	private boolean isValidDate()			//will return true if date is valid, else will return false
	{
		try
		{
			int day = Integer.parseInt(String.valueOf(frame.btnday.getActionCommand()));
			int month = Integer.parseInt(String.valueOf(frame.btnmonth.getActionCommand()));
			int year = Integer.parseInt(String.valueOf(frame.btnyear.getActionCommand()));
			
			if(month == 2)
			{
				if(isLeap(year) && day<=29)		//leap year, days = 29
					return true;		
				else if(day<=28)				//not leap year, days = 28
					return true;
				else
					return false;				//invalid day
			}
			else if(month==4 || month==6 || month==9 || month==11)
			{
				//total number of days should be 30
				if(day <= 30)
					return true;
				else
					return false;
			}
			else
			{
				//max number of days can be 31
				return true;
			}
		}
		catch(NumberFormatException ne)
		{
			return false;		//date is invalid, not selected either day, month or year
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
}

class Mydialog5 extends Dialog
{
	Myframe5 frame;
	Button btnclicked;
	Label lblmsg;
	Choice cmbdate;
	Button btnclose;
	
	public Mydialog5(Myframe5 ref, Button btntemp)
	{
		super(ref, false);
		frame = ref;
		btnclicked = btntemp;
		setSize(200,200);
		setUndecorated(true);
		setLayout(null);
		setLocationRelativeTo(frame);
		setBackground(new Color(255, 85, 85));
		setResizable(false);
		
		initialize();
		
		setVisible(true);
	}
	
	private void initialize()
	{
		Font f = new Font("verdena", Font.BOLD, 12);

		//adding Label
		lblmsg = new Label("DATE");
		lblmsg.setBounds(20,40,150,20);
		lblmsg.setForeground(Color.black);
		lblmsg.setFont(f);
		add(lblmsg);
		
		//adding Combobox
		cmbdate = new Choice();
		cmbdate.setBounds(20,70,80,20);
		cmbdate.setFont(f);
		add(cmbdate);
		
		//comobox values should change according to button
		if(btnclicked == frame.btnday)
		{
			lblmsg.setText("Choose DAY");
			for(int i=1; i<=31; i++)
			{
				cmbdate.add(String.valueOf(i));
			}
		}
		if(btnclicked == frame.btnmonth)
		{
			lblmsg.setText("Choose MONTH");
			for(int i=1; i<=12; i++)
			{
				cmbdate.add(String.valueOf(i));
			}
		}
		if(btnclicked == frame.btnyear)
		{
			lblmsg.setText("Choose YEAR");
			Calendar cal = Calendar.getInstance();
			for(int i=1990; i<=cal.get(Calendar.YEAR); i++)
			{
				cmbdate.add(String.valueOf(i));
			}
		}
		
		//adding Close Button & also MouseListener for close button
		btnclose = new Button("CLOSE");
		btnclose.setBounds(70,150,60,30);
		btnclose.setBackground(Color.red);
		btnclose.setForeground(Color.yellow);
		btnclose.setFont(f);
		btnclose.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(btnclose);
		//connecting MouseListener for Button
		btnclose.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				btnclicked.setLabel(cmbdate.getSelectedItem());
				dispose();
			}
		});
	}
}

class Mydialog5_1 extends Dialog
{
	Label lblmsg1, lblmsg2;
	Button btnok;
	
	public Mydialog5_1(Myframe5 frame)
	{
		super(frame, false);
		setSize(150,150);
		setUndecorated(true);
		setLayout(null);
		setLocationRelativeTo(frame);
		setBackground(new Color(255, 85, 85));
		setResizable(false);
		
		initialize();
		
		setVisible(true);
	}

	private void initialize()
	{
		Font f = new Font("vardena", Font.BOLD, 11);
		
		//adding Label
		lblmsg1 = new Label("Invalid Date!!");
		lblmsg1.setBounds(10,40,130,12);
		lblmsg1.setFont(f);
		lblmsg1.setForeground(Color.black);
		lblmsg1.setAlignment(Label.CENTER);
		add(lblmsg1);
		
		lblmsg2 = new Label("please select valid date");
		lblmsg2.setBounds(10,60,130,12);
		lblmsg2.setFont(f);
		lblmsg2.setForeground(Color.black);
		lblmsg2.setAlignment(Label.CENTER);
		add(lblmsg2);
		
		//adding Button
		btnok = new Button("OK");
		btnok.setBounds(50,100,50,25);
		btnok.setFont(f);
		btnok.setBackground(Color.red);
		btnok.setForeground(Color.yellow);
		btnok.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(btnok);
		
		//connection btnok with MouseListener for handling events
		btnok.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				dispose();
			}
		});
	}
}

public class Program5
{
	public static void main(String[] args)
	{
		Myframe5 frame = new Myframe5();
	}
}
