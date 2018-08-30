import java.util.Scanner;

class Bobs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of bolts: ");
        double bolts = scan.nextDouble();
        System.out.print("Number of nuts: ");
        double nuts = scan.nextDouble();
        System.out.println("Number of washers: ");
        double wash = scan.nextDouble();

        if (nuts <= bolts){
            System.out.println("Check the Order: too few nuts.");}
        else if (wash <= 2 * bolts){
            System.out.println("Check the Order: too few washers.");}
        else{
            System.out.println("Order is OK.");}
        System.out.println("Total Cost: " + (5 * bolts + 3 * nuts + wash) + " cents.");

    }
}