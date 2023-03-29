
package Com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class Base
{
	public static void main(String args[])
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			try 
			{
				Connection con=DriverManager.getConnection("jdbc:mysql:///Advancejava","root","1234");
				
				System.out.println("Connection is done");
				
				String query="create table emp1(id int,name varchar(20),mobile int)";
				Statement st=con.createStatement();
				st.execute(query);
				System.out.println("Table is done");
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
