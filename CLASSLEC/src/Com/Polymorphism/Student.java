package Com.Polymorphism;

public class Student
{
	private int id;
	private String name;
	protected double mark;
	
	public Student()
	{
		this.id=0;
		this.name="NA";
		this.mark=0.0;
	}
	public Student(int id,String name,double mark)
	{
		this.id=id;
		this.name=name;
		this.mark=mark;
	}
	@Override
	public String toString()
	{
		return "id "+this.id+
				"Name"+this.name+
				"Mark"+this.mark;			
	}
	public void calculateAggmark()
	{
		System.out.println("total mark is"+this.mark);
	}
	

}
