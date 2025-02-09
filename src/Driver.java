package src;

import java.sql.*;

public class Driver extends Orders {
    /*
     * Driver instance variable declaration
     */
    private int driverID;
    private String fName, lName, phoneNum;
    private double salery;

    public void getData() {
        try {
            jTextArea2.setText("");
            Connection connection = SQLServerConnection.getConnection();
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM DRIVER;";
            ResultSet resultSet = statement.executeQuery(SQL);

            while (resultSet.next()) {
                driverID = resultSet.getInt("DriverID");
                fName = resultSet.getString("F_Name");
                lName = resultSet.getString("L_Name");
                phoneNum = resultSet.getString("Phone");
                salery = resultSet.getDouble("Salary");
                jTextArea2.append(driverID + "\t         " + fName + "\t\t" + lName + "\t" +
                        phoneNum + "\t\t " + salery + "\n");
            }
            SQLServerConnection.closeConnection();
        } catch (SQLException e) {
            ErrorDialog.showErrorDialog("Error in the database");
            System.err.println("Error " + e);
        }
    }

    public Driver() {

        jLabel1.setText("Driver ID");

        jLabel3.setText("First Name");

        jLabel4.setText("Last Name");

        jLabel5.setText("Phone Number");

        jLabel2.setText("Salery");

        jLabel6.setText(null);
    }
}
