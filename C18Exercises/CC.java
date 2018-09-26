import java.util.Scanner;

class CC{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much do you have in your checkings account?");
        double checka = scan.nextDouble();
        System.out.println("How much do you have in your savings account?");
        double save = scan.nextDouble();
        System.out.println("How many checks are you writing?");
        double check = scan.nextDouble();
        if (checka > 1000 || save > 1500){
            System.out.println("There is no charge for your checks.");}
        else {
            System.out.println("Your service charge is $" + 0.15 * check);}
    }
}