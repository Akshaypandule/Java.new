package Com.Employee_Anonymous;

public class Employee
{
	private int id;
	private String name;
	private double experience;
	private float salary;
	
	public Employee(int id,String name,double experience,float salary)
	{
		this.id=id;
		this.name=name;
		this.experience=experience;
		this.salary=salary;
	}
	@Override
	public String toString()
	{
		return "\n id "+this.id+
				"\n name "+this.name+
				"\n experience "+this.experience+
				"\n salary "+this.salary;
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public double getexperience()
	{
		return experience;
	}
	public float getsalary()
	{
		return salary;
	}
	

}
