abstract class Vehicle1 {
    void rental_cost() {
        System.out.println("General rental cost : 50 Rs / Hr");
    }
}

class Bike1 extends Vehicle1 {
    void rental_cost() {
        System.out.println();
        super.rental_cost();
        System.out.println("Bike's rental cost  : 70 Rs / Hr");
    }
}

class Car1 extends Vehicle1 {
    void rental_cost() {
        System.out.println();
        super.rental_cost();
        System.out.println("Car's rental cost   : 100 Rs / Hr");
    }
}

public class main_vehicle1 {
    public static void main(String[] args) {
        Vehicle1 v1 = new Bike1();
        Vehicle1 v2 = new Car1();

        System.out.println("vehicle type | Bike :");
        v1.rental_cost();
        System.out.println();
        System.out.println("vehicle type | Car  :");
        v2.rental_cost();

    }
}
