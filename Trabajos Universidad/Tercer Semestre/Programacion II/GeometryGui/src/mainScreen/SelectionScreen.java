package mainScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class SelectionScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectionScreen frame = new SelectionScreen();
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
	public SelectionScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelectYourType = new JLabel("Select your type");
		lblSelectYourType.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSelectYourType.setBounds(159, 24, 127, 49);
		contentPane.add(lblSelectYourType);
		
		JButton btnSolids = new JButton("Solids");
		btnSolids.setBounds(47, 244, 97, 25);
		contentPane.add(btnSolids);
		
		JButton btnPlaneShapes = new JButton("Plane Shapes");
		btnPlaneShapes.setBounds(320, 244, 127, 25);
		contentPane.add(btnPlaneShapes);
	}

}
