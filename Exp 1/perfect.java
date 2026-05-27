import java.util.*;
public class perfect{
	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter total number of resources :");
	int num=sc.nextInt();
	int sum=0;
	for(int i=1;i<num;i++){
		if(num%i==0){
			sum+=i;
		}
	}
	if(sum==num){
		System.out.println(num+" is a Perfect Number!");
	}
	else{
		System.out.println(num+" is NOT a Perfect Number");
	}
}
}