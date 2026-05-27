import university.*;

import java.util.*;

public class Sfit{

	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);

		System.out.print("Enter Student's roll number :");
		rollNo=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Student's name :");
		name=sc.nextLine();

		System.out.println("\nEnter Student's marks :\n");

		for(int i=0;i<marks.length;i++){

			System.out.print("Subject "+(i+1)+" : ");
			marks[i]=sc.nextInt();
			
		}
	
		calculateAverage(marks);

	}

}
