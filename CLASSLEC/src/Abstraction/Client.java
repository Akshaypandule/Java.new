package Abstraction;

public class Client 
{
	
	public static void ride(Vehicle vehicleref)
	{
		if(vehicleref.getClass().getName()==Scooter.class.getName());
		{
			Scooter Activa=(Scooter)vehicleref;
			Activa.kick();
		}
		if(vehicleref.getClass().getName()==Car.class.getName())
		{
			Car Ford=(Car)vehicleref;
			Ford.key();
		}
		vehicleref.start();
		vehicleref.accelerate();
		vehicleref.brake();
		vehicleref.stop();
		
			
	}
	public static void main(String main[])
	{
		Scooter Activa=new Scooter(02,"Activa","Black");
		ride(Activa);
		
		Car Ford=new Car(12,"Ford","CJ01");
		ride(Ford);
		
	
	}

}
