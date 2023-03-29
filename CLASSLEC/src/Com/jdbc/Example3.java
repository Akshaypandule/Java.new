package Com.jdbc;
import java.sql.*;
public class Example3 {

	public static void main(String[] args)
	{
		Connection con=null;
		Statement stm=null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class load succesfully");
			try
			{
			    con=DriverManager.getConnection("jdbc:mysql:///Advancejava","root","1234");
				String query="Create table stud(id int,name varchar(60),marks int)";
				
				stm=con.createStatement();
				stm.execute(query);
				System.out.println("Table is done");
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
			try
			{
			if(stm!=null)stm.close();
			if(con!=null)con.close();
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}
	    }

	}

}
