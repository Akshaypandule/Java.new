package Com.jdbc;
import java.sql.*;
public class createtable
{
	public static void main(String args[]) 
	{
		Connection con = null;
		Statement stm=null;
		try
		{
		con=DriverManager.getConnection("jdbc:mysql:///advancejava","root","1234");
		String query="Create table Employee(id int,name varchar(20),salary float)";
		
		 stm=con.createStatement();
		stm.execute(query);
		
		}
		
		catch(SQLException e)
		{
			System.out.println(e);
		}
		try
		{
		con.close();
		stm.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		
		
	}

}
