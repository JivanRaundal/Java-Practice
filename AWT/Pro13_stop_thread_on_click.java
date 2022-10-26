// Working with Thread and Frame :-

// Q. Stop counter on frame on Mouse Click.

import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame implements Runnable
{
	Thread t;				//thread as a datamember
	volatile boolean flag;
	String str;
	int  x,y;
	
	public Myframe()
	{
		setSize(500,500);
		setTitle("MyThreadFrame");
		setLocationRelativeTo(null);
		setBackground(Color.CYAN);
		setVisible(true);
		
		str="";
		x = 20;
		y = 70;
		flag = true;
		t = new Thread(this);		//thread created but not started in constructor
	}
	public void paint(Graphics g)			//@Overriden
	{
		g.setFont(new Font("times new roman", Font.BOLD, 20));
		g.drawString(str, x, y);
	}
	public void startThread()
	{
		//flag = true;
		t.start();
	}
	public void stopThread()
	{
		flag = false;
	}
	public void run()						//@Overriden
	{
		int i = 1;
		while(flag == true)
		{
			str = "i = "+i;
			repaint();				//OR this.repaint();
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			i++;
		}
	}
}

class MyMouseListener extends MouseAdapter
{
	Myframe frame;
	
	public MyMouseListener()
	{
		
	}
	public MyMouseListener(Myframe ref)
	{
		frame = ref;
	}
	
	public void mouseClicked(MouseEvent e)				//@Overriden
	{
		frame.flag = false;
		//frame.stopThread();
	}
}

class Pro13_stop_thread_on_click
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
		
		frame.addMouseListener(new MyMouseListener(frame));
		
		frame.addWindowListener(new WindowCloser(frame));
		
		frame.startThread();
	}
}