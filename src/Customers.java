package src;

import java.sql.*;
public class Customers extends Orders{
    /*
     * instance variable declaration for Customers
     */
    private int customerID;
    private String fName, phoneNum, lName, address, email;

    @Override
    public void getData(){
        try{
            jTextArea2.setText("");
            Connection connection = SQLServerConnection.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM Customer;";
            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()){
                customerID = resultSet.getInt("CustomerID");
                phoneNum = resultSet.getString("Phone");
                fName = resultSet.getString("F_Name");
                lName = resultSet.getString("L_Name");
                address = resultSet.getString("Address");
                email = resultSet.getString("Email");
                jTextArea2.append(customerID +"\t               " + fName + "\t   " 
                + lName + "\t            " + address + "\t" + email + "      " + phoneNum + "\n");
            }
            SQLServerConnection.closeConnection();
        }
        catch(SQLException e){
            ErrorDialog.showErrorDialog("Error in the database");
            System.err.println("Error " + e);
        }
        
        
    }
    
    public Customers() {
        
        jLabel1.setText("Customer ID");

        jLabel3.setText("First Name");

        jLabel4.setText("Last Name");

        jLabel2.setText("Phone Number");

        jLabel5.setText("Address");

        jLabel6.setText("Email");
    }
}
