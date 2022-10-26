// Label Event Handling using MouseListener & Dialog Box :-

import java.awt.*;
import java.awt.event.*;

class Myframe8 extends Frame
{
	Panel mainPanel;
	Label lblclose;
	
	public Myframe8()
	{
		setSize(300,300);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		
		initialize();
		
		setVisible(true);
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
	}
	
	private void initialize()
	{
		//adding mainPanel
		mainPanel = new Panel();
		mainPanel.setBounds(0,0,getWidth(),getHeight());
		mainPanel.setLayout(null);
		mainPanel.setBackground(Color.cyan);
		
		//adding Label : lblclose
		lblclose = new Label("CLOSE");
		lblclose.setBounds(100,120,100,30);
		lblclose.setFont(new Font("verdena", Font.BOLD, 22));
		lblclose.setForeground(Color.red);
		lblclose.setAlignment(Label.CENTER);
		lblclose.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(lblclose);
		
		//connectiong lblclose with MyMouseListener
		lblclose.addMouseListener(new MyMouseListener8(this));
		
		add(mainPanel);
	}
}

class MyMouseListener8 extends MouseAdapter
{
	Myframe8 frame;
	
	public MyMouseListener8(Myframe8 temp)
	{
		frame = temp;
	}
	
	public void mouseClicked(MouseEvent e)
	{
		//frame.dispose();
		
		//to create DialogBox by clicking on lblclose
		Mydialog8 md = new Mydialog8(frame);
	}
}

class Mydialog8 extends Dialog
{
	Myframe8 frame;
	Button btnyes, btnno;
	Label lblmsg;
	
	public Mydialog8(Myframe8 ref)
	{
		super(ref, false);
		frame = ref;
		setSize(200,200);
		setLayout(null);
		setLocationRelativeTo(null);
		setBackground(Color.gray);
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
		btnyes.setBackground(new Color(209, 150, 5));
		btnyes.setFont(f);
		btnyes.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(btnyes);
		
		btnno = new Button("NO");
		btnno.setBounds(110,120,70,30);
		btnno.setBackground(new Color(209, 150, 5));
		btnno.setFont(f);
		btnno.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(btnno);
		
		//making Connections
		MyActionListener8 mal = new MyActionListener8(this);
		btnyes.addActionListener(mal);
		btnno.addActionListener(mal);
	}
}

class MyActionListener8 implements ActionListener
{
	Mydialog8 md;
	
	public MyActionListener8(Mydialog8 ref)
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

public class Program8 
{
	public static void main(String[] args) 
	{
		Myframe8 frame = new Myframe8();
	}
}
