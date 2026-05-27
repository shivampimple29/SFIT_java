class hotelBooking {

    void book(int rooms) {
        System.out.println(rooms + " rooms are successfully booked!");
    }

    void book(int rooms, int days) {
        System.out.println(rooms + " rooms are successfully booked for " + days + " days");
    }

    void book(String name, int rooms, int days) {
        System.out.println(rooms + " rooms are successfully booked for " + days + " days on the name of Mr. " + name);
    }
}

public class main_hotelBooking {
    public static void main(String[] args) {
        hotelBooking h = new hotelBooking();
        System.out.println();
        h.book(2);
        h.book(2, 3);
        h.book("Shivam", 2, 3);

    }
}
