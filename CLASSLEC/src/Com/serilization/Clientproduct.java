package Com.serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Clientproduct 
{
	public static void SaveProduct(Product prod)
	{
		String filename="D:\\productdetails.ser";		
		try 
		{
			FileOutputStream file=new FileOutputStream(filename);//this represent the file to open for writing
			ObjectOutputStream out=new ObjectOutputStream(file); //this represents the stream through which the serialized data writing will happen
			out.writeObject(prod);  //performs the serialization and write into file
			System.out.println("data serialized successfully!!!");
			out.close();
			file.close();
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product prod=new Product(1, "LGTV",68000);
		SaveProduct(prod);
	}

}
