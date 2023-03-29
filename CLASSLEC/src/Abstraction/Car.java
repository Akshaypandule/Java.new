package Abstraction;

public class Car extends Vehicle
{
	private String module;
	
	
	public Car(int id,String name,String module)
	{
		super(id,name);
		this.module=module;
	}
	@Override
	public String toString()
	{
		return "\n id "+this.id+
				"\n name "+this.name+
				"\n module "+this.module;
	}
	public void key()
	{
		System.out.println("rotate key the car");
	}
	public void start()
	{
		System.out.println("Start the car");
	}
	public void accelerate()
	{
		System.out.println("Accelerate the car");
	}
	public void brake()
	{
		System.out.println("Break is applied");
	}
	public void stop()
	{
		System.out.println("Car is stop");
	}

}
