import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double area = 0;
        double x1 = 0;
        double x2 = 0;
        double y1 = 0;
        double y2 = 0;
        boolean done = false;

        while (!done){
            System.out.println("First corner X coordinate: ");
            x1 = scan.nextDouble();
            System.out.println("First corner Y coordinate: ");
            y1 = scan.nextDouble();
            System.out.println("Second corner X coordinate: ");
            x2 = scan.nextDouble();
            System.out.println("Second corner Y coordinate: ");
            Y2 = scan.nextDouble();
            if ((x2 - x1) == 0 || (y2 - y1 == 0)){
                break;
            }
            else{
                System.out.println("Width: " + (x2 - x1));
                System.out.println("Height: " + (y2 - y1));
                System.out.println("Area: " + ((x2 - x1) * (y2 - y1)));
            }
        }
    }
}