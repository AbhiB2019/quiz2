import java.util.Scanner;

class Log {
    public static void main(String[] args) {   

        String insec;
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter a double ");
        double dub = scan.nextInt();

        double b = Math.log(dub) / Math.log(2);

        System.out.println("Base 2 log of " + dub + " is " + b);
    }
}