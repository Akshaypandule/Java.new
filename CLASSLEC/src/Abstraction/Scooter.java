package Abstraction;

public class Scooter extends Vehicle
{
	private String color;
	
	public Scooter (int id,String name,String color)
	{
		super(id,name);
		this.color=color;
	}
	@Override
	public String toString()
	{
		return "\n id "+this.id+
				"\n name "+this.name+
				"\n color "+this.color;	
	}
	public void kick()
	{
		System.out.println("Kick is applied");
	}
	public void start()
	{
		System.out.println("Scooter is start");
	}
	public void accelerate()
	{
		System.out.println("Scooter is accelerate");
	}
	public void brake()
	{
		System.out.println("Scooter break is applied");
	}
	public void stop()
	{
		System.out.println("Scooter is stop");
	}
	

}
