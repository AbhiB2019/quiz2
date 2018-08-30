import java.util.Scanner;
class Brick {
    public static void main(String[] args) {
        double insec;
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter the number of seconds ");
        int sec = scan.nextInt();

        System.out.println("Distance: " + (0.5 * 32.1274 * sec * sec));
    }
}