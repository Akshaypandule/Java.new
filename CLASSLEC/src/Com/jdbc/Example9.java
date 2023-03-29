package Com.jdbc;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Example9
{
	public static void main(String args[]) throws SQLException
	{
		Connection conn=DriverManager.getConnection("jdbc:mysql:///advancejava","root","1234");
		
		PreparedStatement prtm=conn.prepareStatement("select name,id from employee where salary<?");
		
		prtm.setInt(1, 25000);
		
		ResultSet set=prtm.executeQuery();
		
		while(set.next())
		{
			System.out.println(set.getString(1)+" "+set.getDouble(2));
		}
		
		
		prtm.close();
		conn.close();
		
		System.out.println("Resource are released............");
		
	}

	

}
