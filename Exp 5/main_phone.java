import java.util.*;

class phone {

    void end() {
        System.out.println("ending the call...");
        System.out.println("Call ended successfully!");
    }

    void call(String number) {
        System.out.println("calling +91 " + number + " ...");
        System.out.println("calling +91 " + number + " ...");
        System.out.println("calling +91 " + number + " ...");
        System.out.println("Say 'Hello' to start conversation");
        end();
    }

    void call(String number, int duration) {
        System.out.println("calling +91 " + number + " ...");
        System.out.println("calling +91 " + number + " ...");
        System.out.println("calling +91 " + number + " ...");
        System.out.println("Say 'Hello' to start conversation");
        end();
        System.out.println("Call lasted for " + duration + " min");
    }
}

class smartphone extends phone {
    void call(String number) {
        System.out.println("video calling +91 " + number + " ...");
        System.out.println("video calling +91 " + number + " ...");
        System.out.println("video calling +91 " + number + " ...");
        System.out.println("Say 'Hello' to start conversation");
        end();
    }
}

public class main_phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        phone p = new phone();
        smartphone sp = new smartphone();

        while (true) {

            System.out.println();
            System.out.print("Enter the number to call :");
            String n = sc.nextLine();
            System.out.println();
            System.out.println("-----------------MENU-----------------");
            System.out.println("1.voice call");
            System.out.println("2.voice call + duration");
            System.out.println("3.video call");
            System.out.println("4.Quit");
            System.out.print("Enter a option :");
            int option = sc.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    p.call(n);
                    break;

                case 2:
                    p.call(n, 5);
                    break;

                case 3:
                    sp.call(n);
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