import java.util.Scanner;
import java.lang.Math;

class WCI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Wind Speed: ");
        double wind = scan.nextDouble();
        System.out.println("Enter temperature: ");
        double temp = scan.nextDouble();
        double wc = 35.74 + 0.6215 * temp - 35.75 * Math.pow(wind, 0.16) + 0.4275 * temp * Math.pow(wind, 0.16);
        if (wind < 3){
            System.out.println("The wind chill is " + temp);}
        else if (temp > 50){
            System.out.println("The wind chill is " + temp);}
        else{
            System.out.println("The wind chill is " + wc);}
    }
}