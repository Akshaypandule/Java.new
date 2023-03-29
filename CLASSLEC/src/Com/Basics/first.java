package Com.Basics;
import java.util.Scanner;
public class first {

	public static void main(String[] args) 
	{
		int result;
		System.out.println("Enter the number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			result=num*i;
			System.out.println(result);
		}	
	}
}
