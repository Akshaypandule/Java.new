package RTII;

public class Client
{
	public static void ride(Vehicle Vehicleref)
	{
		if (Vehicleref.getClass().getName()==Scooter.class.getName())
		{
			Scooter Activa=(Scooter)Vehicleref;
			Activa.Kick();
		}
		
		if(Vehicleref.getClass().getName()==Car.class.getName())
		{
			Car Ford=(Car)Vehicleref;
			Ford.checkfuel();
		}
		Vehicleref.start();
		Vehicleref.accelerate();
		Vehicleref.brake();
		Vehicleref.stop();
	
		
		
	}
	public static void main(String args[])
	{
		Scooter Activa=new Scooter(12,"Activa","Black");
		System.out.println(Activa);
		ride(Activa);
		
		Car Ford=new Car(17,"Ford","d56");
		ride(Ford);
	}

}
