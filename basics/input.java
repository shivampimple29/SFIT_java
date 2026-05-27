import java.util.*;
public class input{
	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your name        :");
	String name=sc.nextLine();
	System.out.print("Enter your Roll number :");
	int roll=sc.nextInt();
	System.out.print("Enter your CGPA        :");
	float cgpa=sc.nextFloat();
	System.out.println("--------------------------Candidate's Info--------------------------\n\n");
	System.out.println("Candidate's Name       :"+name);
	System.out.println("Candidate's Roll Number:"+roll);
	System.out.println("Candidate's CGPA       :"+cgpa);
	}
}