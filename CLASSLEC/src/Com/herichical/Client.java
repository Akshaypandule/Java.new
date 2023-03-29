package Com.herichical;

public class Client {

	public static void main(String[] args) 
	{
		FulltimeEmployee E1=new FulltimeEmployee(50000,0.50);
		System.out.println(E1.salary);
		System.out.println(E1.bouns);
		System.out.println("Total Salary of fulltime EMployee "+E1.tosal());
		
		
		InterEmployee E2=new InterEmployee(25000,0.25);
		System.out.println(E2.salary);
		System.out.println(E2.bouns);
		System.out.println("Total Salary of InterEMployee "+E2.tosal());
		
		
		
	
		

	}

}
