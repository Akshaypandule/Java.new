package RTII;

public class Car extends Vehicle 
{
	protected String model;
	
	public  Car(int id,String name,String model)
	{
		super(id,name);
		this.model=model;
	}
	@Override
	public String toString()
	{
		return "\n id "+this.id+
				"\n name "+this.name+
				"\n model"+this.model;
	}
	public void checkfuel()
	{
		System.out.println("Car fuel Checked");
	}
	public void start()
	{
		System.out.println("Car is start");
	}
	public void accelerate()
	{
		System.out.println("Car is Accelerate");
	}
	public void brake()
	{
		System.out.println("car brake is applied");
	}
	public void stop()
	{
		System.out.println("car is stop");
	}

}
