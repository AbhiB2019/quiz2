import java.util.Scanner;
import java.lang.Math;

class quiz2 {
    public static void main(String[] args) {
        boolean turn = true;
        
        boolean r1 = true;
        boolean r2 = false;
        boolean r3 = false;
        
        int die1 = 0;
        int die2 = 0;
        int die3 = 0;

        while (turn){
            int tally = 0;
            int countroll = 0;
            while (r1){
                die1 = (int) (Math.random()*6 + 1);
                die2 = (int) (Math.random()*6 + 1);
                die3 = (int) (Math.random()*6 + 1);
                System.out.println("Roll: " + countroll);
                System.out.println(die1);
                System.out.println(die2);
                System.out.println(die3);
                countroll ++;
                int value = die1 + die2 + die3;
                if (countroll % 3 == 0){
                    tally = tally - value;
                }
                else{
                    tally = tally + value;
                }
                if (die1 == die2 && die2 == die3){
                    r2 = true;
                    r1 = false;
                    System.out.print("Tally after round 1: " + tally);
                    break;
                }
            }
            int total = die1 + die2 + die3;
            while (r2){
                for(int count = 0; count < total; count ++){
                    die1 = (int) (Math.random()*6 + 1);
                    die2 = (int) (Math.random()*6 + 1);
                    die3 = (int) (Math.random()*6 + 1);
                    System.out.println("Roll: " + countroll);
                    System.out.println(die1);
                    System.out.println(die2);
                    System.out.println(die3);
                    int value = die1 * die2 * die3;
                    tally = tally + value;
                    countroll ++;
                }
                System.out.println("Tally after round 2: " + tally);
                r3 = true;
                r2 = false;
                break;
            }
            while (r3){
                System.out.print("Do you wish to retire? Enter 'Yes' to retire and anything else to not.");
                String retire = scan.nextLine();
                if 
                die1 = (int) (Math.random()*6 + 1);
                die2 = (int) (Math.random()*6 + 1);
                die3 = (int) (Math.random()*6 + 1);
                System.out.println("Roll: " + countroll);
                System.out.println(die1);
                System.out.println(die2);
                System.out.println(die3);
            }

            
        }
    }
}