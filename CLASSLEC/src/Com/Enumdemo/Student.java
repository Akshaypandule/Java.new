package Com.Enumdemo;

public class Student 
{
	private int id;
	private String name;
	private DepartmentEnum dpname;
	private Year year;
	private double fee;
	
	public Student(int id,String name,DepartmentEnum dpname,Year year,double fee)
	{
		this.id=id;
		this.name=name;
		this.dpname=dpname;
		this.year=year;
		this.fee=fee;
	}
	@Override
	public String toString()
	{
		return "\n id"+this.id+
				"\n name "+this.name+
				"\n dpname"+this.dpname+
				"\n year "+this.year+
				"\n fee"+this.fee;		
	}
	public String getdpname()
	{
		return dpname.toString();
	}
	public String getyear()
	{
		return year.toString();	}
	

}
