package pjc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;

public class fra extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fra frame = new fra();
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
	public fra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(6, 171, 134, 55);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(86, 50, 244, 88);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(17, 28, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(218, 188, 6, 20);
		contentPane.add(passwordField);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(218, 50, 29, 20);
		contentPane.add(spinner);
	}
}
