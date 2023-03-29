package Com.Interface;

public class Car extends Vehicle implements Camera
{
	private String model;
	private double price;
	
	public Car(int id,String name,String model,double price)
	{
		super(id,name);
		this.model=model;
		this.price=price;
	}
	@Override
	public String toString()
	{
		return "\n id"+this.id+
				"\n name"+this.name+
				"\n model"+this.model+
				"\n price"+this.price;
	}
	public void checkfuel()
	{
		System.out.println("Check fuel in car");
	}
	public void start()
	{
		System.out.println("Car is started");
	}
	public void click()
	{
		System.out.println("Photo is clicked");
	}
	public void record()
	{
		System.out.println("Car Camera recording is Started");
	}
	public void accelerate()
	{
		System.out.println("Car is accelerated");
	}
	public void breaks()
	{
		System.out.println("Car breaks is applied");
	}
	public void stop()
	{
		System.out.println("Car is stoped");
	}
	public void lockdoor()
	{
		System.out.println("Car door is locked");
	}
	
}
