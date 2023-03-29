package Com.Polymorphism;

public class Engg_students extends Student
{
	private double project_mark;
	
	public Engg_students()
	{
		this.project_mark=0.0;
	}
	public Engg_students(int id,String name,double mark,double project_mark)
	{
		super(id,name,mark);
		this.project_mark=project_mark;
	}
	@Override
	public String toString()
	{
		return super.toString()+
				"\n project mark"+this.project_mark;
	}
	public void calculatemark()
	{
		System.out.println("\n total mark -"+(this.mark +this.project_mark));
	}

}
