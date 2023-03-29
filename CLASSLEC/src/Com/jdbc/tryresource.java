package Com.jdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;

public class tryresource
{

	
	public static void main(String[] args) 
	{
		try(Connection connection=DriverManager.getConnection("jdbc:mysql:///advancejava","root","1234");
				Statement statement=connection.createStatement();)
		
		{
			ResultSet set= statement.executeQuery("Select*from emp");
			while(set.next())
			{
				System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getInt(3));
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
}
