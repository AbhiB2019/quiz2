import java.util.Scanner;

class Age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age in years?");
        double years = scan.nextDouble();
        System.out.println("What is your age in months?");
        double months = scan.nextDouble();
        System.out.println("What is your age in days?");
        double days = scan.nextDouble();
        double mdays = 0;
        if (months == 1) {
            mdays = 31;
        }
        else if (months == 2) {
            mdays = 31 + 28;} 
        else if (months == 3) {
            mdays = 31 + 28 + 31;} 
        else if (months == 4) {
            mdays = 31 + 28 + 31 + 30;}
        else if (months == 5) {
            mdays = 31 + 28 + 31 + 30 + 31;}
        else if (months == 6) {
            mdays = 31 + 28 + 31 + 30 + 31 + 30;}
        else if (months == 7) {
            mdays = 31 + 28 + 31 + 30 + 31 + 30 + 31;} 
        else if (months == 8) {
            mdays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;}
        else if (months == 9) {
            mdays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;}
        else if (months == 10) {
            mdays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;} 
        else if (months == 11) {
            mdays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;}
        else if (months == 12) {
            mdays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;}
        double yrdays = years * 365;
        double lifedays = yrdays + mdays + days;
        double lifesec = lifedays * 24 * 60 * 60;
        System.out.println("Your age in seconds is: " + lifesec);                  
    }
}