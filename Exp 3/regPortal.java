import java.util.*;

class reg {

    String name;
    int age;

    reg() {
        this("Unknown", 0);
    }

    reg(String n, int a) {
        name = n;
        age = a;
    }

    reg(reg r) {
        name = r.name;
        age = r.age;
    }

    void display() {
        System.out.println("name : " + name + " | age : " + age);
    }
}

public class regPortal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String userName = sc.nextLine();

        System.out.print("Enter age: ");
        int userAge = sc.nextInt();
        System.out.println();

        reg r1 = new reg();
        reg r2 = new reg(userName, userAge);
        reg r3 = new reg(r2);

        r1.display();
        r2.display();
        r3.display();
    }
}
