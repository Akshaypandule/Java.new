package Com.serilization;
import java.io.*;

public class Clientplayer 
{
	public static void saveplay(Player ply)
	{
	String filename="D:\\playerdetails.ser";
	   try
	     {
	      	 FileOutputStream file=new FileOutputStream(filename);
		     ObjectOutputStream out=new ObjectOutputStream(file);
		     
		     out.writeObject(ply);
		     System.out.println("Data serilization is done");
		     out.close();
		     file.close();
		     
	     }
	   catch(FileNotFoundException e)
	   {
		   System.out.println(e);
	   }
	   catch(IOException e)
	   {
		   System.out.println(e);
		   
	   }
	  
	}
public static void main(String args[])
	   {
		Player p1=new Player(1,"Virat",56.23);
		saveplay(p1);
		   
	   }
	

}
