import java.util.Scanner;

class Height {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your height in feet?");
        int feet = scan.nextInt();
        System.out.println("What is your height in inches?");
        int inches = scan.nextInt();

        height(feet, inches);

    }
    public static void height(int feet, int inches){
        int totalInch = inches + feet * 12;
        System.out.println("Your height in inches: " + (inches + feet * 12));
        System.out.println("Your height in meters: " + totalInch * 0.0254);
    }
    
}