
import java.awt.*;
import java.awt.event.*;

class Myframe6 extends Frame implements Runnable
{
	Thread t;
	volatile boolean flag;
	String str;
	int x,y;
	
	public Myframe6()
	{
		str = "This is java String, running fast.";
		x = -150;
		y = 80;
		flag = true;
		t = new Thread(this);
		
		setSize(500,500);
		setTitle("Program6");
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawString(str, x, y);
	}
	public void startThread()
	{
		t.start();
	}
	public void stopThread()
	{
		flag = false;
	}
	public void run()
	{
		while(flag == true)
		{
			if(x == 500)
			{
				x = -150;
			}
			x = x + 1;
			repaint();
			try
			{
				Thread.sleep(15);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}


class Program6
{
	public static void main(String args[])
	{
		Myframe6 frame = new Myframe6();
		frame.startThread();
		
		frame.addWindowListener(new WindowCloser(frame));
	}
}
