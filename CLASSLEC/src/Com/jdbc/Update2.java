package Com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Update2 
{
	public static void main(String args[]) throws SQLException
	{
	      Connection conn=DriverManager.getConnection("jdbc:mysql:///advancejava","root","1234");
	      
	      PreparedStatement pstm=conn.prepareStatement("select id,salary from Employee where salary>?");
	      
	      pstm.setInt(1, 10000);
	      
	      ResultSet set=pstm.executeQuery();
	      
	      while(set.next())
	      {
	    	  System.out.println(set.getInt(1)+" "+set.getDouble(2));
	      }
	}

}
