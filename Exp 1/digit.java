import java.util.*;
public class digit{
	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter barcode of your book :");
	int num=sc.nextInt();
	int var2=num;
	int sum=0,var;
	while(num>0){
		var=num%10;
		sum+=var;
		num/=10;
	}
	System.out.println("Sum of digit of "+var2+ " :"+sum);
}
}