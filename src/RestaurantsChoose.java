package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

public class RestaurantsChoose extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public RestaurantsChoose() {

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 50, 800, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Resturants");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 43));
		panel.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		String[] img= {"images\\Screenshot 2025-01-26 120639.png","images\\Screenshot 2025-01-26 120639.png","images\\Screenshot 2025-01-26 120639.png","images\\Screenshot 2025-01-26 120639.png"};
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		JButton[] btnNewButton=new JButton[10];
		for(int i=0;i<4;i++)
		{
		btnNewButton[i] = new JButton("");
		btnNewButton[i].setBackground(Color.BLACK);
		btnNewButton[i].setIcon(new ImageIcon(RestaurantsChoose.class.getResource(img[i])));
		panel_1.add(btnNewButton[i]);
		}
		btnNewButton[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 new  Menu();
			}
		});
		btnNewButton[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 new  Menu2();
			}
		});
		
		btnNewButton[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new  Menu3();
			}
		});
		btnNewButton[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new  Menu4();
			}
		});
		setVisible(true);
	
	}
	
}
