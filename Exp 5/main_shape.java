import java.util.*;

class shape {

    int area(int side) {
        int res = side * side;
        System.out.println("Area of " + side + " is " + res);
        return res;
    }
    
    int area(int length, int breadth) {
        int res = length * breadth;
        System.out.println("Area of " + length + " and " + breadth + " is " + res);
        return res;
    }

    double area(double side) {

        double res = side * side;
        System.out.println("Area of " + side + " is " + res);
        return res;
    }
}

public class main_shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        shape s = new shape();

        while (true) {
            System.out.println();
            System.out.println("-----------------MENU-----------------");
            System.out.println("1.int area (int side)");
            System.out.println("2.int area(int length, int breadth)");
            System.out.println("3.double area (double side)");
            System.out.println("4.Quit");
            System.out.print("Enter a option :");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter a integer value :");
                    int a = sc.nextInt();
                    s.area(a);
                    break;

                case 2:
                    System.out.print("Enter length value :");
                    int l = sc.nextInt();
                    System.out.print("Enter breadth value :");
                    int b = sc.nextInt();
                    s.area(l, b);
                    break;

                case 3:
                    System.out.print("Enter a double value :");
                    double d = sc.nextDouble();
                    s.area(d);
                    break;

                case 4:
                    System.out.println("Quitting...");
                    return;

                default:
                    System.out.println("INVALID INPUT! TRY AGAIN!");
                    break;

            }

        }
    }

}
