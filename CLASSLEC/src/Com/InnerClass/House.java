package Com.InnerClass;

public class House 
{
	private String type;
	public House(String type)
	{
		this.type=type;
	}
	void printType()
	{
		System.out.println("House Type "+type);
	}
	class Bedroom
	{
		private int bedroom_count;
		public void printbedroom()
		{
			if(type=="2BHK")
			{
				bedroom_count=2;
			}
			else if(type=="4BHK")
			{
				bedroom_count=4;
			}
			printType();
			
			System.out.println("Count of bedroom"+bedroom_count);
		}
	}
	

}
