import java.util.Scanner;

class AddInt{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many integers will be added?");
        double number = scan.nextDouble();
        
        double count = 0;
        double total = 0;
        while (count < number){
            System.out.println("Enter an integer:");
            double add = scan.nextDouble();
            total = total + add;
            count = count + 1;
        }
        System.out.println("Your total is " + total);
    }
}