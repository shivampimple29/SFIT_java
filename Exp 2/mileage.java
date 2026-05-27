import java.util.*;

public class mileage{
    
        public static void input(int num[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  mileage in km/hr:");
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print("car " + (i + 1) + " : ");
            num[i] = sc.nextInt();
        }
    }

    public static void display(int num[]) {
        System.out.println("Car rental service's records are:");
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.println("car " + (i + 1) + " : "+num[i]+" km/hr");

        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of cars :");
        int n = sc.nextInt();
        System.out.println();
        int arr[] = new int[n];
        input(arr);
        System.out.println();
        display(arr);

    }

}