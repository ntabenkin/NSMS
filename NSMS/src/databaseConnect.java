import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseConnect
{
	public static void main(String[] args) {
			   
	try{
		   Class.forName("com.mysql.jdbc.Driver");

		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/NSMS?serverTimezone=UTC","root","name");
		   //here sonoo is the database name, root is the username and root is the password
		   Statement stmt=con.createStatement();
		   
		   if (con != null) {
            System.out.println("Connected to the database");
        }
	}catch (ClassNotFoundException ex) {
        System.out.println("Could not find database driver class");
        ex.printStackTrace();
    } catch (SQLException ex) {
        System.out.println("An error occurred. Maybe user/password is invalid");
        ex.printStackTrace();
    } 

}

	public Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}

	public void close() {
		
		// TODO Auto-generated method stub
		
	}
}






		  




