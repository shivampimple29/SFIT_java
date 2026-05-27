import java.util.*;

class BankAccount {
    String type;
    int balance;
    String name;

    BankAccount() {
        this("Savings", 0, "Unknown");
    }

    BankAccount(String type) {
        this(type, 0, "Unknown");
    }

    BankAccount(String type, int balance) {
        this(type, balance, "Unknown");
    }

    BankAccount(String type, int balance, String name) {
        this.type = type;
        this.balance = balance;
        this.name = name;
    }

    void display() {
        System.out.println("Account -> Type: " + type + " | Balance: " + balance + " | Name: " + name);
    }
}

public class bankAcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account type: ");
        String t = sc.nextLine();

        System.out.print("Enter initial balance: ");
        int b = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder name: ");
        String n = sc.nextLine();

        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount(t);
        BankAccount a3 = new BankAccount(t, b);
        BankAccount a4 = new BankAccount(t, b, n);

        a1.display();
        a2.display();
        a3.display();
        a4.display();
    }
}


