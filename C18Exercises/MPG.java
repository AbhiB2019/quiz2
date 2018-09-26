import java.util.Scanner;

class MPG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean done = false;
        double initmile = 0;
        double finmile = 0;
        double gall = 0;

        while (!done){
            System.out.println("Initial miles: ");
            initmile = scan.nextDouble();
            if (initmile < 0){
                System.out.println("Bye!");
                break;
            }
            else{
                System.out.println("Final miles: ");
                finmile = scan.nextDouble();
                System.out.println("Gallons: ");
                gall = scan.nextDouble();
                double mpg = (finmile - initmile) / gall;
                System.out.println("Miles per gallon: " + mpg);
            }
        }
    }
}