import java.util.Scanner;

class AAC {
    public static void main(String[] args) {
        double in;
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter cost per kilowatt-hour in cents ");
        int cost = scan.nextInt();

        double inyear;
        Scanner scan2 = new Scanner( System.in );
        System.out.println("Enter kilowatt-hours used per year ");
        int year = scan2.nextInt();

        System.out.println("Annual cost: " + (cost / 100.0) * year);

    }
}