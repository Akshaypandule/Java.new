package Com.Interface_default;

public interface Electronicdevice
{
	void on();
	void off();
	void runapp();
	
	default void charging()
	{
		System.out.println("Charging on");
	}

}
