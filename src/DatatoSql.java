package src;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DatatoSql extends JFrame {

	
	  private JPanel contentPane;
	  private static int ResChoose;
	  private static double tot;
	  private static int cus;
	  public static void setResChoose(int x)
	  {
		  ResChoose=x;
	  }
	  
	  public static void setcus(int x)
	  {
		  cus=x;
	  }
	  
	  public static void setTot(double x)
	  {
		  tot=x;
	  }
	
		   public static void insertOrder() {
			   System.out.println("I Reached here");
		        String sql = "INSERT INTO [Order] (CustomerID, RestaurantID, TotalCost) VALUES (?, ?, ?)";
		        
		        try (Connection conn = SQLServerConnection.getConnection();
		             PreparedStatement pstmt = conn.prepareStatement(sql)) {

		            pstmt.setInt(1, cus);
		            pstmt.setInt(2, ResChoose);
		            pstmt.setBigDecimal(3, new java.math.BigDecimal(tot));

		            int rowsInserted = pstmt.executeUpdate();
		            if (rowsInserted > 0) {
		                System.out.println("Order inserted successfully!");
		            }
		        } catch (SQLException e) {
		            System.out.println("Error inserting order: " + e.getMessage());
		            e.printStackTrace();
		        }
		    }
}
