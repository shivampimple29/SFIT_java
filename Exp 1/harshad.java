import java.util.*;
public class harshad{
	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number :");
	int num=sc.nextInt();
	int var2=num;
	int sum=0,var;
	while(num>0){
		var=num%10;
		sum+=var;
		num/=10;
	}
	if(var2%sum==0){
		System.out.println(var2+" is a Harshad(Niven) Number!");
	}
	else{
		System.out.println(var2+" is NOT a Harshad(Niven) Number!");
	}
}
}