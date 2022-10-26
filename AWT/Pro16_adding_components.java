/* Adding Components :-
	1) Panel 
	2) Label
	3) Button
	4) TextField
	5) TextArea
	
NOTE: setBounds(x,y,height,width);
-Do not add components directly on frame, take help of Panel always.
-Always add containers(Frame & Panel) after adding all components.
*/

import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame
{
	Panel mainPanel;
	Label lbltitle;
	Button btnclick;
	TextField txtname;
	TextArea txtaddress;
	
	public Myframe()
	{
		setSize(600,600);
		setTitle("Myframe");
		setLocationRelativeTo(null);
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
		Font f = new Font("times new roman", Font.BOLD, 20);
		
		//adding Panel
		mainPanel = new Panel();
		mainPanel.setBackground(new Color(232, 199, 251));
		mainPanel.setLayout(null);
		mainPanel.setBounds(0,0,this.getWidth(),this.getHeight());		//getWidth() & getHeight() will return width & height of frame
		
		//adding Label
		lbltitle = new Label("JIVAN");
		lbltitle.setBounds(20,50,560,70);
		lbltitle.setFont(new Font("times new roman", Font.BOLD, 50));
		lbltitle.setBackground(Color.black);
		lbltitle.setForeground(Color.white);
		lbltitle.setAlignment(Label.CENTER);		//will allign label at center
		mainPanel.add(lbltitle);		//will add Label(lbltitle) inside mainPanel
		
		//adding Button
		btnclick = new Button("CLICK");
		btnclick.setBounds(30,150,100,40);
		btnclick.setFont(f);
		btnclick.setBackground(Color.red);
		btnclick.setForeground(Color.yellow);
		btnclick.setCursor(new Cursor(Cursor.HAND_CURSOR));		//will show Hand Cursor when we go on button
		mainPanel.add(btnclick);		//will add Button(btnclick) inside mainPanel
		
		//adding TextField
		txtname = new TextField();
		txtname.setBounds(30,240,200,30);
		txtname.setFont(f);
		txtname.setBackground(Color.yellow);
		txtname.setForeground(Color.black);
		txtname.setEchoChar('*');			//for passwords security
		mainPanel.add(txtname);			//will add TextFeild(txtname) inside mainPanel
		
		//adding TextArea
		txtaddress = new TextArea();
		txtaddress.setBounds(30,300,250,100);
		txtaddress.setBackground(Color.cyan);
		//txtaddress.setFont(f);
		mainPanel.add(txtaddress);		//will add TextArea(txtaddress) inside mainPanel
		
		add(mainPanel);				//will add mainPanel inside frame (NOTE: Always add containers (frame & Panel at last))
	}
}

class Pro16_adding_components
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
	}
}