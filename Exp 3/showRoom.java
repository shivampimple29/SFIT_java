import java.util.*;

class Vehicle {
    String brand;
    String model;

    Vehicle() {
        brand = "Unknown";
        model = "Unknown";
    }

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void display() {
        System.out.println("Vehicle -> Brand: " + brand + " | Model: " + model);
    }
}

class Car extends Vehicle {
    String fuelType;

    Car() {
        super();
        fuelType = "Petrol";
    }

    Car(String brand, String model, String fuelType) {
        super(brand, model);
        this.fuelType = fuelType;
    }

    void display() {
        System.out.println("Car -> Brand: " + brand + " | Model: " + model + " | Fuel: " + fuelType);
    }
}

public class showRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle brand: ");
        String vBrand = sc.nextLine();
        System.out.print("Enter vehicle model: ");
        String vModel = sc.nextLine();
        Vehicle v1 = new Vehicle(vBrand, vModel);

        System.out.print("Enter car brand: ");
        String cBrand = sc.nextLine();
        System.out.print("Enter car model: ");
        String cModel = sc.nextLine();
        System.out.print("Enter fuel type (Petrol/Diesel/Electric/CNG): ");
        String cFuel = sc.nextLine();
        Car c1 = new Car(cBrand, cModel, cFuel);

        Car c2 = new Car(c1.brand, c1.model, c1.fuelType);

        v1.display();
        c1.display();
        c2.display();
    }
}
