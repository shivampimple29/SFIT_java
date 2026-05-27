import java.util.*;

class HotelRoom {
    String type;
    int price;

    HotelRoom() {
        type = "Standard";
        price = 2000;
    }

    HotelRoom(String type) {
        this.type = type;
        price = priceForType(type);
    }

    HotelRoom(String type, int price) {
        this.type = type;
        this.price = price;
    }

    HotelRoom(HotelRoom other) {
        type = other.type;
        price = other.price;
    }

    int priceForType(String type) {
        if (type == null) {
            return 2000;
        } else {
            String t = type.trim().toLowerCase();
            if (t.equals("standard")) {
                return 2000;
            } else if (t.equals("deluxe")) {
                return 3500;
            } else if (t.equals("suite")) {
                return 5000;
            } else {
                return 2000;
            }
        }
    }

    void display() {
        System.out.println("Room Type: " + type + " | Price: " + price);
    }
}

public class hotelR {
    public static void main(String[] args) {
        HotelRoom rStandard = new HotelRoom("Standard");
        HotelRoom rDeluxe = new HotelRoom("Deluxe");
        HotelRoom rSuite = new HotelRoom("Suite");

        rStandard.display();
        rDeluxe.display();
        rSuite.display();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter room type (Standard/Deluxe/Suite): ");
        String userType = sc.nextLine();
        HotelRoom userRoom = new HotelRoom(userType);
        userRoom.display();
    }
}

