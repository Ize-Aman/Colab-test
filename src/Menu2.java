package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollPane;

public class Menu2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTaxValue;
	private JLabel lblSubtotalvalue;
	private JLabel lblTotalvalue;
	private double Tax=(0.15);
	private double ans=0.0;
	private int i;
	JCheckBox[] chckbxPurchase = new JCheckBox[10];
	JComboBox[] comboBox = new JComboBox[10];
	public void setTax(double Tax)
	{
		this.Tax=Tax;
	}

	public Menu2() {
		setTitle("menu2");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Integer[] num= {0,1,2,3,4,5,6,7,8,9};
        int[] Pri= {5,4,4,7,6,3,8,2,4,8};
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel2 = new JPanel();
		panel.add(panel2);
		panel2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("The  Costs");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel2.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel3 = new JPanel();
		panel2.add(panel3, BorderLayout.CENTER);
		GridBagLayout gbl_panel3 = new GridBagLayout();
		gbl_panel3.columnWidths = new int[]{0, 89, 89, 0};
		gbl_panel3.rowHeights = new int[]{91, 91, 91, 0};
		gbl_panel3.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel3.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel3.setLayout(gbl_panel3);
		
		JLabel lblTax_1 = new JLabel("Tax:");
		GridBagConstraints gbc_lblTax_1 = new GridBagConstraints();
		gbc_lblTax_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTax_1.anchor = GridBagConstraints.EAST;
		gbc_lblTax_1.gridx = 1;
		gbc_lblTax_1.gridy = 0;
		panel3.add(lblTax_1, gbc_lblTax_1);
		
		lblTaxValue = new JLabel("$"+Tax);
		lblTaxValue.setBackground(new Color(255, 255, 255));
		lblTaxValue.setForeground(new Color(128, 255, 128));
		GridBagConstraints gbc_lblTaxValue = new GridBagConstraints();
		gbc_lblTaxValue.insets = new Insets(0, 0, 5, 0);
		gbc_lblTaxValue.gridx = 2;
		gbc_lblTaxValue.gridy = 0;
		panel3.add(lblTaxValue, gbc_lblTaxValue);
		
		JLabel lblSubTotal = new JLabel("Sub Total:");
		GridBagConstraints gbc_lblSubTotal = new GridBagConstraints();
		gbc_lblSubTotal.anchor = GridBagConstraints.EAST;
		gbc_lblSubTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblSubTotal.gridx = 1;
		gbc_lblSubTotal.gridy = 1;
		panel3.add(lblSubTotal, gbc_lblSubTotal);
		
		lblSubtotalvalue = new JLabel("$0.0");
		lblSubtotalvalue.setForeground(new Color(128, 255, 128));
		GridBagConstraints gbc_lblSubtotalvalue = new GridBagConstraints();
		gbc_lblSubtotalvalue.insets = new Insets(0, 0, 5, 0);
		gbc_lblSubtotalvalue.gridx = 2;
		gbc_lblSubtotalvalue.gridy = 1;
		panel3.add(lblSubtotalvalue, gbc_lblSubtotalvalue);
		
		JLabel lblTotal_1 = new JLabel("Total:");
		GridBagConstraints gbc_lblTotal_1 = new GridBagConstraints();
		gbc_lblTotal_1.anchor = GridBagConstraints.EAST;
		gbc_lblTotal_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblTotal_1.gridx = 1;
		gbc_lblTotal_1.gridy = 2;
		panel3.add(lblTotal_1, gbc_lblTotal_1);
		
		lblTotalvalue= new JLabel("$0.0");
		lblTotalvalue.setForeground(new Color(128, 255, 128));
		GridBagConstraints gbc_lblTotalvalue = new GridBagConstraints();
		gbc_lblTotalvalue.gridx = 2;
		gbc_lblTotalvalue.gridy = 2;
		panel3.add(lblTotalvalue, gbc_lblTotalvalue);
		
		JPanel panel4 = new JPanel();
		contentPane.add(panel4, BorderLayout.SOUTH);
		
		JButton btnTot = new JButton("Total");
		panel4.add(btnTot);
		
		JButton btnReset = new JButton("Reset");
		panel4.add(btnReset);
		
		JButton btnConfirm = new JButton("Confirm");
		panel4.add(btnConfirm);
		
		JPanel panel5 = new JPanel();
		contentPane.add(panel5, BorderLayout.CENTER);
		panel5.setLayout(new BorderLayout(0, 0));
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		panel5.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		scrollPane.setViewportView(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		String[] img= {"images\\images (2).jpg","images\\images (1).jpg","images\\images (2).jpg","images\\images (2).jpg","images\\images (1).jpg","images\\images (1).jpg"};
		String[] Name= {"Burger","Pizza","Burger","Burger","Pizza","Pizza"};
		JPanel[] panel1=new JPanel[50];
		//start from here
		JPanel[] panel_=new JPanel[50];
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_lblNewLabel_2_1;
		JLabel lblNewLabel_2_1 = new JLabel("");
		JLabel lblFoodName_1_1_1 = new JLabel(Name[0]);
		GridBagConstraints gbc_lblFoodName_1_1_1 = new GridBagConstraints();
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		JPanel panel_8 = new JPanel();
		JLabel lblPrice_1_2 = new JLabel("Price:");
		JLabel lblmoney_1_2 = new JLabel(""+Pri[0]);
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		JLabel lblNewLabel_1_1_1 = new JLabel("Purchase:");
		JPanel panel_9 = new JPanel();
		JPanel panel_10 = new JPanel();
		for(i=0;i<6;i++)
		{
			
		panel_[0] = new JPanel();
		panel_4.add(panel_[0]);
		panel_[0].setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_5 = new JPanel();
		panel_[0].add(panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_5.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(Menu2.class.getResource(img[i])));
		gbc_lblNewLabel_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2_1.gridx = 0;
		gbc_lblNewLabel_2_1.gridy = 0;
		panel_5.add(lblNewLabel_2_1, gbc_lblNewLabel_2_1);
		
		lblFoodName_1_1_1 = new JLabel(Name[i]);
		lblFoodName_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		 gbc_lblFoodName_1_1_1 = new GridBagConstraints();
		gbc_lblFoodName_1_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblFoodName_1_1_1.gridx = 0;
		gbc_lblFoodName_1_1_1.gridy = 1;
		panel_5.add(lblFoodName_1_1_1, gbc_lblFoodName_1_1_1);
		
		panel_8 = new JPanel();
		gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.insets = new Insets(0, 0, 5, 0);
		gbc_panel_8.gridx = 0;
		gbc_panel_8.gridy = 2;
		panel_5.add(panel_8, gbc_panel_8);
		
		lblPrice_1_2 = new JLabel("Price:");
		lblPrice_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8.add(lblPrice_1_2);
		
		lblmoney_1_2 = new JLabel(""+Pri[i]);
		lblmoney_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8.add(lblmoney_1_2);
		
		panel_9 = new JPanel();
		gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.insets = new Insets(0, 0, 5, 0);
		gbc_panel_9.gridx = 0;
		gbc_panel_9.gridy = 3;
		panel_5.add(panel_9, gbc_panel_9);
		
		JLabel lblQuantity_1_1 = new JLabel("Quantity:");
		panel_9.add(lblQuantity_1_1);
		
		comboBox[i] = new JComboBox(num);
		comboBox[i].setMaximumRowCount(1);
		panel_9.add(comboBox[i]);
		
		panel_10 = new JPanel();
	    gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.insets = new Insets(0, 0, 5, 0);
		gbc_panel_10.gridx = 0;
		gbc_panel_10.gridy = 4;
		panel_5.add(panel_10, gbc_panel_10);
		
		lblNewLabel_1_1_1 = new JLabel("Purchase:");
		panel_10.add(lblNewLabel_1_1_1);
		
		chckbxPurchase[i] = new JCheckBox("");
		panel_10.add(chckbxPurchase[i]);
		}
			
		
		
		btnTot.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(corr())
			{
				ans=0.0;
				for(int Q=0;Q<i;Q++)
				{
					ans=ans+comboBox[Q].getSelectedIndex()*Pri[Q];
					System.out.println("hi");
				}
				
			  lblTaxValue.setText("$"+Tax);
	         lblSubtotalvalue.setText("$"+ans);
	         lblTotalvalue.setText(""+(ans+(ans*Tax)));	
	         ans=0.0;
		}
		}
	});
		
		
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//comboBox[i].setSelectedIndex(0);
				//chckbxPurchase[i].setSelected(false);
				for(int j=0;j<i;j++)
				{
			             comboBox[j].setSelectedIndex(0);
						chckbxPurchase[j].setSelected(false);
			
				}
				lblSubtotalvalue.setText("$0.0");
		         lblTotalvalue.setText("$0.0");
			}
		});
		
		btnConfirm.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	if(lblSubtotalvalue.getText()!="$0.0" && lblTotalvalue.getText()!="$0.0")
	            	{ JOptionPane.showMessageDialog(null, "Successful!", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
	                DatatoSql.setResChoose(2);
	                DatatoSql.setTot(ans);
	                System.out.println("I Reached here");
	                DatatoSql.insertOrder();
	                dispose(); // Close the window
	                
	            }}
	        });
		setVisible(true);
		
	}
	public Boolean corr()
	{
		for(int j=0;i<j;j++)
		{
		if(comboBox[j].getSelectedIndex()==0 && chckbxPurchase[j].isSelected())
			return false;
		}
		return true;
	}
	public int idx()
	{
		return i;
	}
		
}