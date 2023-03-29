package Com.Propertiesjdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class jdbcexample1 {

	public static void main(String[] args) throws SQLException 
	{
		Connection connection=Testconn.createConnection();
		
		
		DatabaseMetaData metadata=connection.getMetaData();
		
		System.out.println(metadata.getDatabaseProductName());
		System.out.println(metadata.getDatabaseMajorVersion());
	}

}
