
import java.awt.*;
import java.awt.event.*;

class Myframe7 extends Frame implements Runnable
{
	Thread t;
	volatile boolean flag;
	int i;
	String str;
	
	public Myframe7()
	{
		i = 1;
		str = "Click anywhere in window to start counter";
		flag = false;
		//t = new Thread(this);
		
		setSize(600,600);
		setTitle("Program7");
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.setFont(new Font("times new roman", Font.BOLD, 25));
		g.setColor(Color.red);
		g.drawString(str,50,100);
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
		while(flag)
		{
			str = String.valueOf(i);
			this.repaint();
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

class MyMouseListener7 extends MouseAdapter
{
	Myframe7 frame;
	
	public MyMouseListener7()
	{
		
	}
	public MyMouseListener7(Myframe7 temp)
	{
		frame = temp;
	}
	public void mouseClicked(MouseEvent e)			//@Overriden
	{
		if(frame.flag == false)
		{
			frame.startThread();
		}
		else
		{
			//frame.flag = false;
			frame.stopThread();
		}
	}
}

class Program7
{
	public static void main(String args[])
	{
		Myframe7 frame = new Myframe7();
		
		frame.addMouseListener(new MyMouseListener7(frame));
		frame.addWindowListener(new WindowCloser(frame));
	}
}