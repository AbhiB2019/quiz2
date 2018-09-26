import java.util.Scanner;

class JetLag{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many hours did you travel?");
        double hours = scan.nextDouble();
        System.out.println("How many time zones did you cross?");
        double zone = scan.nextDouble();
        System.out.println("When did you leave? Enter using a 24 hour clock.");
        double departuretm = scan.nextDouble();
        double departurehr = 0;
        
        if (departuretm >= 8 && departuretm < 12){
            departurehr = 0;
        }
        else if (departuretm >= 12 && departuretm < 18){
            departurehr = 1;
        } 
        else if (departuretm >= 18 && departuretm < 22){
            departurehr = 3;
        }
        else if (departuretm >= 22 && departuretm < 24){
            departurehr = 4;
        }
        else if (departuretm == 24 || departuretm < 1){
            departurehr = 4;
        }
        else if (departuretm >= 1 && departuretm < 8){
            departurehr = 5;
        }

        System.out.println("When did you arrive? Enter using a 24 hour clock.");
        double arrivaltm = scan.nextDouble();
        double arrivalhr = 0;
        if (arrivaltm >= 8 && arrivaltm < 12){
            arrivalhr = 4;
        }
        else if (arrivaltm >= 12 && arrivaltm < 18){
            arrivalhr = 2;
        } 
        else if (arrivaltm >= 18 && arrivaltm < 22){
            arrivalhr = 0;
        }
        else if (arrivaltm >= 22 && arrivaltm < 24){
            arrivalhr = 1;
        }
        else if (arrivaltm == 24 || arrivaltm < 1){
            arrivalhr = 1;
        }
        else if (arrivaltm >= 1 && arrivaltm < 8){
            arrivalhr = 3;
        }

        double recovery = ((hours / 2) + (zone - 3) + departurehr + arrivalhr)/10;
        System.out.println("You will need " + recovery + " days to recover.");
    }
}