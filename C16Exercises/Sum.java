import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N");
        double n = scan.nextDouble();

        double count = 1;
        double total = 0;

        while (count <= n){
            total = total + (1/count);
            count ++;
        }

        System.out.println("Sum is " +  total);

    }
}