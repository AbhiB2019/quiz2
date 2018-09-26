import java.util.Scanner;

class Adder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Low end of range:");
        double low = scan.nextDouble();
        System.out.println("High end of range:");
        double high = scan.nextDouble();
        
        boolean done = false;
        double inrange = 0;
        double outrange = 0;
        
        while (!done){
            System.out.println("Enter data: ");
            double num = scan.nextDouble();
            if (num == 0){
                break;
            }
            else {
                if (num > high || num < low){
                    outrange = outrange + num;
                }
                else {
                    inrange = inrange + num;
                }
            }
        }
        System.out.println("Sum of in range values: " + inrange);
        System.out.println("Sum of out of range values: " + outrange);
    }
}
