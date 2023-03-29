package Com.abstractdemo;

public class Car 
{
	private int id;
	private String name;
	private String model;
	
	public Car(int id,String name,String model)
	{
		this.id=id;
		this.name=name;
		this.model=model;
	}
	@Override
	public String toString()
	{
		return "\n id"+id+
				"\n name"+name+
				"\n model"+model;
	}

}
