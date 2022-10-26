/* Adding Panels :-

NOTE: setBounds(x,y,width,height);
*/

import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame
{
	Panel mainPanel;
	Panel subPanel,subPanel2,subPanel3,subPanel4,subPanel5,subPanel6,subPanel7,subPanel8;
	
	public Myframe()
	{
		setSize(600,600);
		setTitle("Myframe");
		setLocationRelativeTo(null);
		//setBackground(new Color(232, 199, 251));
		setBackground(Color.CYAN);
		setLayout(null);
		
		addComponent();
		
		setVisible(true);					//frame should be visible at last after adding components
		//Inner class for window closing
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
	}
	
	private void addComponent()
	{
		mainPanel = new Panel();
		mainPanel.setBackground(Color.red);
		mainPanel.setLayout(null);
		mainPanel.setBounds(30,50,540,500);
		add(mainPanel);				//will add mainPanel inside frame
		
		//adding subPanel inside mainPanel
		subPanel = new Panel();
		subPanel.setLayout(null);
		subPanel.setBackground(Color.yellow);
		subPanel.setBounds(30,30,480,440);
		mainPanel.add(subPanel);	//will add subPanel inside mainPanel
		
		subPanel2 = new Panel();
		subPanel2.setLayout(null);
		subPanel2.setBackground(Color.red);
		subPanel2.setBounds(30,30,420,380);
		subPanel.add(subPanel2);	//will add subPanel2 inside subPanel

		subPanel3 = new Panel();
		subPanel3.setLayout(null);
		subPanel3.setBackground(Color.yellow);
		subPanel3.setBounds(30,30,360,320);
		subPanel2.add(subPanel3);	//will add subPanel3 inside subPanel2

		subPanel4 = new Panel();
		subPanel4.setLayout(null);
		subPanel4.setBackground(Color.red);
		subPanel4.setBounds(30,30,300,260);
		subPanel3.add(subPanel4);	//will add subPanel4 inside subPanel3
	
		subPanel5 = new Panel();
		subPanel5.setLayout(null);
		subPanel5.setBackground(Color.yellow);
		subPanel5.setBounds(30,30,240,200);
		subPanel4.add(subPanel5);	//will add subPanel5 inside subPanel4
	
		subPanel6 = new Panel();
		subPanel6.setLayout(null);
		subPanel6.setBackground(Color.red);
		subPanel6.setBounds(30,30,180,140);
		subPanel5.add(subPanel6);	//will add subPanel6 inside subPanel5

		subPanel7 = new Panel();
		subPanel7.setLayout(null);
		subPanel7.setBackground(Color.yellow);
		subPanel7.setBounds(30,30,120,80);
		subPanel6.add(subPanel7);	//will add subPanel7 inside subPanel6
	
		subPanel8 = new Panel();
		subPanel8.setLayout(null);
		subPanel8.setBackground(Color.blue);
		subPanel8.setBounds(30,30,60,20);
		subPanel7.add(subPanel8);	//will add subPanel8 inside subPanel7
	}
}

class Pro15_adding_panel
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
	}
}