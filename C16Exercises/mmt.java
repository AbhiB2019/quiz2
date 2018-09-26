import java.util.Scanner;

class MMT {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your age?");
		double age = scan.nextDouble();
		System.out.println("What is the time on a 24 hour clock?");
		double time = scan.nextDouble();

		if (age > 13 && time < 1700) {
			System.out.println("Your ticket costs $5.00");}
		if (age > 13 && time > 1700){
			System.out.println("Your ticket costs $8.00");}
		if (age < 13 && time < 1700){
			System.out.println("Your ticket costs $2.00");}
		if (age < 13 && time > 1700){
			System.out.println("Your ticket costs $4.00");}
	}
}