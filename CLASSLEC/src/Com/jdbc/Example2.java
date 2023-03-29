package Com.jdbc;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example2 
{
	
	public static void main(String args[]) throws SQLException
	{
		Connection con=null;
		Statement stm=null;
		try
		{
			
		  Class.forName("com.mysql.jdbc.Driver");
		  System.out.println("Driver load succesfully");
		  try
		  {
		  con=DriverManager.getConnection("jdbc:mysql:///Advancejava","root","1234");
		  stm=con.createStatement();
		  
		  stm.executeUpdate("insert into emp values(111,'Dinesh',455156)");
		  stm.executeUpdate("insert into emp values(112,'Akshay',56545)");
		  stm.executeUpdate("insert into emp values(113,'Avinash',45155)"); 
		  stm.executeUpdate("insert into emp value(114,'sk',12345)");
		  System.out.println("Data enter is sucessfully");
		  }
		  catch(SQLException e)
		  {
			  System.out.println(e);
		  }
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		finally
		{
			if(stm!=null)stm.close();
			if(con!=null)con.close();
			
		}
		
			
		
	}
			

}
