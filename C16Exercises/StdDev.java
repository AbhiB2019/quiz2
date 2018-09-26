import java.util.Scanner;

class StdDev{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers are to follow?");
        double n = scan.nextDouble();

        double count = 0;
        double total = 0;
        double totalsquared = 0;

        while (count < n){
            System.out.println("Enter integer: ");
            double num = scan.nextDouble();
            total = total + num;
            totalsquared = totalsquared + num*num;
            count ++;
        }
        double avg = total / n;
        double avgsquare = totalsquared / n;
        double StdDev = Math.sqrt(avgsquare - (avg*avg));
        
        System.out.print("The standard deviation is: " + StdDev);
    }
}