import java.util.Scanner;

class Area {
    public static void main (String[] args) {
        String inarea;
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter radius ");
        int radius = scan.nextInt();
        System.out.println("Input the radius: " + radius + " The area is: " + (Math.PI * radius * radius) );
    }
}