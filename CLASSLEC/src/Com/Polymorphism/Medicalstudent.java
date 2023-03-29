package Com.Polymorphism;

public class Medicalstudent extends Student
{
	private double internshipsmark;
	
	public Medicalstudent()
	{
		this.internshipsmark=0.0;
	}
	public Medicalstudent(int id,String name,double mark, double internshipsmark)
	{
		super(id,name,mark);
		this.internshipsmark=internshipsmark;
		
		
	}
	@Override
	public String toString()
	{
		return super.toString()+"\n internshipmark"+this.internshipsmark;
	}
	public void Calculatemark()
	{
		System.out.println("\n total mark -"+(this.mark +this.internshipsmark));
	
	}

}
