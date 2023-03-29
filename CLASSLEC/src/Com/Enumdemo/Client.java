package Com.Enumdemo;

public class Client {

	public static void main(String[] args) {
		/*Product p=new Product(120,"Table",1200,Category.Furniture);
		System.out.println(p);*/
		
		
		Product[] productlist=new Product[5];
		productlist[0]=new Product(1,"Table",1500,Category.Furniture);
		productlist[1]=new Product(2,"TV",45000,Category.Electronics);
		productlist[2]=new Product(3,"Cream",150,Category.Cosmetic);
		productlist[3]=new Product(4,"Fan",2000,Category.Electronics);
		productlist[4]=new Product(5,"Chairs",1500,Category.Furniture);
		
		
		for(Product list:productlist)
		{
			if(list.getcategory().equals(Category.Furniture.toString()))
			{
				System.out.println(list);
			}
		}
		for(Product list:productlist)
		{
			if(list.getcategory().equals(Category.Electronics.toString()))
			{
				System.out.println(list);
			}
		}

	}

}
