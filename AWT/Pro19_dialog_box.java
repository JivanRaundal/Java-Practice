/* Dialog box :-

NOTE: -Dialog is nothing but a frame. So it can work as a constructor also. You can add components also in dialog box.

NOTE: 'super(frame, false)' => If true, whole focus goes on dialog box only. You can't switch to parent frame without closing your
							   dialog box.
							   If false, you can switch to parent frame without closing dialog box.
*/

import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame
{
	//String str;
	
	public Myframe()
	{	
		//str = "Hello World";
		setSize(500,500);
		setTitle("Myframe");
		setLocationRelativeTo(null);
		setBackground(Color.CYAN);
		setLayout(null);
		setResizable(false);
		setVisible(true);
		
		this.addMouseListener(new MyMouseListener(this));
		this.addWindowListener(new WindowCloser(this));
	}
	public void paint(Graphics g)
	{
		//g.drawString(str,50,80);
	}
}

class Mydialog extends Dialog
{
	//Note: This parameterized constructor is compulsory for Dialog class
	public Mydialog(Myframe frame)			//frame is parent of your Mydialog
	{
		super(frame, true);
		setSize(250,250);
		setTitle("Message");
		setBackground(new Color(232, 199, 251));
		setLocationRelativeTo(frame);
		setVisible(true);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
	}
}

class MyMouseListener extends MouseAdapter
{
	Myframe frame;
	
	public MyMouseListener(Myframe temp)
	{
		frame = temp;
	}
	public void mouseClicked(MouseEvent e)
	{
		//frame.str = "Mouse Clicked";
		//frame.repaint();
		
		Mydialog md = new Mydialog(frame);		//Creating object of Mydialog class so that it's constructor will get called
	}
}

class Pro19_dialog_box
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
	}
}