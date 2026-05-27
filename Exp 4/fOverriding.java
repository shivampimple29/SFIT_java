import java.util.*;

class product{

	void getDiscount(double num){

	num*=0.1;
	System.out.println("10% discount"+num);
	}
}
	
	class electronics extends product{

			System.println("General discount is 10% :"+super.getDiscount());
			num*=0.15;
			System.out.println("Additional discount is 15% :"+num);
		
	}

	class clothing extends product{
	
	void getDiscount(double num){
	
	num*=0.2;
	System.out.println("Additional discount is 20% :"+num);
	}

	
	}




public class fOverriding{
	public static void main( String args[]){

		Scanner sc=new Scanner(System.in);
		
		product p = new product();
		electronics e = new electronics();
		clothing c = new clothing();


		System.out.print("Enter the product price :");
		double n=sc.nextDouble();


		p.getDiscount(n);
		e.getDiscount(n);
		c.getDiscount(n);
	}
}
