import java.util.*;
public class table{
	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number :");
	int num=sc.nextInt();
	System.out.println("Table of "+num+" :");
	for(int i=0;i<11;i++){
		System.out.println(num+" x "+i+" = "+num*i);
	}
	
	
}
}



console.log(Math.floor(Math.random()*10+1));