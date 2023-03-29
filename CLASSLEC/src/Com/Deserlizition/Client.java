package Com.Deserlizition;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import Com.serilization.*;


public class Client
{
	
	@SuppressWarnings("finally")
	public static Player retrivePlayer()
	{
		String filename="D:\\playerdetails.ser";
	
		Player ply=null;
		try
		{
		FileInputStream file=new FileInputStream(filename);
		ObjectInputStream in=new ObjectInputStream(file);
		
		 ply=(Player)in.readObject();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		finally
		{
			return ply;
		}
		
		
	}

	public static void main(String[] args) 
	{
		Player ply=retrivePlayer();
		System.out.println(ply);
		
	}

}
