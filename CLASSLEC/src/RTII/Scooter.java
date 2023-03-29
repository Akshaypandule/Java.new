package RTII;

public class Scooter extends Vehicle
{
	private String color;
	
	public Scooter(int id,String name,String color)
	{
		super(id,name);
		this.color=color;
	}
	@Override
	public String toString()
	{
		return "\n id"+this.id+
				"\n name"+this.name+
				"\n color"+this.color;
	}
	public void Kick()
	{
		System.out.println("Applied kick");
	}
	public void start()
	{
		System.out.println("Scooter is Start");
	}
	public void accelerate()
	{
		System.out.println("Scooter is Accelerate");
	}
	public void brake()
	{
		System.out.println("Scooter brake is applied");
	}
	public void stop()
	{
		System.out.println("Scooter is stop");
	}

	
}
