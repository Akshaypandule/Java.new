package Abstraction;

public abstract class Vehicle 
{
	protected int id;
	protected String name;
	
	public Vehicle(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public abstract void start();
	public abstract void accelerate();
	public abstract void brake();
	public abstract void stop();
	
}
