package userLogIn;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import mainScreen.*;
public class UserLogIn extends JFrame {

	private JPanel contentPane;
	private JTextField UserNameTxt;
	private JTextField PasswordTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogIn frame = new UserLogIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserLogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Geometry Project");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTitle.setBounds(141, 54, 145, 39);
		contentPane.add(lblTitle);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{				
				SelectionScreen newScreen=new SelectionScreen();
				newScreen.setVisible(true);
				newScreen.show();
				dispose();
			}
		});
		btnLogIn.setBounds(149, 219, 117, 39);
		contentPane.add(btnLogIn);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(70, 120, 76, 32);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(70, 165, 67, 25);
		contentPane.add(lblPassword);
		
		UserNameTxt = new JTextField();
		UserNameTxt.setBounds(150, 125, 116, 22);
		contentPane.add(UserNameTxt);
		UserNameTxt.setColumns(10);
		
		PasswordTxt = new JTextField();
		PasswordTxt.setBounds(150, 166, 116, 22);
		contentPane.add(PasswordTxt);
		PasswordTxt.setColumns(10);
	}
}
