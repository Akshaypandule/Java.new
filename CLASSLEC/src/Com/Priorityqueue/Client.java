package Com.Priorityqueue;
import java.util.PriorityQueue;

import Com.Exception.*;
public class Client {

	public static void main(String[] args) throws ProductException 
	{
		PriorityQueue <Product> productlist=new PriorityQueue<>(new ProductComparator());
		
		productlist.add(new Product(011,"Table",2700));
		productlist.add(new Product(012,"Face Wash",150));
		productlist.add(new Product(013,"Notebook",40));
		
		for(Product prod:productlist)
		{
			System.out.println(prod);
		}
		
		System.out.println("Product remove from list "+productlist.poll());
		
		for(Product prod:productlist)
		{
			System.out.println(prod);
		}
		

	}

}
