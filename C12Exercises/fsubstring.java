import java.util.Scanner;
class fsubstring {
    public static void main(String[] args) {
        String ins;
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter a string ");
        String str = scan.nextLine();

        String inbeg;
        Scanner scan2 = new Scanner( System.in );
        System.out.println("Enter the beginning index ");
        int beg = scan2.nextInt();

        String inend;
        Scanner scan3 = new Scanner( System.in );
        System.out.println("Enter the ending index ");
        int end = scan3.nextInt();

        System.out.println("Original string: " + str + " Substring: " + str.substring(beg, end) );
    }
}