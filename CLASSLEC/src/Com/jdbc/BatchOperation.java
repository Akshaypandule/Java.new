package Com.jdbc;
import java.sql.*;
import java.sql.DriverManager;

public class BatchOperation {

	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql:///advancejava","root","1234");
		System.out.println(connection);
		
		Statement statement=connection.createStatement();
		
		
		statement.addBatch("insert into emp1 values(1,'Akshay',25000)");
		statement.addBatch("insert into emp1 values(2,'sunny',20000)");
		statement.addBatch("insert into emp1 values(3,'Abhi',27000)");
		statement.addBatch("insert into emp1 values(4,'dinesh',56500)");
		statement.addBatch("update emp1 set salary=salary+1000 where id=1");
		
		
		int [] a=statement.executeBatch();
		
		for(int x:a)
		{
			System.out.println(x);
		}
		connection.close();
		statement.close();
		
		
		
		
		
		

	}

}
