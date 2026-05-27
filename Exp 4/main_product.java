class Product {
    void getDiscount(double price) {
        System.out.println();
        double res = price - price * 0.1;
        System.out.println();
        System.out.println("Applied discount    : 10%");
        System.out.println("Price before discount : " + price);
        System.out.println("Price after discount  : " + res);
    }
}

class electronics extends Product{

    void getDiscount(double price) {
        System.out.println();
        double res = price - price * 0.2;
        System.out.println();
        System.out.println("Applied discount    : 20%");
        System.out.println("Price before discount : " + price);
        System.out.println("Price after discount  : " + res);
    }
}

class clothing extends Product{

    void getDiscount(double price) {
        System.out.println();
        double res = price - price * 0.5;
        System.out.println();
        System.out.println("Applied discount    : 50%");
        System.out.println("Price before discount : " + price);
        System.out.println("Price after discount  : " + res);
    }
}

public class main_product {
    public static void main(String[] args) {
        Product p=new Product();
        electronics e=new electronics();
        clothing c=new clothing();

        p.getDiscount(999);
        e.getDiscount(999);
        c.getDiscount(999);
    }
}
