import java.util.Scanner;


class SumOfSquares{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n = scan.nextDouble();

        double a = 1;
        double b = 1;
        double guess = 0;
        boolean done = false;
        boolean printed = false;

        while (!done){
            while ((a * a) < n){
                guess = (a * a) + (b * b);
                if (guess == n){
                    System.out.println("Your value is a sum of squares.");
                    printed = true;
                    break;
                }
                a++;
            }
            guess = (a * a) + (b * b);
            if (guess == n){
                if (printed == false){
                    System.out.println("Your value is a sum of squares.");
                    break;
                }
                else{
                    break;
                }
            }
            else if ((b * b) >= n){
                System.out.println("Your value is not a sum of squares.");
                break;
            }
            b++;
        }
    }
}