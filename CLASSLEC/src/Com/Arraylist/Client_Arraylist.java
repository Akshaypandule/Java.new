package Com.Arraylist;
import Com.shared.*;
import java.util.*;
public class Client_Arraylist 
{
	public static void main(String args[])
	{
		List<Student> studlist=new ArrayList<>();
		String wish;
		do
		{
		
		System.out.println("1 Add Student details");
		System.out.println("2 Display Stuent details");
		System.out.println("3 Remove Student details");
		System.out.println("4 remove by using index");
		System.out.println("Enter your Choice");
		Scanner sc=new Scanner(System.in);
		
		int Choice=sc.nextInt();
		
		switch(Choice)
		{
		case 1:
			System.out.println("Enter the Student details");
			int roll_no=sc.nextInt();
			String name=sc.next();
			float marks=sc.nextFloat();
			
			studlist.add(new Student(roll_no,name,marks));
			break;
		case 2:
			for(Student stud:studlist)
			{
				System.out.println(stud);
			}
			break;
		case 3:
			studlist.removeIf(stud->stud.getMarks()<60);
			default:
		
		
	
		}
		System.out.println("you want repeat");
		wish=sc.next().toLowerCase();
		
		}while(wish.equals("yes"));
	}
		
		
		
		
		
		
	

}
