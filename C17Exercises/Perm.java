import java.util.Scanner;

class Perm{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter N");
        long n = scan.nextLong();
        System.out.println("Enter R");
        long r = scan.nextLong();
        if (n < 0 || r < 0){
            System.out.println("One of your values is less than zero!");
        }
        else if (r > n){
            System.out.println("R must be less than or equal to N!");
        }
        else{
            double count = n;
            double top = 1;
            double subtract = 0;
            while (count > 0){
                top = top * (count - subtract);
                count --;
                subtract ++;
            }
            System.out.println(top);
        }
        



    }
}