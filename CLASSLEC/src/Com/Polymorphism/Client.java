package Com.Polymorphism;

public class Client {
		public static void displaystudentdetails(Student stud)
		{
			System.out.println(stud);
			stud.calculateAggmark();
		}
		public static void main(String args[])
		{
			Student stud;
			stud=new Medicalstudent(001,"Dinesh",24,50);
			displaystudentdetails(stud);
			
			stud=new Engg_students(002,"Akshay",56,75);
			displaystudentdetails(stud);			
		}
		
	

	

}
