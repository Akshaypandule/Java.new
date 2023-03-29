package Com.serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Client
{
	public static void saveemployee(Employee emp)
	{
		String filename="D:\\employee.ser";
		
		try 
		{
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			System.out.println("Data serilize sucessfully");
			out.close();
			file.close();
		} 
		
		
		
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		Employee emp=new Employee(01,"King",56000);
		saveemployee(emp);

	}

}
