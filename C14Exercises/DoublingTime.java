import java.util.Scanner;

class DoublingTime {
    public static void main(String[] args) {
        
        double d;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter amount of money");
        d = scan.nextDouble();

        double i;
        Scanner scan2 = new Scanner (System.in);
        System.out.println("Enter interest rate");
        i = scan.nextDouble();

        double c = d / i;

        System.out.println("It will take approximately " + c + " years to double your amount of money.");
    }
}