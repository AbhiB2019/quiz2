import java.util.Scanner;

class Bday{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many guests?");
        double n = scan.nextDouble();
        double prob = 1;
        for (int count = 1; count <= n; count ++){
            prob = prob * ((365 - (n - 1)) / 365);   
        }
        System.out.println("Probability: " + prob);
    }
}