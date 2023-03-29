package Com.methodoverloading;

public class Job
{
	private int id;
	private String title;
	private double salary;
	private String location;
	
	public Job(int id,String title,double salary,String location)
	{
		this.id=id;
		this.title=title;
		this.salary=salary;
		this.location=location;	
	}
	@Override
	public String toString()
	{
		return "id"+id+
				"title"+title+
				"salary"+salary+
				"location"+location;
	}
	public String  getlocation()
	{
		return this.location;
	}
	public double getsalary()
	{
		return this.salary;
	}
	
}
