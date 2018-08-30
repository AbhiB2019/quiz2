import java.util.Scanner;

class DisPrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount of purchase: ");
        double price = scan.nextDouble();

        if (price > 10.0) {
            System.out.println("Discounted price: " + 0.9 * price);
        }else {
            System.out.println("Discounted price " + price);
        }
    }
}