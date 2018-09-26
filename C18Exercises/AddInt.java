import java.util.Scanner;

class AddInt{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double total = 0;
        
        System.out.println("Enter first integer (enter 0 to quit).");
        double num = scan.nextDouble();
        total = total + num;
        if (num != 0){
            while (num != 0){
                System.out.println("Enter an integer (or 0 to quit).");
                num = scan.nextDouble();
                total = total + num;
                if (num == 0){
                    break;
                }
         
                    
                }
            }
            System.out.println("Sum of integers: " + total);
        }
    }
