package Com.Innerclass_bill;

public class Totalbill 
{
	
	static void calculatediscount(int totalbill)
	{
		int discountpercent=10;
		
		
		class discountedtotalbill
		{
			int actualbill;
			int discountbill;
			
			
			public void discountedbill(int actualbill)
			{
				this.actualbill=actualbill;
			}
			public void calculate()
			{
				this.discountbill=this.actualbill-(this.discountbill*discountpercent/100);
			}
			 public int getActualbill()
			{
				return actualbill;
			}
			public int getDiscountedbill()
			{
				return discountbill;
			}
			
		}
		discountedtotalbill b=new discountedtotalbill();	
		System.out.println(b.actualbill);
		System.out.println(b.discountbill);
	
	}
	

}
