package SwingApps;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Program2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Program2 window = new Program2();
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
	public Program2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		//mainPanel.setBackground(new Color(255, 235, 205));
		mainPanel.setBounds(0, 0, 450, 300);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel lblclose = new JLabel("");
		lblclose.setBounds(390, 0, 40, 40);
		lblclose.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(lblclose);
		
		//adding close image icon on close label
		BufferedImage img = null;
		try
		{
			img = ImageIO.read(new File("D:\\A_REGAL_CLASSES\\JAVA_CLASS\\eclipse\\GUIAPPS\\src\\Images\\close1.png"));
			Image newimg = img.getScaledInstance(lblclose.getWidth(), lblclose.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(newimg);
			lblclose.setIcon(icon);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		//adding MouseListener for close Label to close window when clicked on lblclose OR close icon
		lblclose.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				frame.dispose();
			}
		});
		
		//adding another image on Label
		JLabel lblimage = new JLabel("");
		lblimage.setBounds(71, 44, 279, 189);
		mainPanel.add(lblimage);
		
		//adding tiger icon on lblimage
		BufferedImage oldtigerimg = null;
		try
		{
			oldtigerimg = ImageIO.read(new File("D:\\A_REGAL_CLASSES\\JAVA_CLASS\\eclipse\\GUIAPPS\\src\\Images\\tiger.png"));
			Image newtigerimg = oldtigerimg.getScaledInstance(lblimage.getWidth(), lblimage.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon tigerIcon = new ImageIcon(newtigerimg);
			lblimage.setIcon(tigerIcon);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
