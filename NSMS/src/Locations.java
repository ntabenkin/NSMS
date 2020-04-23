
import java.sql.*;
import java.util.*;

//this is the location constructor class 
public class Locations {
	
	
	int _locationCode; 
	String _locationName;
	
	
	Locations(int id, String name)
	{
		_locationCode = id; 
		_locationName = name; 
		
	}
	
	public int getLocCode(){
		
		return _locationCode;
		
	}
	
	public String getLocName(){
		
		return _locationName;
	}
	public void setLocCode(int id) 
	{
		_locationCode = id;
		
	}
	public void setLocName(String name) 
	{
		_locationName = name;
		
	}
	
	
	public String toString() { 
		
		return "Location Code:" + _locationCode + " " + "Name " + _locationName;
	}
	
	
	public static void addLocation()
	{
		try{
			   Class.forName("com.mysql.jdbc.Driver");

			   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bicycle_shop?serverTimezone=UTC","root","name");
			   
			   
			   Statement stmt=con.createStatement();

			   ResultSet rs=stmt.executeQuery("select * from categories");
			   
			   String query = " insert into Locations (locationCode, locationName)"
				        + " values (?, ?)";
			   
			   PreparedStatement preparedStmt = con.prepareStatement(query);
			   preparedStmt.setString (1, "");
			   preparedStmt.setString (2, "");

			   while(rs.next())
			   System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  ");

			   con.close();

			   }catch(Exception e){ System.out.println(e);
			   
			   } 
     }
}

	
	
	
	

