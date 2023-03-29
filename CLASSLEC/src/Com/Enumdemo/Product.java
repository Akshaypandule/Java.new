package Com.Enumdemo;

public class Product 
{
	private int pid;
	private String pname;
	private double price;
	private Category category;
	
	public Product(int pid,String pname,double price,Category category)
	{
		this.pid=pid;
		this.pname=pname;
		this.price=price;
		this.category=category;
		
	}
	@Override
	public String toString()
	{
		return "\n pid "+this.pid+
				"\n pname "+this.pname+
				"\n price "+this.price+
				"\n category "+this.category;
	}
	public String getcategory()
	{
		return category.toString();
	}
	public double getprice()
	{
		return price;
	}

}
