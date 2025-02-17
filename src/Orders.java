package src;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Orders extends JFrame {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    protected JLabel jLabel1;
    protected JLabel jLabel2;
    protected JLabel jLabel3;
    protected JLabel jLabel4;
    protected JLabel jLabel5;
    protected JLabel jLabel6;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane2;
    protected JTextArea jTextArea2;
    private int orderID, customerID, restaurantID;
    private double totalCost;
    private String paymentStatus, status;

    public Orders() {
        initComponents();
    }

    public void initComponents() {

        jPanel2 = new JPanel();
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton2 = new JButton();
        jPanel3 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jScrollPane2 = new JScrollPane();
        jTextArea2 = new JTextArea();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 621, Short.MAX_VALUE));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(12, 18, 61));
        jPanel1.setForeground(new java.awt.Color(6, 9, 31));

        jButton1.setBackground(new java.awt.Color(2, 11, 79));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Orders");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(2, 11, 79));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Restaurants");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(2, 11, 79));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Drivers");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(12, 18, 61));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new ImageIcon(getClass().getResource("images\\icons8_Sign_Out_32px.png")));
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(2, 11, 79));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Customers");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton5))
                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE))
                                .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Order ID");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("");

        jTextArea2.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setBorder(null);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer ID");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Restaurant ID");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Cost");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("");

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel3)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel6)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel2)
                                .addGap(14, 14, 14))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2)
                                .addContainerGap()));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(91, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        if (evt.getActionCommand() == "Orders") {
            dispose();
            Orders order = new Orders();
            order.setVisible(true);
            order.setTitle("Orders list");
            order.getData();
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        if (evt.getActionCommand() == "Customers") {
            dispose();
            Customers customers = new Customers();
            customers.setVisible(true);
            customers.setTitle("Customers info");
            customers.getData();
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        if (evt.getActionCommand() == "Restaurants") {
            dispose();
            Restaurants restaurant = new Restaurants();
            restaurant.setVisible(true);
            restaurant.setTitle("Restaurant Info");
            restaurant.getData();
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

        if (evt.getActionCommand() == "Drivers") {
            dispose();
            Driver driver = new Driver();
            driver.setVisible(true);
            driver.setTitle("Driver info");
            driver.getData();
        }
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO Add action event here:
        dispose();
        new LoginPage().setVisible(true);
    }

    public void getData() {
        try {
            jTextArea2.setText("");
            Connection connection = SQLServerConnection.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM [Order];";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                orderID = resultSet.getInt("OrderID");
                customerID = resultSet.getInt("CustomerID");
                restaurantID = resultSet.getInt("RestaurantID");
                totalCost = resultSet.getDouble("TotalCost");
                // paymentStatus = resultSet.getString("PaymentStatus");
                // status = resultSet.getString("Status");
                jTextArea2.append(orderID + "\t         " + customerID + "\t\t" + restaurantID +
                        "\t              " + totalCost + "\t       " + "\n");
            }
            SQLServerConnection.closeConnection();
        } catch (SQLException e) {
            ErrorDialog.showErrorDialog("Error in the Database");
            System.err.println("Error " + e);
        }
    }

}
