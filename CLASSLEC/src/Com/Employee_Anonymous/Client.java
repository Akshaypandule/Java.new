package Com.Employee_Anonymous;

public class Client
{
	public static void main (String args[])
	{
		Employee []list=new  Employee[5];
		
		list[0]=new Employee(1,"Jon",1.5,25000);
		list[1]=new Employee(2,"Dinesh",2,50000);
		list[2]=new Employee(3,"Dada",2.5,75000);
		list[3]=new Employee(4,"Mangesh",2,47900);
		list[4]=new Employee(5,"Avinash",3,79000);
		
		
		EmployeeUtility.filteremployee(list,new FilterEmployee()
		{
			@Override
			public boolean filter(Employee emp)
			{
				if(emp.getexperience()==2)
				{
					return true;
				}
				return false;
			}
			
			
	    }
				);
		
		EmployeeUtility.filteremployee(list,new FilterEmployee()
				{
			@Override
			public boolean filter(Employee emp)
			{
				if(emp.getsalary()>49000.0)
				{
					return true;
				}
				return false;
			}
			
				});
		EmployeeUtility.filteremployee(list, (Employee emp)->{
			if(emp.getname().startsWith("A"))
			{
				return true;
			}
			return false;
		});
			
		
				
	}

}
