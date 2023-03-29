package Com.Exception;


public class ArrayEngine 
{
	public static void displayElements(int[] arr) throws ArrayIndexOutOfBoundsException
	{
		try
		{
			for(int index=0;index<10;index++)
			{
				System.out.println(arr[index]);
			}
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			throw ex;
		}
}

	public static void main(String[] args)
    {
		try
		{
			int[] arr= {10,16,13,18,12};

			displayElements(arr);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Can not access the elements");
		}
		
	}

}
