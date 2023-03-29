package Com.Exception;

public class Product 
{
	private int pid;
	private String name;
	private double price;
	public Product (int pid,String name,double price) throws ProductException
	{
		this.pid=pid;
		this.name=name;
		if(price<0)
		{
			ProductException ex=new ProductException("Invalid price");
			throw ex;
		}
		this.price=price;
	}
	@Override
	public String toString()
	{
		return "\n pid "+this.pid+
				"\n name "+this.name+
				"\n price "+this.price;
	}
	public double getprice()
	{
		return this.price;
	}

}
