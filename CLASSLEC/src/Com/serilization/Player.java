package Com.serilization;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Player implements Serializable
{
	private int id;
	private String name;
	private double run;
	
	public Player(int id,String name,double run)
	{
		this.id=id;
		this.name=name;
		this.run=run;
	}
	@Override
	public String toString()
	{
		return "\n Id "+this.id+
				"\n name "+this.name+
				"\n run "+this.run;
	}
}
