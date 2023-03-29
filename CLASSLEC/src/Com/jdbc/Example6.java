package Com.jdbc;
import java.util.*;
import java.sql.*;
import java.util.*;
public class Example6 
{
	public static void main(String args []) throws SQLException 
	{
		Connection conn=DriverManager.getConnection("jdbc:mysql:///advancejava","root","1234");
		
		PreparedStatement pstm=conn.prepareStatement("insert into Employee values(?,?,?)");
		
	   Scanner sc=new Scanner(System.in);
	   
	   while(true)
	   {
		   System.out.println("Enter id");
		   int id=sc.nextInt();
		   
		   System.out.println("Enter name");
		   String name=sc.next();
		   
		   System.out.println("Enter salary");
		   double salary=sc.nextDouble();
		   
		   pstm.setInt(1, id);
		   pstm.setString(2, name);
		   pstm.setDouble(3, salary);
		   
		   pstm.executeUpdate();
		   
		   System.out.println("You want Continue yes/no");
		   String option=sc.next();
		   
		   if(option.equals("no"))
		   {
			   break;
		   }
		  
	   }
	   pstm.close();
	   conn.close();
	   sc.close();
	   
		
	}

}
