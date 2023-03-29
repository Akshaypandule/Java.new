package Com.Anonymous_class;

import Com.shared.Student;

public class Client 
{
	public static void main(String args[])
	{
		Student []list=new Student[6];
		list[0]= new Student(1,"Akshay",85);
		list[1]=new Student(2,"Avinash",65);
		list[2]=new Student(3,"Dinesh",70);
		list[3]=new Student(4,"Mahesh",49);
		list[4]=new Student(5,"Ganesh",50);
		list[5]=new Student(6,"Mangesh",72);
		
		System.out.println("Student marks greater than 80");
		//StudentUtility.filterstudent(list, new Filterbymark80());
		
		StudentUtility.filterstudent(list,new FilterStudent()
		{
			@Override
			public boolean filter(Student stud)
			{
				if(stud.getMarks()>80)
				{
					return true;
				}
				return false;
				
			}
		});
		
		StudentUtility.filterstudent(list, new FilterStudent()
		{
		@Override
		public boolean filter(Student stud)
		{
			if(stud.getname().startsWith("A"))
			{
				return true;
			}
			return false;
				
		}});
		StudentUtility.filterstudent(list,(Student stud)->{
			if(stud.getname().endsWith("e"))
			{
				return true;
			}
			return false;
		});
		
		StudentUtility.filterstudent(list, (Student stud)->{
			if(stud.getMarks()<40)
			{
				return true;
			}
			return false;
		});

	}

}
