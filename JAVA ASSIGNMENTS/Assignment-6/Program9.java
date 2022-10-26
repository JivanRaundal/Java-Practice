// STOP WATCH :-

import java.awt.*;
import java.awt.event.*;

class Myframe9 extends Frame implements Runnable
{
	Thread t;
	String str;
	int hr,min,sec;
	
	public Myframe9()
	{
		t = new Thread(this);
		hr = min = sec = 0;
		str = "STOP WATCH :: " + hr + " : " + min + " : " + sec;
		
		setSize(500,500);
		setTitle("JIVAN'S STOPWATCH");
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void paint(Graphics g)		//@Overriden
	{
		g.setFont(new Font("times new roman", Font.BOLD, 30));
		g.drawString(str, 70, 80);
	}
	public void startThread()
	{
		t.start();
	}
	public void run()
	{
		while(true)
		{
			str = "STOP WATCH :: " + hr + " : " + min + " : " + sec;
			repaint();					//OR this.repaint();
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			sec++;
			min = min + sec/60;
			hr = hr + min/60;
			sec = sec%60;
			min = min%60;
		}
	}
}

class Program9
{
	public static void main(String args[])
	{
		Myframe9 frame = new Myframe9();
		frame.startThread();
		
		frame.addWindowListener(new WindowCloser(frame));
	}
}