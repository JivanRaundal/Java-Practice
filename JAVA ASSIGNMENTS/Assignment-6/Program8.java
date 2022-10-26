
import java.awt.*;
import java.awt.event.*;

class Myframe8 extends Frame implements Runnable
{
	Thread t;
	volatile boolean flag;
	int msec;
	String str;
	
	public Myframe8()
	{
		str = "";
		msec = 5000;
		flag = true;
		//t = new Thread(this);
		
		setSize(600,600);
		setTitle("Program8");
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.setFont(new Font("times new roman", Font.BOLD, 25));
		g.setColor(Color.red);
		g.drawString(str,300,300);
	}
	public void startThread()
	{
		flag = true;
		t = new Thread(this);
		t.start();
	}
	public void stopThread()
	{
		flag = false;
	}
	public void run()
	{
		int i=1;
		while(flag)
		{
			str = String.valueOf(i);
			this.repaint();
			try
			{
				Thread.sleep(msec);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			i++;
		}
	}
}

class MyMouseListener8 extends MouseAdapter
{
	Myframe8 frame;
	
	public MyMouseListener8()
	{
		
	}
	public MyMouseListener8(Myframe8 temp)
	{
		frame = temp;
	}
	public void mouseClicked(MouseEvent e)			//@Overriden
	{
		try
		{
			frame.msec = frame.msec - 500;
		}
		catch(IllegalArgumentException exc)
		{
			exc.printStackTrace();
		}
	}
}

class Program8
{
	public static void main(String args[])
	{
		Myframe8 frame = new Myframe8();
		frame.startThread();
		
		frame.addMouseListener(new MyMouseListener8(frame));
		frame.addWindowListener(new WindowCloser(frame));
	}
}