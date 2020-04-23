import java.sql.*;
import java.util.*;


public class JDBC {
   // JDBC driver name and database URL
   //static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
  
   
  

   public static void main(String[] args) {
	   
	   
	  // Connection con = null;


	   //con = databaseConnect.getConnection();
	   
	   
	   try{
		   Class.forName("com.mysql.jdbc.Driver");

		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/NSMS?serverTimezone=UTC","root","name");
		   //here sonoo is the database name, root is the username and root is the password
		   Statement stmt=con.createStatement();
		   if (con != null) {
               System.out.println("Connected to the database");
           }
		   ResultSet rs=stmt.executeQuery("select * from Location");

		   while(rs.next())
		   System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  ");

		   con.close();

		   }catch(Exception e){ System.out.println(e);}
	   
		   }
   
 }

