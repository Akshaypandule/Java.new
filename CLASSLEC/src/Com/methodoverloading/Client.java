package Com.methodoverloading;

public class Client {

	public static void main(String[] args) 
	{
		JobUtility j1=new JobUtility();
		
		System.out.println("Search location pune---------------");
		j1.filter("pune");
		System.out.println("Serch salary 500000-----------");
		j1.filter(500000.00);
	}

}
