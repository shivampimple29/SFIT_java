class Student_ {

    final int total = 210;

    final void displayResult(int credit) {
        double cgpa = (credit / (double) total) * 10.0;
        System.out.println("total credits     : " + total);
        System.out.println("credits earned    : " + credit);
        System.out.printf("CGPA              : %.2f", cgpa);
    }
}

public class grade {
    public static void main(String[] args) {
        Student_ s = new Student_();

        s.displayResult(204);
        // s.total=200; (Cant use this since value of total has been finalized!)

    }
}
