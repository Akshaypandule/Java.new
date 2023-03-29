package Com.serilization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Serializable 
{
	private int id;
	private String name;
	private double salary;
	
	
	public Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	@Override 
	public String toString()
	{
		return this.id+" "+this.name+" "+this.salary;
	}

}
