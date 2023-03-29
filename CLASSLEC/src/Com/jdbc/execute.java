package Com.jdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class execute {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws SQLException
	{
		Connection conn=DriverManager.getConnection("jdbc:mysql:///advancejava","root","1234");
		
		Statement stm=conn.createStatement();
		String q1="Select*from employee";
		String q2="Update employee set salary=salary+5000 where id=1";
		
		boolean b=stm.execute(q2);
		
		if(b)
		{
			ResultSet set=stm.getResultSet();
			while(set.next())
			{
				System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getDouble(3));
			}
		}
		else
		{
			int i=stm.getUpdateCount()
;		}
	}

}
