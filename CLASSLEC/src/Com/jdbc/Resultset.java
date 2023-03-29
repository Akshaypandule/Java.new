package Com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Resultset 
{
	public static void main(String args[]) throws SQLException
	{
		Connection connection=DriverManager.getConnection("jdbc:mysql:///advancejava","root","1234");
		
		System.out.println("Connection operation successfully");
		
		//  Sensitive the modification.
		// Insensitive mens not sensitive to modification.
		// ResultSet is default forword only and read only.......
		Statement stm=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		ResultSet set=stm.executeQuery("select*from Employee");
	    set.afterLast();
	
		while(set.previous())
		{
			System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getDouble(3));
		}
		set.first();
		
		System.out.println(set.getInt(1));
		
		set.last();
		System.out.println(set.getInt(1));
		
		set.absolute(2);  //which record you need just give number
		
		System.out.println(set.getString(2));
		set.close();
		stm.close();
		connection.close();
		
		System.out.println("REsource done succesfully");
	}

}
