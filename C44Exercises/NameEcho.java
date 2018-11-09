import java.util.Scanner;
import java.io.*;

class NameEcho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        int length = name.length();
        int place = 0;
        
        for (int i = 0; i < length; i++){
            char slice = name.charAt(i);
            place = i;
            if (slice == ' '){
                break;
            }
        }
        String firstWord = name.substring(0, place);
        String toBeCapitalized = name.substring(place, length);
        String lastWord = toBeCapitalized.toUpperCase();
        System.out.println(firstWord + lastWord);
        
    }
}