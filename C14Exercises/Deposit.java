import java.util.Scanner;

class Deposit {
    public static void main(String[] args) {
        
        double p;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter initial deposit");
        p = scan.nextDouble();

        double r;
        Scanner scan2 = new Scanner (System.in);
        System.out.println("Enter interest rate as a fraction");
        r = scan.nextDouble();

        double n;
        Scanner scan3 = new Scanner (System.in);
        System.out.println("Enter the number of times per year the interest rate is calculated");
        n = scan.nextDouble();

        double t;
        Scanner scan4 = new Scanner (System.in);
        System.out.println("Enter the number of years");
        t = scan.nextDouble();

        double a = p * (1 + (r / n));
        double b = n * t;
        double c = Math.pow(a, b);

        System.out.println("Initial deposit: " + p);
        System.out.println("Interest rate: " + r);
        System.out.println("Times per year: " + n);
        System.out.println("Number of years: " + t);
        System.out.println("Value: " + c);



    }
}