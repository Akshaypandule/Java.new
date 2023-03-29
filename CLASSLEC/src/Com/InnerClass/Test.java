package Com.InnerClass;

public class Test
{
	public static void main(String args[])
	{
		House house1=new House("2BHK");
		House.Bedroom b1=house1.new Bedroom();
		b1.printbedroom();
		
		House house2=new House("4BHK");
		House.Bedroom b2=house2.new Bedroom();
		b2.printbedroom();
	}

}
