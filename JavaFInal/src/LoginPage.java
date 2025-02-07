package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class LoginPage extends JFrame {

    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JPanel jPanel2;
    private JPasswordField jPasswordField1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JTextField jTextField2;

    public LoginPage() {
        initComponents();
    }
                     
    private void initComponents() {

        setTitle("Welcome!");
        jPanel2 = new JPanel();
        jButton2 = new JButton();
        jButton1 = new JButton();
        jPasswordField1 = new JPasswordField();
        jSeparator3 = new JSeparator();
        jLabel1 = new JLabel();
        jSeparator2 = new JSeparator();
        jTextField2 = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPasswordField1.setText("Password");

        jSeparator3.setOrientation(SwingConstants.VERTICAL);

        jLabel1.setFont(new Font("Colonna MT", 0, 80)); // NOI18N
        jLabel1.setText("A²H²");

        jSeparator2.setOrientation(SwingConstants.VERTICAL);

        jTextField2.setText("User Name");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPasswordField1))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(evt.getActionCommand() == "Register"){
            String username = jTextField2.getText().trim();
            String password = new String(jPasswordField1.getPassword()).trim();

            if (username.isEmpty() || password.isEmpty()){
                ErrorDialog.showErrorDialog("Fields can't be empty");
                return;
            }
            String[] usernameParts = username.split("\\s+");
            if (usernameParts.length != 2) {
                ErrorDialog.showErrorDialog("Username must contain exactly two words");
                return;
            }
            //take the first name and last name
            String fName = usernameParts[0];
            String lName = usernameParts[1];
            System.out.println(fName + " " +lName);

            try{
                Connection connection = SQLServerConnection.getConnection();
                PreparedStatement checkStmt = connection.prepareStatement("SELECT * FROM UserDetail WHERE UserName = ?");
                PreparedStatement insertStmt = connection.prepareStatement("INSERT INTO UserDetail (UserName, Password, UserType) VALUES (?, ?, 'C')");
                PreparedStatement insertCustomerStmt = connection.prepareStatement("INSERT INTO Customer (F_Name, L_Name, Phone, Gender, Address) VALUES (?, ?,'0000000000', 'M', 'Unspecified')");
                    
                checkStmt.setString(1, username);
                ResultSet rs = checkStmt.executeQuery();
                if (rs.next()){
                    ErrorDialog.showErrorDialog("Username already exists. Choose a different one.");
                    System.err.println("Didnt register");
                    return;
                }
                else{
                    insertStmt.setString(1, username);
                    insertStmt.setString(2, password);
                    int rowsInserted = insertStmt.executeUpdate();
                    
                    insertCustomerStmt.setString(1, fName);
                    insertCustomerStmt.setString(2, lName);
                    insertCustomerStmt.executeUpdate();
                    if (rowsInserted > 0){
                        ErrorDialog.showErrorDialog("Registration successful!");
                        System.out.println("Registered");
                    }
                    else{
                        ErrorDialog.showErrorDialog("Failed");
                    }
                }
            }
            catch(SQLException e){
                ErrorDialog.showErrorDialog("Error in the database");
                System.out.println("Error in the database" + e);
            }
        }
    }         
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt){
        if(evt.getActionCommand() == "Login"){
            try{
                String userName,  password, userType, sql;
                userName = jTextField2.getText();
                password = new String(jPasswordField1.getPassword());
                Connection connection = SQLServerConnection.getConnection();
                sql = "SELECT * FROM UserDetail WHERE UserName = ? AND Password = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, userName);
                preparedStatement.setString(2, password);
                ResultSet resultSet = preparedStatement.executeQuery();

                if(resultSet.next()){
                    dispose();
                    userType = resultSet.getString("UserType");
                    if(userType.equals("A")){
                        dispose();
                        new Orders().setVisible(true);
                    }
                    else if (userType.equals("C")){
                        //TODO add customer GUI here
                        sql = "SELECT CustomerID FROM Customer WHERE F_Name = ? AND L_Name = ?";
                        PreparedStatement customerStmt = connection.prepareStatement(sql);
                        String[] nameParts = userName.split("\\s+");
                        customerStmt.setString(1, nameParts[0]);
                        customerStmt.setString(2, nameParts[1]);
                        ResultSet customerResultSet = customerStmt.executeQuery();
    
                        if(customerResultSet.next()){
                            int customerID = customerResultSet.getInt("CustomerID");
                            System.out.println("Customer ID: " + customerID);
                            DatatoSql.setcus(customerID);
                        }
                        new RestaurantsChoose();
                    }
                    
                }
                else{
                    ErrorDialog.showErrorDialog("Invalid username or password. Please try again or register.");
                }
                resultSet.close();
                preparedStatement.close();
                SQLServerConnection.closeConnection();
            }
            catch(SQLException e){
                ErrorDialog.showErrorDialog("Error in the database");
                System.err.println("Error " + e);
            }
            
        }
    }
    public static void main(String[] args){
	    new LoginPage().setVisible(true);
	
    }
}
