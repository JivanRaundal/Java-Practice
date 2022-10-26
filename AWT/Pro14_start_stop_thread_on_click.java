// Start and Stop thread on mouse click :-

import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame implements Runnable
{
	Thread t;
	volatile boolean flag;
	String str;
	int x,y;
	
	public Myframe()
	{
		str = "Click to start Thread";
		x = 50;
		y = 70;
		flag = false;
		t = new Thread(this);
		
		setSize(500,500);
		setTitle("MyThreadFrame");
		setLocationRelativeTo(null);
		setBackground(Color.CYAN);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.setFont(new Font("verdena", Font.BOLD, 20));
		g.drawString(str, x, y);
	}
	public void startThread()
	{
		//flag = true;
		//t = new Thread(this);			//we can also create new thread in startThread() method
		t.start();
	}
	public void stopThread()
	{
		flag = false;
	}
	public void run()
	{
		int i = 1;
		while(flag)
		{
			str = "i = "+i;
			repaint();					// OR this.repaint()
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
	
	public MyMouseListener(Myframe ref)
	{
		frame = ref;
	}
	
	public  void mouseClicked(MouseEvent e)
	{
		if(frame.flag == false)			//If we clicked one more time, it should not try to restart thread. BCZ restarting same thread gives exception
		{
			frame.flag = true;
			frame.startThread();
		}
		else
		{
			frame.flag = false;						//stop thread
			frame.t = new Thread(frame);			//create a new thread and start it so that u will get feel of restarting threads
		}
	}
}

class Pro14_start_stop_thread_on_click
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
		
		frame.addMouseListener(new MyMouseListener(frame));
		frame.addWindowListener(new WindowCloser(frame));
	}
}