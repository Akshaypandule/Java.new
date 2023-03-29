package Com.methodoverloading;
import java.util.Scanner;
public class JobUtility 
{
	private Job [] Joblist=new Job[5];
	private Scanner sc=new Scanner(System.in);
	public JobUtility()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the title:");
			String title=sc.next();
			System.out.println("enter the salary:");
			double salary=sc.nextDouble();
			sc.nextLine();
			System.out.println("enter the location:");
			String location=sc.next();
			
			
			Joblist[i]=new Job(id,title,salary,location);
		}
	}
	public void filter(String location)
	{
		for(Job find:Joblist)
		{
			if (find.getlocation().equals(location))
			{
				System.out.println(find);
			}
		}
	}
	public void filter(double salary)
	{
		for(Job find:Joblist)
		{
			if(find.getsalary()==salary)
			{
				System.out.println(find);
			}
		}
	}
 
}
