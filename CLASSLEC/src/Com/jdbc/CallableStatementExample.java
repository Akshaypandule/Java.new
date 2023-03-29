package Com.jdbc;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementExample {

	public static void main(String[] args) throws SQLException 
	{
		
		System.out.println(Math.sqrt(25));
		Connection connection=DriverManager.getConnection("jdbc:mysql:///advancejava","root","1234");
		
		//Statement statement=connection.createStatement();
		
		CallableStatement callablestatement=connection.prepareCall("{call getsal(?,?)}");
		
		callablestatement.setInt(1, 111);
		callablestatement.registerOutParameter(2,Types.INTEGER);
		
		callablestatement.executeUpdate();
		
		connection.close();
		callablestatement.close();
		

	}

}
