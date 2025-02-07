package src;

import java.sql.*;
public class Restaurants extends Orders{
    /*
     * instance variable declaration for Restaurants
     */

    private int restaurantID;
    private String name, address, phoneNum;

    public void getData(){
        try{
            jTextArea2.setText("");
            Connection connection = SQLServerConnection.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM Restaurant";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                restaurantID = resultSet.getInt("RestaurantID");
                name = resultSet.getString("Name");
                address = resultSet.getString("Location");
                phoneNum = resultSet.getString("Phone"); 
                jTextArea2.append(restaurantID + "\t               " + name + "\t" + address + "\t        " + phoneNum + "\n");
            }
            SQLServerConnection.closeConnection();
        }
        catch(SQLException e){
            ErrorDialog.showErrorDialog("Error in the Database");
            System.err.println("Error " +e);
        }
    }

    public Restaurants() {
        
        jLabel1.setText("Restaurant ID");
        jLabel2.setText(null);
        jLabel3.setText("Name");
        jLabel4.setText("Address");
        jLabel5.setText("Phone Number");
        jLabel6.setText(null);
    }
}
