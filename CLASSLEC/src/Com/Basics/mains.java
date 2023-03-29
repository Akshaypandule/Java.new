package Com.Basics;

public class mains {

	public static void main(String[] args) 
	{
		Student s1=new Student();
		System.out.println(s1);
		
		Student s2=new Student(1,"Max",89);
		System.out.println(s2);
		
		System.out.println("After updating university");
		Student.Updateuniversity("Savitribai phule University");
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
