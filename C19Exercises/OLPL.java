import java.util.Scanner;

class OLPL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        String str = scan.nextLine();

        double len = str.length();
        int count = 0;

        while (count < len){
            System.out.println(str.charAt(count));
            count ++;
        }
    }
}