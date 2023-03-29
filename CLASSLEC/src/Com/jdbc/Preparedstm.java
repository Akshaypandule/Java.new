package Com.jdbc;			
import java.util.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

public class Preparedstm {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		//Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql:///advancejava","root","1234");
		
		PreparedStatement pstm=con.prepareStatement("insert into emp values(?,?,?)");
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter the id");
			
			int id=sc.nextInt();
			System.out.println("Enter the name");
			String name=sc.next();
			
			System.out.println("Enter the mobile");
			int mobile=sc.nextInt();
			
			pstm.setInt(1, id);
			pstm.setString(2, name);
			pstm.setInt(3, mobile);
			
			pstm.executeUpdate();
			
			
			System.out.println("you want continue yes/no");
			
			String option=sc.next();
			if(option.equals("no"))
			{
				break;
			}
		}
		sc.close();
		pstm.close();
		con.close();
		
		
		

	}

}
