package Com.Exception;

public class Client {

	public static void main(String[] args) 
	{
		try
		{
		Product b=new Product(1,"Pen",0);
		System.out.println(b);
		}
		catch(ProductException ex)
		{
			System.out.println(ex);
		}

	}

}
