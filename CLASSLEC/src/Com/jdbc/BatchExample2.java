package Com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchExample2 {

	public static void main(String[] args) throws SQLException
	{
		Connection connection=DriverManager.getConnection("jdbc:mysql:///advancejava","root","1234");
		
		PreparedStatement pstm=connection.prepareStatement("update emp1 set name=? where id=?");
		
		pstm.setString(1, "Ram");
		pstm.setInt(2,1);
		pstm.addBatch();
		
		pstm.setString(1, "samu");
		pstm.setInt(2,2);
		pstm.addBatch();
		
		pstm.setString(1, "Anikta");
		pstm.setInt(2, 3);
		pstm.addBatch();
		
		pstm.executeBatch();
		
		connection.close();
		pstm.close();
		

	}

}
