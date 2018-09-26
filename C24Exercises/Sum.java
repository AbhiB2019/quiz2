import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n = scan.nextDouble();
        double total = 0;
        double nsquared = n * n;
        double total2 = 0;
        for (int count = 1; count <= n; count = count + 2){
            total = total + count; 
        }
        for (int count = 1; count <= nsquared; count = count + 2){
            total2 = total + count;
        }
        System.out.println("From 1 to N: " + total);
        System.out.println("From 1 to N Squared: " + total2);
    }
}