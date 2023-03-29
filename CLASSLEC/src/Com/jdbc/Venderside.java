package Com.jdbc;
import java.sql.*;
import java.util.*;
public class Venderside 
{
	public static void main(String args[]) throws ClassNotFoundException,SQLException
	{
		//Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql:///advancejava","root","1234");
		
		Statement stm=con.createStatement();
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter the id");
			int id=sc.nextInt();
			
			System.out.println("Enter empname");
			String name=sc.next();
			
			System.out.println("Enter mobile num");
			int mobile=sc.nextInt();
			
			stm.executeUpdate("insert into emp values("+id+",'"+name+"',"+mobile+")");
			
			System.out.println("You want enter data continue Yes/no");
			
			String option=sc.next();
			if(option.equals("no"))
				break;
		}
		sc.close();
		stm.close();
		con.close();
		
	}

}
