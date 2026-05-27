import java.util.*;

public class compress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        StringBuilder compressed = new StringBuilder();

        int count = 1;
        for (int i = 0; i < str.length(); i++) {

            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {

                compressed.append(str.charAt(i));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1; 
            }
        }

        System.out.println("Compressed string: " + compressed.toString());
        sc.close();
    }
}
