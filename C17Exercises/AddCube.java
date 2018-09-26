import java.util.Scanner;

class AddCube{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Upper limit:");
        double n = scan.nextDouble();
        
        double count = 1;
        double squaretotal = 0;
        double cubetotal = 0;
        while (count <= n){
            squaretotal = squaretotal + (count * count);
            cubetotal = cubetotal + (count * count * count);
            count ++;
        }
        System.out.println("The sum of squares is " + squaretotal);
        System.out.println("The sum of cubes is " + cubetotal);
    }
}