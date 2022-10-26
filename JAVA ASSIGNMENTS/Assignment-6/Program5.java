
import java.awt.*;
import java.awt.event.*;

class Myframe5 extends Frame implements Runnable
{
	Thread t;
	volatile boolean flag;
	String str;
	
	public Myframe5()
	{
		str = "";
		flag = true;
		t = new Thread(this);
		
		setSize(500,500);
		setTitle("Program5");
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.setFont(new Font("verdena", Font.BOLD, 35));
		g.setColor(Color.red);
		g.drawString(str, 250, 200);
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
		int i=1;
		while(flag == true)
		{
			str = String.valueOf(i);
			repaint();			//this.repaint()
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			i++;
		}
	}
}


class Program5
{
	public static void main(String args[])
	{
		Myframe5 frame = new Myframe5();
		frame.startThread();
		
		frame.addWindowListener(new WindowCloser(frame));
	}
}
