import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Myframe1 extends Frame
{
	public Myframe1()
	{
		setSize(500,500);
		setTitle("Myframe1");
		setBackground(Color.cyan);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		//To close window
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
	}
	public void paint(Graphics g)
	{
		g.setFont(new Font("times new roman", Font.BOLD, 40));
		g.drawString("HELLO WORLD", 90, 100);
	}
}


public class Program1
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Myframe1 frame = new Myframe1();

	}

}
