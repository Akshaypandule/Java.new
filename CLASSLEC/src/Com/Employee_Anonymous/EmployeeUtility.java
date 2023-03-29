package Com.Employee_Anonymous;

public class EmployeeUtility 
{
	public static void filteremployee(Employee [] Employeelist,FilterEmployee employeeref)
	{
		for(Employee emp:Employeelist)
		{
			if(employeeref.filter(emp))
			{
				System.out.println(emp);
			}
		}
	}

}
