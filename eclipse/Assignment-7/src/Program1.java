
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Myframe1 extends Frame
{
	Panel mainPanel;
	Panel panel1;
	Panel subPanel1;
	Label lbltitle;
	Label lblanswer;
	TextField txtnum1, txtnum2;
	Button btnadd, btnsub, btnmul, btndiv;
	
	public Myframe1()
	{
		setSize(550,250);
		setTitle("ArithmeticOperations");
		setLocationRelativeTo(null);
		setBackground(Color.cyan);
		setLayout(null);
		setResizable(false);
		
		addComponent();
				
		txtnum1.requestFocus();			//will set cursor to num1 initially

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
		Font f = new Font("times new roman", Font.BOLD, 18);
		
		//adding mainPanel
		mainPanel = new Panel();
		mainPanel.setBounds(0, 0, getWidth(), getHeight());
		mainPanel.setLayout(null);
		mainPanel.setBackground(new Color(41, 108, 184));
		
		//adding panel1
		panel1 = new Panel();
		panel1.setBounds(20,75,510,70);
		panel1.setBackground(new Color(255, 102, 39));
		panel1.setLayout(null);
		mainPanel.add(panel1);
		
		//adding subPanel1
		subPanel1 = new Panel();
		subPanel1.setBounds(255,8,245,54);
		subPanel1.setBackground(new Color(254, 201, 180));
		subPanel1.setLayout(null);
		panel1.add(subPanel1);
		
		//adding Label lbltitle
		lbltitle = new Label("Enter 2 numbers in first 2 text fields and choose operation");
		lbltitle.setBounds(10,50,530,15);
		lbltitle.setFont(f);
		lbltitle.setAlignment(Label.CENTER);
		//lbltitle.setBackground(Color.white);
		mainPanel.add(lbltitle);
		
		//adding Label lblanswer
		lblanswer = new Label("ANSWER HERE");
		lblanswer.setBounds(20,170,510,35);
		lblanswer.setBackground(new Color(255, 102, 39));
		lblanswer.setFont(f);
		lblanswer.setAlignment(Label.CENTER);
		mainPanel.add(lblanswer);
		
		//adding TextField txtnum1 & txtnum2 on panel1
		txtnum1 = new TextField();
		txtnum1.setBounds(20,20,92,30);
		txtnum1.setFont(f);
		panel1.add(txtnum1);
	
		txtnum2 = new TextField();
		txtnum2.setBounds(142,20,92,30);
		txtnum2.setFont(f);
		panel1.add(txtnum2);
		
		//connections for TextFields with KeyListener 
		MyKeyListener1 mkl = new MyKeyListener1(this);
		txtnum1.addKeyListener(mkl);
		txtnum2.addKeyListener(mkl);;
		
		//adding Button btnadd, btnsub, btnmul & btndiv on subPanel1
		btnadd = new Button("ADD");
		btnadd.setBounds(9,9,49,36);
		btnadd.setBackground(Color.red);
		btnadd.setForeground(Color.yellow);
		btnadd.setFont(f);
		btnadd.setCursor(new Cursor(Cursor.HAND_CURSOR));
		subPanel1.add(btnadd);
		
		btnsub = new Button("SUB");
		btnsub.setBounds(67,9,49,36);
		btnsub.setBackground(Color.red);
		btnsub.setForeground(Color.yellow);
		btnsub.setFont(f);
		btnsub.setCursor(new Cursor(Cursor.HAND_CURSOR));
		subPanel1.add(btnsub);

		btnmul = new Button("MUL");
		btnmul.setBounds(125,9,49,36);
		btnmul.setBackground(Color.red);
		btnmul.setForeground(Color.yellow);
		btnmul.setFont(f);
		btnmul.setCursor(new Cursor(Cursor.HAND_CURSOR));
		subPanel1.add(btnmul);
		
		btndiv = new Button("DIV");
		btndiv.setBounds(183,9,49,36);
		btndiv.setBackground(Color.red);
		btndiv.setForeground(Color.yellow);
		btndiv.setFont(f);
		btndiv.setCursor(new Cursor(Cursor.HAND_CURSOR));
		subPanel1.add(btndiv);
		
		//connections for Buttons with ACtionListener
		MyActionListener1 mal = new MyActionListener1(this);
		btnadd.addActionListener(mal);
		btnsub.addActionListener(mal);
		btnmul.addActionListener(mal);
		btndiv.addActionListener(mal);
		
		add(mainPanel);
	}
}

class MyKeyListener1 extends KeyAdapter				//OR implements KeyListener (Mehtods => keyPressed(), keyReleased(), keyTyped())
{
	Myframe1 frame;
	
	public MyKeyListener1(Myframe1 ref)
	{
		frame = ref;
	}
	
	public void keyTyped(KeyEvent e)
	{
		char ch = e.getKeyChar();
		
		if( !Character.isDigit(ch) )		//means, if character is not digit, then consume the event else, let the event happen as it is
		{
			e.consume();
		}
	}
}

class MyActionListener1 implements ActionListener
{
	Myframe1 frame;
	
	public MyActionListener1(Myframe1 ref)
	{
		frame = ref;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String str1,str2;
		str1 = frame.txtnum1.getText();
		str2 = frame.txtnum2.getText();
		
		Button btntemp = (Button) e.getSource();
		String button_name = btntemp.getActionCommand();
		
		try
		{
			Double x = Double.parseDouble(str1);
			Double y = Double.parseDouble(str2);
			Double ans = 0.0;
			
			if(button_name.equals("ADD"))
			{
				ans = x + y;
				frame.lblanswer.setText("ADDITON = " + String.valueOf(ans));
			}
			else if(button_name.equals("SUB"))
			{
				ans = x - y;
				frame.lblanswer.setText("SUBSTRACTION = " + String.valueOf(ans));
			}
			else if(button_name.equals("MUL"))
			{
				ans = x * y;
				frame.lblanswer.setText("MULTIPLICATION = " + String.valueOf(ans));
			}
			else if(button_name.equals("DIV"))
			{
				try
				{
					ans = x / y;
					frame.lblanswer.setText("DIVISION = " + String.valueOf(ans));
				}
				catch(ArithmeticException ae)
				{
					frame.lblanswer.setText("Error, cannot divide by zero");
					return;
				}
			}
		}
		catch(NumberFormatException ne)
		{
			frame.txtnum1.setText("");
			frame.txtnum2.setText("");
			frame.txtnum1.requestFocus();
			//frame.lblanswer.setText("Enter correct data");
			
			//will open new dialog box if data is incorrect to display message that enter valid data
			Mydialog1 md = new Mydialog1(frame);
		}
	}
}

class Mydialog1 extends Dialog
{
	Myframe1 frame;
	Button btnok;
	Label lblmsg1, lblmsg2;
	
	public Mydialog1(Myframe1 temp) 
	{
		super(temp, false);
		frame = temp;
		setSize(200,150);
		setUndecorated(true);
		setResizable(false);
		setLayout(null);
		setBackground(Color.CYAN);
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
		
		lblmsg2 = new Label("please enter both numbers");
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

public class Program1
{
	public static void main(String args[])
	{
		Myframe1 frame = new Myframe1();
	}
}
