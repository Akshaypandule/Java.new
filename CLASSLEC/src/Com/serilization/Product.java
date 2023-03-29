package Com.serilization;

import java.io.Serializable;

public class Product implements Serializable
{
	private int pid;
	private String pname;
	private int price;
	
	public Product(int pid, String pname,int price)
	{
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
	
	@Override
	public String toString()
	{
		return this.pid+" "+this.pname+" "+this.price;
	}

}
