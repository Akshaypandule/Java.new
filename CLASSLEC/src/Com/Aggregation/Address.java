package Com.Aggregation;

public class Address 
{
    private String Apt_name;
    private String Flat_no;
    private String street;
    private String City;
    private int pincode;
    private String state;
    
    public Address(String Apt_name,String Flat_no,String street,String City,int pincode,String state)
    {
    	this.Apt_name=Apt_name;
    	this.Flat_no=Flat_no;
    	this.street=street;
    	this.City=City;
    	this.pincode=pincode;
        this.state=state;
    }
    public String toString()
    {
    	return "\n Apt_name"+Apt_name+
    			"\n Flat_no"+Flat_no+
    			"\n street"+street+
    			"\n city"+City+
    			"\n pincode"+pincode+
    			"\n state"+state;
    }

}
