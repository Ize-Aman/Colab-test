package src;

import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DemoJframe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textAge;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public DemoJframe() {
		setTitle("first project");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Result = new JLabel("");

		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(51, 23, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(51, 64, 19, -6);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setBounds(51, 64, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textName = new JTextField();
		textName.setBounds(123, 20, 86, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textAge = new JTextField();
		textAge.setBounds(123, 61, 86, 20);
		contentPane.add(textAge);
		textAge.setColumns(10);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String n=textName.getText();
				int age=Integer.parseInt(textAge.getText());
				if(age<18)
					Result.setText("you are Not eligable");
				else
					Result.setText("you are not eligabel");
					
					
			}
		});
		btnOK.setBounds(86, 183, 89, 23);
		contentPane.add(btnOK);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(237, 183, 89, 23);
		contentPane.add(btnReset);
		
		Result.setBounds(86, 236, 266, 14);
		contentPane.add(Result);
		setVisible(true);
	}
}
