package Com.Interface;

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
	public abstract void breaks();
	public abstract void stop();
}
	
	

