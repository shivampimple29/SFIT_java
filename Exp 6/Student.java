package university;

import java.util.*;

public class Student {

	public static void calculateAverage(int a[]) {

		int avg, summ = 0;
		for (int i = 0; i < a.length; i++) {

			summ += a[i];
		}
		avg = summ / a.length;
		System.out.println(avg);
		displayResult(avg);

	}

	public static void displayResult(int avg) {

		if (avg >= 28) {

			System.out.println("PASS");
		} else {

			System.out.println("FAIL");
		}

	}

	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Student's roll number :");
		int rollNo=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Student's name :");
		String name=sc.nextLine();

		System.out.println("\nEnter Student's marks :\n");

		
		int marks[]=new int[5];

		for(int i=0;i<marks.length;i++){

			System.out.print("Subject "+(i+1)+" : ");
			marks[i]=sc.nextInt();
			
		}
	
		calculateAverage(marks);

	}
}