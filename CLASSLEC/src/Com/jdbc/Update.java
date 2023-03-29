package Com.jdbc;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
		//Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql:///advancejava","root","1234");
		
		PreparedStatement pstm=conn.prepareStatement("update Employee set salary=salary+? where salary<?");
		
		pstm.setInt(1, 20000);
		pstm.setInt(2, 10000);
		
		
		int x =pstm.executeUpdate();
		System.out.println("Record update is done"+x);
		
		conn.close();
		pstm.close();
	}

}
