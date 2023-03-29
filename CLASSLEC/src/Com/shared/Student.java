package Com.shared;

public class Student 
{

	private int rollno;
	private String name;
	private float marks;
	
	
	public Student(int rollno,String name,float marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	
	@Override
	public String toString()
	{
		return "\n rollno-"+this.rollno+
				"\n name-"+this.name+
				"\n marks-"+this.marks;
	}
	
	public float getMarks()
	{
		return this.marks;
	}

	public int getrollno()
	{
		return this.rollno;
	}
	public String getname()
	{
		return this.name;
	}

}


