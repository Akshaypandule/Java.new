package Com.stack;

public class Book
{
	private int bno;
	private String name;
	private double price;
	
	public Book(int bno,String name,double price)
	{
		this.bno=bno;
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString()
	{
		return "\n bno"+this.bno+
				"\n name "+this.name+
				"\n price "+this.price;
	}
	public double getprice()
	{
		return price;
	}

}
