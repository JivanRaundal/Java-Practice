package SwingApps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFirstApp {

	private JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtMiddleName;
	private JTextField txtLastName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstApp window = new MyFirstApp();
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
	public MyFirstApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 669, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(0, 255, 255));
		mainPanel.setBounds(10, 11, 635, 362);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel lblFirstName = new JLabel("FirstName");
		lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblFirstName.setBounds(10, 35, 200, 40);
		mainPanel.add(lblFirstName);
		
		JLabel lblMiddleName = new JLabel("MiddleName");
		lblMiddleName.setHorizontalAlignment(SwingConstants.CENTER);
		lblMiddleName.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblMiddleName.setBounds(215, 35, 200, 40);
		mainPanel.add(lblMiddleName);
		
		JLabel lblLastName = new JLabel("LastName");
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblLastName.setBounds(420, 35, 200, 40);
		mainPanel.add(lblLastName);
		
		txtFirstName = new JTextField();
		txtFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirstName.setFont(new Font("Times New Roman", Font.BOLD, 25));
		txtFirstName.setToolTipText("Enter First Name");
		txtFirstName.setBackground(new Color(30, 144, 255));
		txtFirstName.setBounds(10, 76, 200, 40);
		txtFirstName.setColumns(10);
		mainPanel.add(txtFirstName);
		
		txtMiddleName = new JTextField();
		txtMiddleName.setToolTipText("Enter Middle Name");
		txtMiddleName.setHorizontalAlignment(SwingConstants.CENTER);
		txtMiddleName.setFont(new Font("Times New Roman", Font.BOLD, 25));
		txtMiddleName.setColumns(10);
		txtMiddleName.setBackground(new Color(30, 144, 255));
		txtMiddleName.setBounds(215, 76, 200, 40);
		mainPanel.add(txtMiddleName);
		
		txtLastName = new JTextField();
		txtLastName.setToolTipText("Enter Last Name");
		txtLastName.setHorizontalAlignment(SwingConstants.CENTER);
		txtLastName.setFont(new Font("Times New Roman", Font.BOLD, 25));
		txtLastName.setColumns(10);
		txtLastName.setBackground(new Color(30, 144, 255));
		txtLastName.setBounds(420, 76, 200, 40);
		mainPanel.add(txtLastName);
		
		JButton btnsubmit = new JButton("SUMBIT");
		btnsubmit.setForeground(new Color(255, 215, 0));
		btnsubmit.setBackground(new Color(255, 0, 0));
		btnsubmit.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnsubmit.setBounds(215, 237, 200, 40);
		btnsubmit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainPanel.add(btnsubmit);
	}
}
