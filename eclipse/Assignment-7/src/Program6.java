
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

class Myframe6 extends Frame
{
	Panel mainPanel, panel1, subPanel1, subPanel2, subPanel3;
	Label lblregal, lblregister, lbldate, lbltotal;
	Label lblname, lblphoneNumber, lblbirthdate, lblcollege, lblchoose; 
	Label lblcfee, lblcppfee, lbldsfee, lbladsfee, lbljavafee, lblpythonfee;
	Button btnunknown, btnconfirm, btnpay;
	TextField txtname, txtphoneNumber; 
	Choice cmbday, cmbmonth, cmbyear, cmbcollege;
	Checkbox chkc, chkcpp, chkds, chkads, chkjava, chkpython;
	
	public Myframe6()
	{
		//To get size of Screen 
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) screenSize.getWidth();			//returns Screen Width in double type
		int y = (int) screenSize.getHeight();			//returns Screen Height in double type
		//System.out.println("x = " + x + " y = " + y);   // Width = 1280 & Height = 720 
		
		setSize(x,y);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		
		addComponent();
		txtname.requestFocus();
		
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
		Font f1 = new Font("verdena", Font.BOLD, 23);
		Font f2 = new Font("verdena", Font.BOLD, 21);
		Font f3 = new Font("verdena", Font.BOLD, 20);
		Font f4 = new Font("verdena", Font.BOLD, 17);
		MyActionListener6 mal = new MyActionListener6(this);
		
		//adding mainPanel
		mainPanel = new Panel();
		mainPanel.setBounds(0,0,getWidth(),getHeight());
		mainPanel.setLayout(null);
		mainPanel.setBackground(new Color(124, 174, 77));
		
		//adding Label lblregal
		lblregal = new Label("REGAL");
		lblregal.setBounds(5,5,1270,60);
		lblregal.setFont(new Font("verdena", Font.BOLD, 40));
		lblregal.setBackground(new Color(1, 56, 217));
		lblregal.setForeground(Color.white);
		lblregal.setAlignment(Label.CENTER);
		mainPanel.add(lblregal);
		
		//adding panel1
		panel1 = new Panel();
		panel1.setBounds(5,70,1270,645);
		panel1.setLayout(null);
		panel1.setBackground(new Color(16, 180, 232));
		mainPanel.add(panel1);
		
		//adding subPanel1 & subPanel2
		subPanel1 = new Panel();
		subPanel1.setBounds(50,50,940,585);
		subPanel1.setLayout(null);
		subPanel1.setBackground(new Color(1, 56, 217));
		panel1.add(subPanel1);
		
		subPanel2 = new Panel();
		subPanel2.setBounds(1000,50,220,585);
		subPanel2.setLayout(null);
		subPanel2.setBackground(new Color(1, 56, 217));
		panel1.add(subPanel2);
		
		//adding Label : lblregister, lbldate, lbltotal
		lblregister = new Label("Register here ::");
		//lblregister.setBounds(10,10,220,30);
		lblregister.setBounds(50,10,220,30);
		lblregister.setForeground(Color.black);
		lblregister.setFont(f1);
		panel1.add(lblregister);
		
		//Code to get System date
		Calendar cld = Calendar.getInstance();
		Date d = cld.getTime();
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		String date = sd.format(d);

		lbldate = new Label(date);			//system date will be displayed as a text of lbldate label	
		lbldate.setBounds(1000,10,150,30);
		lbldate.setForeground(Color.black);
		lbldate.setFont(f1);
		panel1.add(lbldate);
		
		lbltotal = new Label("Total ::");
		lbltotal.setBounds(10,15,200,20);
		lbltotal.setFont(f2);
		lbltotal.setForeground(Color.black);
		subPanel2.add(lbltotal);
		
		//adding Button : btnunknown at bottom-left corner
		btnunknown = new Button("X");
		btnunknown.setBounds(10,605,30,30);
		btnunknown.setBackground(Color.red);
		btnunknown.setForeground(Color.yellow);
		btnunknown.setFont(f2);
		btnunknown.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel1.add(btnunknown);
		btnunknown.addActionListener(mal);				//connection
		//to close window when clicked on btnunknown
		/* btnunknown.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				dispose();
			}
		}); */
		
		//adding Label : lblname, lblphoneNumber, lblbirthdate, lblcollege, lblchoose
		lblname = new Label("Name ::");
		lblname.setBounds(10,60,230,30);
		lblname.setFont(f3);
		lblname.setForeground(Color.white);
		lblname.setAlignment(Label.RIGHT);
		subPanel1.add(lblname);
		
		lblphoneNumber = new Label("PhoneNumber ::");
		lblphoneNumber.setBounds(10,110,230,30);
		lblphoneNumber.setFont(f3);
		lblphoneNumber.setForeground(Color.white);
		lblphoneNumber.setAlignment(Label.RIGHT);
		subPanel1.add(lblphoneNumber);
		
		lblbirthdate = new Label("BirthDate ::");
		lblbirthdate.setBounds(10,160,230,30);
		lblbirthdate.setFont(f3);
		lblbirthdate.setForeground(Color.white);
		lblbirthdate.setAlignment(Label.RIGHT);
		subPanel1.add(lblbirthdate);
		
		lblcollege = new Label("College ::");
		lblcollege.setBounds(10,210,230,30);
		lblcollege.setFont(f3);
		lblcollege.setForeground(Color.white);
		lblcollege.setAlignment(Label.RIGHT);
		subPanel1.add(lblcollege);
		
		lblchoose = new Label("Choose ::");
		lblchoose.setBounds(10,260,230,30);
		lblchoose.setFont(f3);
		lblchoose.setForeground(Color.white);
		lblchoose.setAlignment(Label.RIGHT);
		subPanel1.add(lblchoose);
		
		//adding TextField : txtname & txtphoneNumber
		txtname = new TextField();
		txtname.setBounds(260,60,550,30);
		txtname.setFont(f4);
		txtname.setBackground(new Color(16, 180, 232));
		subPanel1.add(txtname);
		
		txtphoneNumber = new TextField();
		txtphoneNumber.setBounds(260,110,550,30);
		txtphoneNumber.setFont(f4);
		txtphoneNumber.setBackground(new Color(16, 180, 232));
		subPanel1.add(txtphoneNumber);
		//connections for txtname & txtphoneNumber
		MyKeyListener6 mkl = new MyKeyListener6(this);
		txtname.addKeyListener(mkl);
		txtphoneNumber.addKeyListener(mkl);
		
		//adding ComboBox (Choice) : cmbday, cmbmonth, cmbyear, cmbcollege
		//1)year 2)month & 3)year
		cmbyear = new Choice();
		cmbyear.setBounds(260,160,150,30);
		cmbyear.setBackground(new Color(16, 180, 232));
		cmbyear.setFont(f4);
		subPanel1.add(cmbyear);
		
		cmbmonth = new Choice();
		cmbmonth.setBounds(460,160,150,30);
		cmbmonth.setBackground(new Color(16, 180, 232));
		cmbmonth.setFont(f4);
		subPanel1.add(cmbmonth);
		
		cmbday = new Choice();
		cmbday.setBounds(660,160,150,30);
		cmbday.setBackground(new Color(16, 180, 232));
		cmbday.setFont(f4);
		subPanel1.add(cmbday);
		//Connections for month only
		cmbmonth.addItemListener(new ComoboxItemListener6(this));
		//fiiling year & month comboxes
		fillcmbyear();
		fillcmbmonth();
		
		cmbcollege = new Choice();
		cmbcollege.setBounds(260,210,550,30);
		cmbcollege.setBackground(new Color(16, 180, 232));
		cmbcollege.setFont(f4);
		subPanel1.add(cmbcollege);
		//filling college combobox
		fillcmbcollege();
		
		//adding subPanel3
		subPanel3 = new Panel();
		subPanel3.setBounds(260,260,550,220);
		subPanel3.setBackground(new Color(124, 174, 77));
		subPanel3.setLayout(null);
		subPanel1.add(subPanel3);
		
		//adding Button : btnconfirm, btnpay
		btnconfirm = new Button("CONFIRM");
		btnconfirm.setBounds(260,500,550,40);
		btnconfirm.setBackground(Color.red);
		btnconfirm.setForeground(Color.yellow);
		btnconfirm.setFont(f3);
		btnconfirm.setCursor(new Cursor(Cursor.HAND_CURSOR));
		subPanel1.add(btnconfirm);
		
		btnpay = new Button("PAY");
		btnpay.setBounds(10,500,200,40);
		btnpay.setBackground(Color.red);
		btnpay.setForeground(Color.yellow);
		btnpay.setFont(f3);
		btnpay.setCursor(new Cursor(Cursor.HAND_CURSOR));
		subPanel2.add(btnpay);
		//connecting Buttons with ActionListener
		btnconfirm.addActionListener(mal);
		btnpay.addActionListener(mal);
		
		//adding Checkbox : chkc, chkcpp, chkds, chkads, chkjava, chkpython
		chkc = new Checkbox("C");
		chkc.setBounds(60,40,90,20);
		chkc.setFont(f4);
		chkc.setForeground(Color.black);
		//chkc.setBackground(Color.white);
		subPanel3.add(chkc);
		
		chkcpp = new Checkbox("CPP");
		chkcpp.setBounds(60,100,90,20);
		chkcpp.setFont(f4);
		chkcpp.setForeground(Color.black);
		subPanel3.add(chkcpp);
		
		chkds = new Checkbox("DS");
		chkds.setBounds(60,160,90,20);
		chkds.setFont(f4);
		chkds.setForeground(Color.black);
		subPanel3.add(chkds);
		
		chkads = new Checkbox("ADS");
		chkads.setBounds(330,40,90,20);
		chkads.setFont(f4);
		chkads.setForeground(Color.black);
		subPanel3.add(chkads);
		
		chkjava = new Checkbox("JAVA");
		chkjava.setBounds(330,100,90,20);
		chkjava.setFont(f4);
		chkjava.setForeground(Color.black);
		subPanel3.add(chkjava);
		
		chkpython = new Checkbox("PYTHON");
		chkpython.setBounds(330,160,90,20);
		chkpython.setFont(f4);
		chkpython.setForeground(Color.black);
		subPanel3.add(chkpython);
		
		//adding Label : lblcfee, lblcppfee, lbldsfee, lbladsfee, lbljavafee, lblpythonfee
		lblcfee = new Label("3000");
		lblcfee.setBounds(170,40,50,20);
		lblcfee.setFont(f4);
		lblcfee.setForeground(Color.black);
		subPanel3.add(lblcfee);
		
		lblcppfee = new Label("3500");
		lblcppfee.setBounds(170,100,50,20);
		lblcppfee.setFont(f4);
		lblcppfee.setForeground(Color.black);
		subPanel3.add(lblcppfee);
		
		lbldsfee = new Label("3000");
		lbldsfee.setBounds(170,160,50,20);
		lbldsfee.setFont(f4);
		lbldsfee.setForeground(Color.black);
		subPanel3.add(lbldsfee);
		
		lbladsfee = new Label("3000");
		lbladsfee.setBounds(440,40,50,20);
		lbladsfee.setFont(f4);
		lbladsfee.setForeground(Color.black);
		subPanel3.add(lbladsfee);
		
		lbljavafee = new Label("4000");
		lbljavafee.setBounds(440,100,50,20);
		lbljavafee.setFont(f4);
		lbljavafee.setForeground(Color.black);
		subPanel3.add(lbljavafee);
		
		lblpythonfee = new Label("4000");
		lblpythonfee.setBounds(440,160,50,20);
		lblpythonfee.setFont(f4);
		lblpythonfee.setForeground(Color.black);
		subPanel3.add(lblpythonfee);
		
		add(mainPanel);
	}
	
	private void fillcmbcollege()
	{
		String clg[] = {"Sinhgad College of Engineering", "Pune Institute of Computer & Technonoly", "Bharti Vidhyapeeth College of Engineering",
				        "AISSM College of Engineering", "College Of Enginnering Pune"};
		for(String x : clg)
		{
			cmbcollege.add(x);
		}
	}
	private void fillcmbyear()
	{
		Calendar cal = Calendar.getInstance();
		for(int i=1990; i<=cal.get(Calendar.YEAR); i++)
			cmbyear.add(String.valueOf(i));
	}
	private void fillcmbmonth()
	{
		for(int i=1; i<=12; i++)
			cmbmonth.add(String.valueOf(i));
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
}

//TextField Validations
class MyKeyListener6 extends KeyAdapter
{
	Myframe6 frame;
	
	public MyKeyListener6(Myframe6 ref)
	{
		frame = ref;
	}
	
	public void keyTyped(KeyEvent e)
	{
		TextField txttemp = (TextField) e.getSource();
		char ch = e.getKeyChar();
		
		if(txttemp == frame.txtname)
		{
			if(!Character.isAlphabetic(ch) && ch!=' ')			//if character is not alphabet & not space then, cnsume the event
				e.consume();
		}
		if(txttemp == frame.txtphoneNumber)
		{
			if(!Character.isDigit(ch))				//if character is not digit, then consume the event
				e.consume();
		}
		
	}
}

class ComoboxItemListener6 implements ItemListener
{
	Myframe6 frame;
	
	public ComoboxItemListener6(Myframe6 ref)
	{
		frame = ref;
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		int year = Integer.parseInt(frame.cmbyear.getSelectedItem());
		int month = Integer.parseInt(frame.cmbmonth.getSelectedItem());
		frame.cmbday.removeAll();			//to remove previous items
		frame.fillcmbday(year, month);
		
	}
}

class MyActionListener6 implements ActionListener
{
	Myframe6 frame;
	
	public MyActionListener6(Myframe6 ref)
	{
		frame = ref;
	}
	
	public void actionPerformed(ActionEvent e)
	{	
		Button btnclicked = (Button) e.getSource();
		
		if(btnclicked.getActionCommand().equals("CONFIRM"))
		{
			if( frame.txtname.getText().equals("") || frame.txtphoneNumber.getText().equals("") || frame.cmbday.getSelectedItem()==null ||
			  (frame.chkc.getState()==false && frame.chkcpp.getState()==false && frame.chkds.getState()==false && frame.chkads.getState()==false
			   && frame.chkjava.getState()==false && frame.chkpython.getState()==false) )
			{
				//dialog box will open to give message that fill all details
				Mydialog6 d = new Mydialog6(frame, btnclicked);
			}
			else
			{
				int total = 0;
				if(frame.chkc.getState())
					total = total + Integer.parseInt(frame.lblcfee.getText());
				if(frame.chkcpp.getState())
					total = total + Integer.parseInt(frame.lblcppfee.getText());
				if(frame.chkds.getState())
					total = total + Integer.parseInt(frame.lbldsfee.getText());
				if(frame.chkads.getState())
					total = total + Integer.parseInt(frame.lbladsfee.getText());
				if(frame.chkjava.getState())
					total = total + Integer.parseInt(frame.lbljavafee.getText());
				if(frame.chkpython.getState())
					total = total + Integer.parseInt(frame.lblpythonfee.getText());

				frame.lbltotal.setText("Total :: " + String.valueOf(total) + " Rs");
			}
		}
		
		if(btnclicked.getActionCommand().equals("PAY"))
		{
			//if Payed, then reset/cear all the components 
			frame.txtname.setText("");
			frame.txtphoneNumber.setText("");
			frame.chkc.setState(false);
			frame.chkcpp.setState(false);
			frame.chkds.setState(false);
			frame.chkads.setState(false);
			frame.chkjava.setState(false);
			frame.chkpython.setState(false);
			frame.lbltotal.setText("Total ::");
			frame.cmbyear.select(0);
			frame.cmbmonth.select(0);
			if(frame.cmbday.getSelectedItem() != null)
				frame.cmbday.select(0);
			frame.cmbcollege.select(0);
			
			Mydialog6 md = new Mydialog6(frame, btnclicked);
		}
		
		if(btnclicked == frame.btnunknown)
		{
			Mydialog6 md2 = new Mydialog6(frame, btnclicked);
		}
	}
}

class Mydialog6 extends Dialog
{
	Myframe6 frame;
	Button btnclicked;
	Label lblmsg;
	Button btnok, btnyes, btnno;
	
	public Mydialog6(Myframe6 temp, Button btntemp)
	{
		super(temp, false);
		frame = temp;
		btnclicked = btntemp;
		setSize(300,200);
		setLocationRelativeTo(frame);
		setUndecorated(true);
		setResizable(false);
		setLayout(null);
		setBackground(new Color(170, 188, 242));
		
		if(btnclicked==frame.btnconfirm || btnclicked==frame.btnpay)
			initialize1();
		if(btnclicked==frame.btnunknown)
			initialize2();
		
		setVisible(true);
	}
	
	private void initialize1()
	{
		Font f = new Font("verdena", Font.BOLD, 20);
		//adding label
		lblmsg = new Label("");
		lblmsg.setBounds(20,40,260,25);
		lblmsg.setFont(f);
		lblmsg.setAlignment(Label.CENTER);
		add(lblmsg);
		if(btnclicked == frame.btnconfirm)
			lblmsg.setText("please fill all details");
		if(btnclicked == frame.btnpay)
			lblmsg.setText("Payment Sucessfull");
				
		//adding Button
		btnok = new Button("OK");
		btnok.setFont(f);
		btnok.setBounds(100,120,100,30);
		btnok.setBackground(Color.red);
		btnok.setForeground(Color.yellow);
		btnok.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(btnok);
		
		btnok.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				dispose();
			}
		});
	}
	
	private void initialize2()
	{
		Font f = new Font("verdena", Font.BOLD, 20);
		
		//adding label
		lblmsg = new Label("Do you want to exit ?");
		lblmsg.setBounds(20,40,260,25);
		lblmsg.setFont(f);
		lblmsg.setAlignment(Label.CENTER);
		add(lblmsg);
		
		//adding Button
		btnyes = new Button("YES");
		btnyes.setFont(f);
		btnyes.setBounds(50,120,75,30);
		btnyes.setBackground(Color.red);
		btnyes.setForeground(Color.yellow);
		btnyes.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(btnyes);
		
		btnno = new Button("NO");
		btnno.setFont(f);
		btnno.setBounds(175,120,75,30);
		btnno.setBackground(Color.red);
		btnno.setForeground(Color.yellow);
		btnno.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(btnno);
		
		btnyes.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				dispose();
				frame.dispose();
			}
		});
		
		btnno.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				dispose();
			}
		});
		
	}
}

public class Program6 
{
	public static void main(String[] args)
	{
		Myframe6 frame = new Myframe6();
	}
}
