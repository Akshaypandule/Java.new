package Com.Basics;
import java.util.Scanner;
public class first1 {

	public static void main(String[] args) 
	{
		double r,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		r=sc.nextDouble();
		final double pi=3.14;
		
		area=pi*r*r;
		System.out.println("Area of circle is "+area);
	}
}
