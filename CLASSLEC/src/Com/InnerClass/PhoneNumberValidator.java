package Com.InnerClass;

public class PhoneNumberValidator 
{
	private static String phoneregex="[^0-9]";
	public static void validate(String phonenumber)
	{
		int validlength=12;
		
		class PhoneNumberFormatter
		{
			private String formattedphonenumber;
			public  PhoneNumberFormatter(String phonenumber)
			{
				this.formattedphonenumber=phonenumber.replaceAll(phoneregex,"");
			}
			public boolean checklength()
			{
				if(this.formattedphonenumber.length()==validlength)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			public String getFormattedNumber()
			{
				return this.formattedphonenumber;
			}
			public String getorignalPhonenumber()
			{
				return phonenumber;
			}
		}
		PhoneNumberFormatter phonenumberformatterref=new  PhoneNumberFormatter(phonenumber);
		System.out.println("the original number is "+ phonenumberformatterref.getorignalPhonenumber());
		System.out.println("the original number is "+ phonenumberformatterref.getFormattedNumber());
		if(phonenumberformatterref.checklength())
		{
			System.out.println("valid phone number");
		}
		else
		{
			System.out.println("invalid phone number");
		}
	}
	

}
