import java.util.Scanner;

class Tire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input right front pressure:");
        double rifro = scan.nextDouble();
        System.out.println("Input left front pressure: ");
        double lefro = scan.nextDouble();
        System.out.println("Input right rear pressure: ");
        double riback = scan.nextDouble();
        System.out.println("Input left rear pressure: ");
        double leback = scan.nextDouble();
        if (leback != riback){
            System.out.println("Inflation is not OK.");}
        else if (rifro != lefro){
            System.out.println("Inflation is not OK");}
        else{
            System.out.println("Inflation is OK.");}
    }
}