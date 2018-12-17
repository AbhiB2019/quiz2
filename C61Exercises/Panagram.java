import java.io.*;
import java.util.Scanner;

class Panagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your phrase");
        String phrase = scan.nextLine();

        char alphabet[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
        for (int count = 0; count <= alphabet.length; count++){
            char alphabetSlice = alphabet[count];
            for (int i = 0; i < phrase.length(); i++){
                if (phrase.charAt(i) == alphabetSlice){
                    System.out.println("Has a " + phrase.charAt(i));
                }
                else {
                    System.out.println("Not a panagram");
                    break;
                }
            }
        }    
    }
}