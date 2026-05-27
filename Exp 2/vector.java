import java.util.*;

public class vector{
    private static Scanner sc = new Scanner(System.in);
    private static Vector<String> students = new Vector<>();

    public static void add() {
        System.out.print("Add a student: ");
        String st = sc.nextLine();
        students.add(st);
        System.out.println("Student added.");
    }

    public static void insert() {
        System.out.print("Insert a student: ");
        String st = sc.nextLine();
        System.out.print("Insert at index: ");
        int i = sc.nextInt();
        sc.nextLine();  // consume leftover newline
        if (i >= 0 && i <= students.size()) {
            students.add(i, st);
            System.out.println("Student inserted at index " + i);
        } else {
            System.out.println("Invalid index!");
        }
    }

    public static void delete() {
        System.out.print("Enter index to delete: ");
        int i = sc.nextInt();
        sc.nextLine();  // consume leftover newline
        if (i >= 0 && i < students.size()) {
            String removed = students.remove(i);
            System.out.println("Removed student: " + removed);
        } else {
            System.out.println("Invalid index!");
        }
    }

    public static void check() {
        System.out.print("Enter student name to check: ");
        String st = sc.nextLine();
        boolean exists = students.contains(st);
        System.out.println("Given element exists: " + exists);
    }

    public static void display() {
        System.out.println("Students List: " + students);
    }

    public static void count() {
        System.out.println("Size of the list: " + students.size());
    }

    public static void main(String[] args) {
        int op ;
        char choice='y';


        while (choice=='y') {
            System.out.println("\nMenu:");
            System.out.println("1. Add student");
            System.out.println("2. Insert student at index");
            System.out.println("3. Delete student at index");
            System.out.println("4. Check if student exists");
            System.out.println("5. Display all students");
            System.out.println("6. Count students");
            System.out.println("7. Exit");
            System.out.print("Enter option: ");
            op=sc.nextInt();

            
            
            sc.nextLine();  // consume newline

            switch (op) {
                case 1:
                    add();
                    break;
                case 2:
                    insert();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    check();
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    count();
                    break;
                default:
                    System.out.println("INVALID INPUT!");
            }
            System.out.println("Do you want to continue? :");
            choice=sc.next().charAt(0);
            
        }
    }
}
