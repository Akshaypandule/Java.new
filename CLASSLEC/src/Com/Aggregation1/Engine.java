package Com.Aggregation1;

public class Engine 
{
	private String type;
	private String fuel_type;
	
	
	public Engine(String type,String fuel_type)
	{
		this.type=type;
		this.fuel_type=fuel_type;
	}
	
	public String toString()
	{
		return "\n Type "+this.type+
				"\n fuel type "+this.fuel_type;
	}

}
