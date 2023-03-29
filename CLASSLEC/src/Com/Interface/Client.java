package Com.Interface;

public class Client
{
	public static void ride (Vehicle Vehicleref)
	{
		if(Vehicleref.getClass().getName()==Scooter.class.getName())
		{
			Scooter activa=(Scooter)Vehicleref;
			System.out.println(activa);
			activa.kick();
			activa.handllock();		
		}
		
		if(Vehicleref.getClass().getName()==Car.class.getName())
		{
			Car ford=(Car)Vehicleref;
			System.out.println(ford);
			ford.checkfuel();
			ford.lockdoor();
		}
		Vehicleref.start();
		Vehicleref.accelerate();
		Vehicleref.breaks();
		Vehicleref.stop();

	}
	public static void main(String args[])
	{
		Scooter activa=new Scooter(001,"Activa","Black",44.0);
		ride(activa);
		
		
		Car ford=new Car(002,"Ford","VGH",150000.00);
		ride(ford);
		
	}

}
