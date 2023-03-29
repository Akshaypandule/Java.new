package Com.Priorityqueue;
import java.util.Comparator;
import Com.Exception.*;


public class ProductComparator implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		//
		return (int) (o1.getprice() -o2.getprice());
	}
	

}
