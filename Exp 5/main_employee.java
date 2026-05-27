import java.util.*;

class employee {

    void calculateSalary(double basic) {
        double res = 12 * basic;
        System.out.println(res + " LPA");
    }

    void calculateSalary(double basic, double bonus) {
        double res = 12 * basic + bonus;
        System.out.println(res + " LPA");
    }
}

class manager {

    void calculateSalary(double basic, double bonus, double allowance) {
        double res = 12 * basic + bonus + allowance;
        System.out.println(res + " LPA");
    }
}

public class main_employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee e = new employee();
        manager m = new manager();

        System.out.print("Enter the salary in Lacs per month :");
        Double n = sc.nextDouble();
        while (true) {

            System.out.println();
            System.out.println("-----------------MENU-----------------");
            System.out.println("1.Basic Salary");
            System.out.println("2.Basic Salary with 8% Bonus");
            System.out.println("3.Basic Salary with 8% Bonus and 50% Allowance");
            System.out.println("4.Quit");
            System.out.print("Enter a option :");
            int option = sc.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    e.calculateSalary(n);
                    break;

                case 2:
                    e.calculateSalary(n, n * 0.08);
                    break;

                case 3:
                    m.calculateSalary(n, n * 0.08, n / 2);
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
