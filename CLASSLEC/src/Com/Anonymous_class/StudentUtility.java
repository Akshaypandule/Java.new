package Com.Anonymous_class;
import Com.shared.Student;
public class StudentUtility
{
	public static void filterstudent(Student[]studentlist,FilterStudent filterstudentref)
	{
		for(Student stud:studentlist)
		{
			if(filterstudentref.filter(stud))
			{
			System.out.println(stud);
			}
			
		}
	}

}
