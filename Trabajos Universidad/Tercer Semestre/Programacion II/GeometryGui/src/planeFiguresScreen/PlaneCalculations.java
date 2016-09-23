package planeFiguresScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class PlaneCalculations extends JFrame {

	private JPanel contentPane;
	private JTextField PerimeterTxt;
	private JTextField SurfaceTxt;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel Messure1;
	private JLabel Messure2;
	private JLabel Messure3;
	private JLabel Messure4;

	public void Labeler(String Label1,String Label2, String Label3,String Label4)
	{
		Messure1.setText(Label1);
		Messure2.setText(Label1);
		Messure3.setText(Label1);
		Messure4.setText(Label1);
	}	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlaneCalculations frame = new PlaneCalculations();
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
	public PlaneCalculations() {		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox FigureSelector = new JComboBox();
		FigureSelector.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				switch ((String)FigureSelector.getSelectedItem()) {
				case "Circle":
					
					break;
				case "Oval":
					
					break;
				case "Parallelogram":
					
					break;
				case "Rectangle":
					
					break;
				case "Rhombus":
					
					break;
				case "Trapezoid":
					
					break;
				case "Square":					
					

				default:
					break;
				}
			}
		});
		FigureSelector.setBounds(305, 73, 109, 22);
		contentPane.add(FigureSelector);
		
		JComboBox FigureType = new JComboBox(ConstantCollections.FIGURES);
		FigureType.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				switch ((String)FigureType.getSelectedItem()) {
				case "Circumferences":
					FigureSelector.setModel(new DefaultComboBoxModel(ConstantCollections.CIRCUMFERENCES));
					break;
				case"Quadrilaterals":
					FigureSelector.setModel(new DefaultComboBoxModel(ConstantCollections.QUADRILATERALS));
					break;
				case "Triangles":
					FigureSelector.setModel(new DefaultComboBoxModel(ConstantCollections.TRIANGLES));
					break;
				default:
					break;
				}
			}
		});

		FigureType.setBounds(37, 73, 121, 22);		
		contentPane.add(FigureType);
		
		
		
		JLabel lblPerimeter = new JLabel("Perimeter");
		lblPerimeter.setBounds(303, 152, 56, 16);
		contentPane.add(lblPerimeter);
		
		JLabel lblSurfaceArea = new JLabel("Surface Area");
		lblSurfaceArea.setBounds(297, 200, 85, 22);
		contentPane.add(lblSurfaceArea);
		
		PerimeterTxt = new JTextField();
		PerimeterTxt.setBounds(408, 149, 116, 22);
		contentPane.add(PerimeterTxt);
		PerimeterTxt.setColumns(10);
		
		SurfaceTxt = new JTextField();
		SurfaceTxt.setColumns(10);
		SurfaceTxt.setBounds(408, 200, 116, 22);
		contentPane.add(SurfaceTxt);
		
		Messure1 = new JLabel("");
		Messure1.setBounds(12, 149, 66, 22);
		contentPane.add(Messure1);
		
		textField = new JTextField();
		textField.setBounds(100, 149, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100, 184, 116, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 219, 116, 22);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(100, 254, 116, 22);
		contentPane.add(textField_3);
		
		Messure2 = new JLabel("");
		Messure2.setBounds(12, 187, 66, 22);
		contentPane.add(Messure2);
		
		Messure3 = new JLabel("");
		Messure3.setBounds(12, 222, 66, 22);
		contentPane.add(Messure3);
		
		Messure4 = new JLabel("");
		Messure4.setBounds(12, 257, 66, 22);
		contentPane.add(Messure4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"mm", "cm", "dm", "m", "Dm", "Hm", "Km"}));
		comboBox_1.setBounds(227, 149, 49, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"mm", "cm", "dm", "m", "Dm", "Hm", "Km"}));
		comboBox_2.setBounds(547, 149, 44, 22);
		contentPane.add(comboBox_2);		
	}
}
