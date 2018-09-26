import java.util.Scanner;

class E2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.nextLine();
        double length = word.length();
        double count = 0;
        while (count < length){
            System.out.println(word);
            count = count + 1;
        }
    }
}