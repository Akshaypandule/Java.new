package Com.jdbc;

import java.sql.*;

public class Transaction_mana
{
	public static void main(String args[]) throws SQLException
	{
		Connection connection=null;
		
		Statement statement=null;
		try
		{
	       Class.forName("com.mysql.jdbc.Driver");
		   connection=DriverManager.getConnection("jdbc:mysql:///advancejava","root","1234");
      		System.out.println("Connection is done");
			statement=connection.createStatement();		
			connection.setAutoCommit(false);
		    statement.executeUpdate("insert into emp1 values(121,'Akshay',56000)");
			statement.executeUpdate("insert into emp1 values(222,'mangesh',23600)");
			statement.executeUpdate("insert into emp1 values(333,'satish',45000)");
			statement.executeUpdate("insert into emp1 values(444,'Sandesh',40000)");
			statement.executeUpdate("update emp1 set salary=salary+5000 where id=111)");
			connection.commit();
			System.out.println("Transaction succesfully");	
		}
		catch(Exception e)
		{
			connection.rollback();
			System.out.println(e);
		}
		finally
		{
			if(statement!=null) statement.close();
			if(connection!=null) connection.close();
		}
	}

}
