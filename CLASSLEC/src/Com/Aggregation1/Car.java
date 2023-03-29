package Com.Aggregation1;

public class Car 
{
	private String name;
	private String model;
	private String color;
	private double price;
	private Engine engine;
	
	
	public Car(String name,String model,String color,double price,Engine engine)
	{
		this.name=name;
		this.model=model;
		this.color=color;
		this.price=price;
		this.engine=engine;
		
	}
	public String toString()
	{
		return "\n name "+this.name+
				"\n model "+this.model+
				"\n color "+this.color+
				"\n price "+this.price+
				"\n engine "+this.engine;
	}

}
