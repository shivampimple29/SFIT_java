import java.util.*;

class Car {
    String brand;
    String color;
    int speed;

    void accelerate() {
        System.out.println("Accelerating...");
        speed += 10;
        System.out.println("Current speed is " + speed + " km/hr");
    }

    void brake() {
        System.out.println("Applying brakes...");
        speed -= 10;
        if (speed < 0)
            speed = 0;
        System.out.println("Current speed is " + speed + " km/hr");
    }

    void honk() {
        System.out.println("Beep! Beep!");
    }
}

public class CarApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= num; i++) {
            Car obj = new Car();

            System.out.println();
            System.out.print("Enter a car brand: ");
            obj.brand = sc.nextLine();

            System.out.print("Enter a car color: ");
            obj.color = sc.nextLine();

            System.out.print("Enter the current speed in km/hr: ");
            obj.speed = sc.nextInt();
            sc.nextLine();
            
            System.out.println();
            System.out.println("Car " + i + "'s information:");
            System.out.println("Car's brand: " + obj.brand);
            System.out.println("Car's color: " + obj.color);
            System.out.println("Car's speed: " + obj.speed);

            obj.accelerate();
            obj.brake();
            obj.honk();
        }

        sc.close();
    }
}
