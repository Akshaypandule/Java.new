package Com.stack;
import java.util.Scanner;
import java.util.Stack;

public class Client {

	public static void main(String[] args)
	{
		Stack<Book> cart=new Stack<>();
		String wish;
		do
		{
		
		System.out.println("\n 1 .Enter the book details \n 2.enter the cart \n 3 totalbill");
		System.out.println("Enter the choice");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter the book details");
			int bid=sc.nextInt();
			String name=sc.next();
			double price=sc.nextDouble();
			cart.push(new Book(bid,name,price));
			break;
		case 2:
			if(cart.isEmpty())
			{
				System.out.println("cart is Empty");
			}
			else
			{
				for(Book bookdisplay:cart)
				{
					System.out.println(bookdisplay);
				}
				break;
			}
		case 3:
		
			double totalbill=0;
			while(!cart.empty())
			{
				Book popBook=cart.pop();
				
				totalbill+=popBook.getprice();
				
			}
			System.out.println("Totalbill "+totalbill);
			
			break;
		default:
			System.out.println("Invalid data");
		
		}
		
		System.out.println("Do u wish to continue ");
		wish=sc.next();
		
	}while(wish.equals("yes"));
}
}



