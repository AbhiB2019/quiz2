import java.util.Scanner;

class Pie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your weight?");
        double w = scan.nextDouble();

        if (w < 220 || w > 280){
            System.out.println("You are not allowed to compete in the competition.");
        }
        else {
            System.out.println("You are allowed to compete in the competition.");
        }
    }
}