package Com.Interface_default;

public class Client
{
	public static void main(String args[])
	{
		Electronicdevice realme=new Mobile();
		realme.on();
		realme.runapp();
		realme.off();
		realme.charging();
		
		Electronicdevice HP=new Laptop();
		HP.on();
		HP.runapp();
		HP.off();
		HP.charging();
	}

}
