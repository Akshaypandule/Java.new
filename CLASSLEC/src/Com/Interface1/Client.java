package Com.Interface1;

public class Client 
{
	public static void main(String args[])
	{
		Dailynews d1=new Dailynews();
		d1.sendMessage();
		d1.sendEmail();
		
		Youchannel y1=new Youchannel();
		y1.sendMessage();
		y1.sendEmail();
	}

}
