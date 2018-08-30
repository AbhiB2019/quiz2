import java.util.Scanner;

class HM {
    public static void main(String[] args) {
        double x;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter X");
        x = scan.nextInt();

        double y;
        System.out.println("Enter Y");
        y = scan.nextInt();

        double a = (x + y) / 2.0;
        double h = 2.0 / ((1 / x) + (1 / y));

        System.out.println("Arithmetic mean: " + a);
        System.out.println("Harmonic mean: " + h);
    }
}