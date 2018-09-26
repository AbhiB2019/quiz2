import java.util.Scanner;

class E3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word: ");
        String word1 = scan.nextLine();
        System.out.println("Enter your second word: ");
        String word2 = scan.nextLine();

        double len1 = word1.length();
        double len2 = word2.length();
        
        double count = 30 - len1 - len2;
        double count2 = 0;
        
        System.out.println(word1);
        
        while (countBr2 < count){
            System.out.println(".");
            count2 = count2 + 1;
        }
        
        System.out.println(word2);
    }
}