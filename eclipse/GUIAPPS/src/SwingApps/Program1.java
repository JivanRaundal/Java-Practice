package SwingApps;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class Program1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Program1 window = new Program1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Program1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 478, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(10, 11, 444, 332);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel lblimage = new JLabel("");
		lblimage.setToolTipText("dice image");
		lblimage.setHorizontalAlignment(SwingConstants.CENTER);
		lblimage.setBounds(34, 57, 343, 217);
		mainPanel.add(lblimage);
		
		//Code for adding Image as an Icon to Label
		BufferedImage img = null;
		try
		{
			img = ImageIO.read(new File("D:\\A_REGAL_CLASSES\\JAVA_CLASS\\eclipse\\GUIAPPS\\src\\Images\\dice.png"));
			//This read image could be of any size, we have to Scaled it according to label size. For that we have following method
			
			//Image newimg = img.getScaledInstance(width, height, hints);
			Image newimg = img.getScaledInstance(lblimage.getWidth(), lblimage.getHeight(), Image.SCALE_SMOOTH);
			//Note: This method will create a new image of your original image with changed dimensions
			
			//'newimg' contains reference to new scaled image. Now we will create an image icon from newimg 
			ImageIcon icon = new ImageIcon(newimg);
			
			//Now, set this icon on Label
			lblimage.setIcon(icon);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
