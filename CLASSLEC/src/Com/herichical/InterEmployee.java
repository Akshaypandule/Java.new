package Com.herichical;

public class InterEmployee extends Employee
{
	public double bouns;
	
	public InterEmployee(double salary,double bouns)
	{
		super(salary);
		this.bouns=bouns;
	}
	public double tosal()
	{
		return (salary*bouns)+salary;
	}

}
