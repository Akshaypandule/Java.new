package Com.Interface;

public class Scooter extends Vehicle
{
	protected String color;
	protected double millage;
	
	public Scooter(int id,String name,String color,double millage)
	{
		super(id,name);
		this.color=color;
		this.millage=millage;
	}
	@Override
	public String toString()
	{
		return "\n id"+this.id+
				"\n name"+this.name+
				"\n color"+this.color+
				"\n millage"+this.millage;
	}
	public void kick()
	{
		System.out.println("Applied Kick on Scooter");
	}
	public void start()
	{
		System.out.println("Scooter is Started");
	}
	public void accelerate()
	{
		System.out.println("Scooter is accelerated");
	}
	public void breaks()
	{
		System.out.println("Scooter breaks is applied");
	}
	public void stop()
	{
		System.out.println("Scooter is stop");
	}
	public void handllock()
	{
		System.out.println("Scooter handle is lock");
	}
	

}
