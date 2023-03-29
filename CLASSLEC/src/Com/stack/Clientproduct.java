package Com.stack;
import Com.Exception.*;
import java.util.*;
public class Clientproduct 
{
	public static void main(String main[]) throws ProductException
	{
		Stack<Product> cart=new Stack<>();
		String wish;
		do
		{
			System.out.println("\n 1.Add product \n 2.display product \n 3.Calculate bill");
			System.out.println("Enter the choice");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter the product details");
				int pid=sc.nextInt();
				String name=sc.next();
				double price=sc.nextDouble();
				
				Product prod=new Product(pid,name,price);
				cart.push(prod);
				break;
			case 2:
				if(cart.empty())
				{
					System.out.println("cart is empty");
				}
				else
				{
					for(Product disproduct:cart)
					{
						System.out.println(disproduct);
					}
				}
				break;
			case 3:
				double totalbill=0;
				while(!cart.empty())
				{
				    Product popout=cart.pop();
				     totalbill+=popout.getprice();
				}
				System.out.println("Totalbill "+totalbill);
				break;
			default:
				System.out.println("Invalid data");
			
			}
			System.out.println("You want Continue");
			wish=sc.next().toLowerCase();
			
			
			
		}while(wish.equals("yes"));
	}

}
