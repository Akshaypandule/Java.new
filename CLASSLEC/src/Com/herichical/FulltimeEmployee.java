package Com.herichical;

public class FulltimeEmployee extends Employee
{
	double bouns;
	
	
	public  FulltimeEmployee(double salary,double bouns)
	{
		super(salary);
		this.bouns=bouns;
	}
	public double tosal()
	{
		return salary+(salary*bouns);
	}
}
