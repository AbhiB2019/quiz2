import java.util.Scanner;
class Ohm {
    public static void main(String[] args) {
        String inres;
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter resistance ");
        int res = scan.nextInt();

        String invol;
        Scanner scan2 = new Scanner( System.in );
        System.out.println("Enter voltage ");
        int vol = scan2.nextInt();

        System.out.println("Current equals: " + res * vol);
    }
}