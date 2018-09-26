import java.util.Scanner;

class TestAverage {

    public static void main(String[] args) {
        
        double max = 0;
        double min = 1000;
        double total = 0;
        int count = 0;
        String str = "a";
        
        while (str.length() != 0){

            Scanner scan = new Scanner(System.in);
            System.out.println("What is the score?");
            str = scan.nextLine();

            if (str.equals("")) {
                break;
            }
            int score = Integer.valueOf(str);

            if (score > max){
                max = score;
            }
            if (score < min) {
                min = score;
            }
            count ++;
            total = total + score;
        }

        total = total - max - min;

        double avg = 0;
        avg = total / (count - 2);

        System.out.println("The average is: " + avg);


    }




}
