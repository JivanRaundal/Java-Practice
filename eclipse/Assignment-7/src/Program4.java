
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Myframe4 extends Frame
{
	Panel mainPanel, panel1, subPanel1, panel2, subPanel2;
	Label lblclose, lblmodule1, lblmodule2, lblbase, lblpower, lblans, lblstartNumber, lblendNumber;
	Button btnansModule1, btnansModule2;
	TextField txtbase, txtpower, txtstartNumber, txtendNumber;
	TextArea txtans;
	
	public Myframe4()
	{
		setSize(450,465);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		setUndecorated(true);
		
		addComponent();
		txtbase.requestFocus();
		
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
		Font f1 = new Font("verdena", Font.BOLD, 15);
		Font f2 = new Font("verdena", Font.BOLD, 20);
		Font f3 = new Font("verdena", Font.BOLD, 12);
		MyKeyListener4 mkl = new MyKeyListener4();		//for TextFiled validations
		
		//adding Panel : mainPanel, panel1, subPanel1, panel2, subPanel2
		mainPanel = new Panel();
		mainPanel.setBounds(0, 0, getWidth(), getHeight());
		mainPanel.setBackground(new Color(255, 201, 180));
		mainPanel.setLayout(null);
		
		panel1 = new Panel();
		panel1.setBounds(8,40,434,160);
		panel1.setBackground(new Color(255, 149, 109));
		panel1.setLayout(null);
		mainPanel.add(panel1);
		
		subPanel1 = new Panel();
		subPanel1.setBounds(8,8,418,144);
		subPanel1.setBackground(new Color(255, 201, 180));
		subPanel1.setLayout(null);
		panel1.add(subPanel1);
		
		panel2 = new Panel();
		panel2.setBounds(8,235,434,210);
		panel2.setBackground(new Color(255, 149, 109));
		panel2.setLayout(null);
		mainPanel.add(panel2);
		
		subPanel2 = new Panel();
		subPanel2.setBounds(8,8,418,194);
		subPanel2.setBackground(new Color(255, 201, 180));
		subPanel2.setLayout(null);
		panel2.add(subPanel2);
		
		//adding Label : lblclose, lblmodule1, lblmodule2
		lblclose = new Label("CLOSE");
		lblclose.setBounds(342,10,100,20);
		lblclose.setForeground(Color.red);
		lblclose.setFont(f2);
		lblclose.setAlignment(Label.RIGHT);
		lblclose.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(lblclose);
		//connecting lblclose to MouseListener
		lblclose.addMouseListener(new MyMouseListener4(this));
		
		lblmodule1 = new Label("Module-1");
		lblmodule1.setBounds(8,18,100,18);
		lblmodule1.setForeground(Color.red);
		lblmodule1.setFont(f1);
		mainPanel.add(lblmodule1);
		
		lblmodule2 = new Label("Module-2");
		lblmodule2.setBounds(8,210,100,18);
		lblmodule2.setForeground(Color.red);
		lblmodule2.setFont(f1);
		mainPanel.add(lblmodule2);
		
		//adding TextField : txtbase & txtpower
		txtbase = new TextField();
		txtbase.setBounds(8,38,90,32);
		txtbase.setFont(f1);
		txtbase.setBackground(new Color(255, 149, 109));
		subPanel1.add(txtbase);
		
		txtpower = new TextField();
		txtpower.setBounds(118,38,90,32);
		txtpower.setBackground(new Color(255, 149, 109));
		txtpower.setFont(f1);
		subPanel1.add(txtpower);
		//connecting TextFields
		txtbase.addKeyListener(mkl);
		txtpower.addKeyListener(mkl);
		
		//adding Label : lblans, lblbase & lblpower
		lblans = new Label("ANSWER IS HERE");
		lblans.setBounds(8,88,402,40);
		lblans.setBackground(new Color(255, 149, 109));
		lblans.setAlignment(Label.CENTER);
		lblans.setFont(f3);
		subPanel1.add(lblans);
		
		lblbase = new Label("EnterBase :");
		lblbase.setBounds(8,13,90,15);
		lblbase.setFont(f3);
		subPanel1.add(lblbase);
		
		lblpower = new Label("EnterPower :");
		lblpower.setBounds(118,13,90,15);
		lblpower.setFont(f3);
		subPanel1.add(lblpower);
		
		//adding Button btnansModule1
		btnansModule1 = new Button("CLICK FOR ANSWER");
		btnansModule1.setBounds(229,10,181,60);
		btnansModule1.setBackground(Color.red);
		btnansModule1.setForeground(Color.yellow);
		btnansModule1.setFont(f3);
		btnansModule1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		subPanel1.add(btnansModule1);
		//connection
		btnansModule1.addActionListener(new MyActionListener4(this));
		
		//adding TextField : txtstartNumber & txtendNumber
		txtstartNumber = new TextField();
		txtstartNumber.setBounds(8,38,90,32);
		txtstartNumber.setFont(f1);
		txtstartNumber.setBackground(new Color(255, 149, 109));
		subPanel2.add(txtstartNumber);
		
		txtendNumber = new TextField();
		txtendNumber.setBounds(118,38,90,32);
		txtendNumber.setBackground(new Color(255, 149, 109));
		txtendNumber.setFont(f1);
		subPanel2.add(txtendNumber);
		//connections for TextFields
		txtstartNumber.addKeyListener(mkl);
		txtendNumber.addKeyListener(mkl);
		
		//adding Label : lblstartNumber & lblendNumber
		lblstartNumber = new Label("StartNumber :");
		lblstartNumber.setBounds(8,13,90,15);
		lblstartNumber.setFont(f3);
		subPanel2.add(lblstartNumber);
		
		lblendNumber = new Label("EndNumber :");
		lblendNumber.setBounds(118,13,90,15);
		lblendNumber.setFont(f3);
		subPanel2.add(lblendNumber);
		
		//adding Button btnansModule2
		btnansModule2 = new Button("CLICK FOR ANSWER");
		btnansModule2.setBounds(229,10,181,60);
		btnansModule2.setBackground(Color.red);
		btnansModule2.setForeground(Color.yellow);
		btnansModule2.setFont(f3);
		btnansModule2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		subPanel2.add(btnansModule2);
		//connection
		btnansModule2.addActionListener(new MyActionListener4(this));
		
		//adding TextArea txtans
		txtans = new TextArea("See here answer");
		txtans.setBounds(8,90,402,96);
		txtans.setFont(f1);
		txtans.setBackground(new Color(255, 149, 109));
		subPanel2.add(txtans);
		
		add(mainPanel);
	}
}

class MyActionListener4 implements ActionListener
{
	Myframe4 frame;
	
	public MyActionListener4(Myframe4 ref)
	{
		frame = ref;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Button btnclicked = (Button) e.getSource();
		
		if(btnclicked == frame.btnansModule1)
		{
			baseRaisedToPower();
		}
		
		if(btnclicked == frame.btnansModule2)
		{
			primeOperation();
		}
	}
	
	private void baseRaisedToPower()
	{
		String str1,str2;
		str1 = frame.txtbase.getText();
		str2 = frame.txtpower.getText();
		try
		{
			int base = Integer.parseInt(str1);
			int power = Integer.parseInt(str2);
			int ans = 1;
			for(int i=1; i<=power; i++)
			{
				ans = ans * base;
			}
			
			frame.lblans.setText("ANSWER = " + String.valueOf(ans));
		}
		catch(NumberFormatException ne)
		{
			frame.lblans.setText("ANSWER IS HERE");
			frame.txtbase.setText("");
			frame.txtpower.setText("");					
			frame.txtbase.requestFocus();				//this method will move cursor on txtbase only
			Mydialog4_1 md2 = new Mydialog4_1(frame); 	//dialog box will open
			return;
		}
	}
	
	private void primeOperation()
	{
		frame.txtans.setText("");
		String prime_ans = "Prime Numbers : ";
		String str1 = frame.txtstartNumber.getText();
		String str2 = frame.txtendNumber.getText();
		
		try
		{
			//If only one number is entered, then check if that number is prime or not
			if(str1.equals(""))		
			{
				if(isPrimeNumber(Integer.parseInt(str2)))
					frame.txtans.setText(str2 + " is a prime number");
				else
					frame.txtans.setText(str2 + " is not a prime number");
				return;
			}
			if(str2.equals(""))
			{
				if(isPrimeNumber(Integer.parseInt(str1)))
					frame.txtans.setText(str1 + " is a prime number");
				else
					frame.txtans.setText(str1 + " is not a prime number");
				return;
			}
			
			//if both numbers are entered, then find prime numbers between them
			int a = Integer.parseInt(str1);
			int b = Integer.parseInt(str2);
			int num1 = a < b ? a : b;
			int num2 = a > b ? a : b;
			
			if(num1 < 2 && num1 >=0)
			{
				num1 = 2;
			}
			
			int i,j,flag;
			for(i=num1; i<=num2;  i++)
			{
				flag = 0;
				for(j=2; j<=i/2; j++)
				{
					if(i%j == 0)
					{
						flag = 1;
						break;
					}
				}
				if(flag == 0)
				{
					prime_ans = prime_ans + String.valueOf(i) + ", ";
					frame.txtans.setText(prime_ans);
				}
			}
		}
		catch(NumberFormatException ne)
		{
			//frame.txtans.setText("Enter Correct Data");
			frame.txtstartNumber.setText("");
			frame.txtendNumber.setText("");					
			frame.txtstartNumber.requestFocus();				//this method will move cursor on txtstartNumber only
			Mydialog4_1 md2 = new Mydialog4_1(frame); 			//dialog box will open
			return;
		}
	}
	
	private boolean isPrimeNumber(int num)
	{
		int i,flag=0;
		if(num<2 && num>=0)
			return false;			//not prime
			
		for(i=2; i<num; i++)
		{
			if(num%i == 0)
			{
				flag=1;
				break;
			}
		}
		if(flag == 0)
			return true;
		else
			return false;
	}
}

//Note: for validations on TextField or To handle TextField events, we have to use KeyListener interface 
class MyKeyListener4 extends KeyAdapter 		//OR implements KeyListener  [ methods : keyPressed(), keyReleased(), keyTyped() ]
{	
	//@Overriden methods
	public void keyTyped(KeyEvent e)
	{	
		//For validations, we have to access event generating character
		char ch = e.getKeyChar();				//this method will return event generating character
		
		if(!Character.isDigit(ch))
		{
			e.consume();
		}
	}
}

class MyMouseListener4 extends MouseAdapter
{
	Myframe4 frame;
	
	public MyMouseListener4(Myframe4 temp)
	{
		frame = temp;
	}
	
	public void mouseClicked(MouseEvent e)
	{
		//frame.dispose();
		
		//to create DialogBox by clicking on lblclose
		Mydialog4 md = new Mydialog4(frame);
	}
}

class Mydialog4 extends Dialog				//dialog box for close label
{
	Myframe4 frame;
	Button btnyes, btnno;
	Label lblmsg;
	
	public Mydialog4(Myframe4 ref)
	{
		super(ref, false);
		frame = ref;
		setSize(200,200);
		setLayout(null);
		setLocationRelativeTo(null);
		setBackground(new Color(255, 85, 85));
		setUndecorated(true);
		setResizable(false);
		
		initialize();
		
		setVisible(true);
	}

	private void initialize() 
	{
		Font f = new Font("verdena", Font.BOLD, 12);
		//adding Label
		lblmsg = new Label("Do you want to exit ?");
		lblmsg.setBounds(20,50,170,30);
		lblmsg.setFont(new Font("verdena", Font.BOLD, 12));
		lblmsg.setAlignment(Label.CENTER);
		add(lblmsg);
		
		//adding Button : btnyes, btnno
		btnyes = new Button("YES");
		btnyes.setBounds(20,120,70,30);
		btnyes.setBackground(Color.red);
		btnyes.setForeground(Color.yellow);
		btnyes.setFont(f);
		btnyes.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(btnyes);
		
		btnno = new Button("NO");
		btnno.setBounds(110,120,70,30);
		btnno.setBackground(Color.red);
		btnno.setForeground(Color.yellow);
		btnno.setFont(f);
		btnno.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(btnno);
		
		//making Connections
		MyActionListener4_2 mal = new MyActionListener4_2(this);
		btnyes.addActionListener(mal);
		btnno.addActionListener(mal);
	}
}

class MyActionListener4_2 implements ActionListener
{
	Mydialog4 md;
	
	public MyActionListener4_2(Mydialog4 ref)
	{
		md = ref;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Button btnclicked;
		btnclicked = (Button) e.getSource();
		
		if(btnclicked.getActionCommand().equals("YES"))
		{
			//System.out.println("CLOSE THE MAIN FRAME");
			md.dispose();							//closing dialog box
			md.frame.dispose();						//closing main frame
		}
		else if(btnclicked.getActionCommand().equals("NO"))
		{
			//System.out.println("DON'T CLOSE MAIN FRAME");
			md.dispose();							//closing dialog box
		}
	}
}

class Mydialog4_1 extends Dialog					//dialog box for Buttons
{
	Myframe4 frame;
	Button btnok;
	Label lblmsg1, lblmsg2;
	
	public Mydialog4_1(Myframe4 temp) 
	{
		super(temp, false);
		frame = temp;
		setSize(200,150);
		setUndecorated(true);
		setResizable(false);
		setLayout(null);
		setBackground(new Color(255, 85, 85));
		setLocationRelativeTo(frame);
		
		initialize();
		
		setVisible(true);
	}
	
	private void initialize()
	{
		//adding Label on dialog box
		lblmsg1 = new Label("Invalid Data!!");
		lblmsg1.setBounds(10,30,180,20);
		lblmsg1.setFont(new Font("verdena", Font.BOLD, 12));
		lblmsg1.setAlignment(Label.CENTER);
		add(lblmsg1);
		
		lblmsg2 = new Label("please enter valid data");
		lblmsg2.setBounds(10,50,180,20);
		lblmsg2.setFont(new Font("verdena", Font.BOLD, 12));
		lblmsg2.setAlignment(Label.CENTER);
		add(lblmsg2);
		
		//adding Button
		btnok = new Button("OK");
		btnok.setBounds(75,110,50,25);
		btnok.setBackground(Color.red);
		btnok.setForeground(Color.yellow);
		btnok.setFont(new Font("verdena", Font.BOLD, 15));
		btnok.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(btnok);
		
		//adding MouseListener for btnok to close dialog box
		btnok.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				dispose();			//will dispose the dialog box
			}
		});
	}
}


//main
public class Program4 
{
	public static void main(String[] args)
	{
		Myframe4 frame = new Myframe4();
	}
}

