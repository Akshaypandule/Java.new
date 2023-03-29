package Com.Arrayofobject;
import java.util.Scanner;
import Com.shared.Car;

public class Clint {

	public static void main(String[] args) 
	{
		Car [] sarr=new Car[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the car number");
			String carnumber=sc.next();
			System.out.println("Enter the car name");
			String name=sc.next();
			System.out.println("Enter the car price");
			int price=sc.nextInt();
			
			sarr[i]=new Car(carnumber,name,price);
			
		}
		for (int i=0;i<3;i++)
		{
			System.out.println(sarr[i]);
		}
	      Car min =sarr[0];
		for (int i=0;i<3;i++)
		{
			
			
			if (sarr[i].getPrice()< min.getPrice())
			{
				min=sarr[i]	;
			}
		}
		System.out.println("lowest price of car"+min);
	}

}
