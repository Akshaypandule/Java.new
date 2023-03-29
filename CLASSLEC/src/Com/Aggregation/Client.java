package Com.Aggregation;

import java.util.Date;

public class Client
{
	public static void  main(String args[])
	{ 
		@SuppressWarnings("deprecation")
		User user=new User("123445","Akshay",new Date(25,11,2018),
				new Address("Krishna","B204","Mainroad","Pune",411061,"Maharashtra"));
		System.out.println(user);
		
	}

}
