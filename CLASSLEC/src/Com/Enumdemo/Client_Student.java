package Com.Enumdemo;

public class Client_Student 
{
	public static void main(String args[])
	{
		Student [] studentlist=new Student[10];
		studentlist[0]=new Student(1,"King",DepartmentEnum.Civil,Year.BE,56000);
		studentlist[1]=new Student(2,"Akshay",DepartmentEnum.Mecahnical,Year.FY,57000);
		studentlist[2]=new Student(11,"Dadus",DepartmentEnum.Mecahnical,Year.TY,57000);
		studentlist[3]=new Student(6,"Vinod",DepartmentEnum.IT,Year.SY,51000);
		studentlist[4]=new Student(4,"Abhi",DepartmentEnum.Chemical,Year.FY,58000);
		studentlist[5]=new Student(9,"Dj",DepartmentEnum.Electrical,Year.TY,45000);
	    studentlist[6]=new Student(56,"Mangesh",DepartmentEnum.Electronic,Year.BE,65000);
	    studentlist[7]=new Student(3,"Bapu",DepartmentEnum.Chemical,Year.SY,45000);
	    studentlist[8]=new Student(13,"Ganesh",DepartmentEnum.Mecahnical,Year.BE,59000);
	    studentlist[9]=new Student(10,"Avinash",DepartmentEnum.Computer,Year.FY,68000);
	    
	    for(Student list:studentlist)
	    {
	    	if(list.getdpname().equals(DepartmentEnum.Mecahnical.toString()))
	    	{
	    		System.out.println(list);
	    	}
	    	
	    	if(list.getyear().equals(Year.BE.toString()))
	    	{
	    		System.out.println(list);
	    	}
	    	
	    }
	    
		
	

	}

}
