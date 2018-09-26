import java.util.Scanner;

class E1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start: ");
        double start = scan.nextDouble();
        System.out.println("Enter end: ");
        double end = scan.nextDouble();
        double count = start;
        while (count >= start && count <= end){
            System.out.println(count);
            count = count + 1;
        }
    }
}