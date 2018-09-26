import java.util.Scanner;

class Dump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the weight of your trash?");
        int weight = scan.nextInt();
        int oweight = (weight - 200) / 100;
        int price = 0;
        if (weight <= 200) {
            price = 20;}
        else {
            price = 20 + oweight * 8;}
        
        System.out.println("The price is " + price);
        
        
    }
}