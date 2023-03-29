package Com.Aggregation;
import java.util.Date;
public class User 
{
	private String userid;
	private String name;
	private Date DOB;
	private Address address;
	
	public User(String userid,String name,Date DOB,Address address)
	{
		this.userid=userid;
		this.name=name;
		this.DOB=DOB;
		this.address=address;
	}
	@Override
	public String toString()
	{
		return "\n userid"+userid+
				"\n name"+name+
				"\n DOB"+DOB+
				"\n Fulladdress"+address;
	}
	
	

}
