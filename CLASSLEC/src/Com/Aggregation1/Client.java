package Com.Aggregation1;

public class Client {

	public static void main(String[] args) 
	{
		Car car=new Car("Thar","BH45","Black",160000,new Engine("4 Stroke","Petrol"));
		System.out.println(car);

	}

}
