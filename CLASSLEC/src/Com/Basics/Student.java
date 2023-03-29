package Com.Basics;

public class Student 
{
	private int roll_no;
	private String name;
	private int mark;
	private static String University_name="Pune University";
	public Student()
	{
		 this.roll_no=0;
		 this.name="NA";
		 this.mark=0;
	}
	public Student(int roll_no,String name,int mark)
	{
		this.roll_no=roll_no;
		this.name=name;
		this.mark=mark;	
	}
	@Override
	public String toString()
	{
		return " roll_no-"+this.roll_no+
				"\n name-"+this.name+
				"\n mark-"+this.mark+
				"\n University_name-" +University_name;
	}
	public static void Updateuniversity(String newUniversityname)
	{
		University_name=newUniversityname;
	}
	

	}






