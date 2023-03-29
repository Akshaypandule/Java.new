package Com.shared;

public class Car 
{
	private String carnumber;
	private String name;
	private int price;
	
	public Car (String carnumber,String name,int price)
	{
		this.carnumber=carnumber;
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString()
	{
		return "\n Carnumber "+carnumber+
				"\n name "+name+
				"\n price "+price;
	}
	public int getPrice()
	{
		return this.price;
	}
	
	

}
