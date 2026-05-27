import java.util.*;
public class evenodd{
	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a date :");
	int num=sc.nextInt();
	if(num%2==0){
		System.out.println("go to Hall Auditorium");
	}
	else{
		System.out.println("go to TPO Room");
	}
}
}