package Com.Arraylist;
import Com.Employee_Anonymous.*;
import java.util.*;
public class Client 
{

	public static void main(String[] args) 
	{
		List<Employee> employeelist=new ArrayList<>();
		String wish;
		do
		{
		
		
		System.out.println("1 enter the employee details");
		System.out.println("2 Display employee details");
	    System.out.println("3 Remove employee having salary less than 20000");
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the choice");
	    
	    int choice=sc.nextInt();
	    
	    switch(choice)
	    {
	    case 1:
	    	System.out.println("enter the employee details");
	    	int id=sc.nextInt();
	    	String name=sc.next();
	    	double experience=sc.nextDouble();
	    	float salary=sc.nextFloat();
	    	employeelist.add(new Employee(id,name,experience,salary));
	    	break;
	    case 2:
	        for(Employee emp:employeelist)
	      {
	    	System.out.println(emp);
	      }
	    break;
	    case 3:
	    	employeelist.removeIf(emp->emp.getsalary()<10000);
	    	
	    	default:
	    }
	    System.out.println("Do you Want repeat");
	    wish=sc.next().toLowerCase();
	}while(wish.equals("yes"));
}
}
