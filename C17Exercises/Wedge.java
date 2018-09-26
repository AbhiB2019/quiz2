import java.util.Scanner;

class Wedge{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Initial number of stars: ");
        double n = scan.nextDouble();

        while (n > 0){
            double i = 0;
            String str = "";
            while (i < n){
                str = str + "*";
                i ++;
            }
            System.out.println(str);
            n--;   
        }
    }
}