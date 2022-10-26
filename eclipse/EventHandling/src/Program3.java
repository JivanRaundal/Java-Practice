
import java.awt.*;
import java.awt.event.*;

class Myframe3 extends Frame
{
	Panel mainPanel;
	Button btnpune, btnnashik, btnmumbai, btndisplay;
	
	public Myframe3()
	{
		setSize(320,300);
		setTitle("Myframe3");
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		
		addComponent();
		
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
		Font f = new Font("verdena", Font.BOLD, 15);
		
		//adding mainPanel
		mainPanel = new Panel();
		mainPanel.setBounds(0,0,getWidth(),getHeight());
		mainPanel.setBackground(new Color(232, 199, 251));
		mainPanel.setLayout(null);
		
		
		//adding Button : btnpune, btnnashik, btnmumbai
		btnpune = new Button("PUNE");
		btnpune.setBounds(20,80,80,30);
		btnpune.setFont(f);
		btnpune.setBackground(Color.red);
		btnpune.setForeground(Color.yellow);
		btnpune.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnpune);
		
		btnnashik = new Button("NASHIK");
		btnnashik.setBounds(120,80,80,30);
		btnnashik.setFont(f);
		btnnashik.setBackground(Color.red);
		btnnashik.setForeground(Color.yellow);
		btnnashik.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnnashik);
		
		btnmumbai = new Button("MUMBAI");
		btnmumbai.setBounds(220,80,80,30);
		btnmumbai.setFont(f);
		btnmumbai.setBackground(Color.red);
		btnmumbai.setForeground(Color.yellow);
		btnmumbai.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnmumbai);
		
		btndisplay = new Button("DISPLAY");
		btndisplay.setBounds(120,180,80,30);
		btndisplay.setFont(f);
		btndisplay.setBackground(Color.blue);
		btndisplay.setForeground(Color.yellow);
		btndisplay.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btndisplay);
		
		//making connections for Button events 
		btnpune.addActionListener(new MyActionListener3(this));
		btnnashik.addActionListener(new MyActionListener3(this));
		btnmumbai.addActionListener(new MyActionListener3(this));
		
		add(mainPanel);
	}
}

class MyActionListener3 implements ActionListener
{
	Myframe3 frame;
	
	public MyActionListener3(Myframe3 ref)
	{
		frame = ref;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Button btntemp;
		btntemp = (Button)e.getSource();
		String str = btntemp.getActionCommand();			//by default Action Command is Button Label (name)
		
		frame.btndisplay.setLabel(str);					//will set the Label of Button to specified string
	}
}

public class Program3
{
	public static void main(String[] args) 
	{
		Myframe3 frame = new Myframe3();
	}
}
