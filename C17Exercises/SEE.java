import java.util.Scanner;

class SEE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the air temperature?");
        float tair = scan.nextFloat();
        System.out.println("What is the steam temperature?");
        float tsteam = scan.nextFloat();
        float eff = 0;
        if (tsteam < 373){
            eff = 0;}
        else {
            eff = 1 - (tair / tsteam);}
        System.out.println("The efficiency is: " + eff);
    }
}