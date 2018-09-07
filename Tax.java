import java.util.Scanner;

class Tax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your income?");
        double income = scan.nextDouble();
        System.out.println("How many kids do you have?");
        double kids = scan.nextDouble();
        System.out.println("What is your age?");
        double age = scan.nextDouble();
        double tax = 0;
        double upkids = kids - 2;
        int tier = 0;
        if (income < 10000){
            tax = income * 0;
            tier = 1; 
        }
        else if (income >= 10000 && income < 25000){
            tax = income * 0.1;
            tier = 2;
        }
        else if (income >= 25000 && income < 75000){
            tax = income * 0.2;
            tier = 3;
        }
        else if (income >= 75000 && income < 250000){
            tax = income * 0.3;
            tier = 4;
        }
        else{
            tax = income * 0.4;
            tier = 5;
        }
        if (kids > 0){
            tax = tax - 1000;
        }
        if (kids >= 3){
            tax = tax - upkids * 500;
        }
        if (age > 0 && age <= 15){
            tax = tax * 0.5;
        }
        else if (age > 15 && age <= 21){
            tax = tax * 0.75;
        }
        else if (age > 21 && age <= 63){
            tax = tax * 1;
        }
        else if (age > 63 && age <= 72){
            tax = tax * 0.66;
        }
        else if (age > 72 && age <= 80){
            tax = tax * 0.44;
        }
        else if (age > 80){
            tax = tax * 1;
        }
        if (tier = 1){
            if (tax > 0){
                tax = tax;
            }
            else if (0 > tax){
                tax = 0;
            }
        }
        if (tier = 2){
            if (tax > 10000){
                tax = tax;
            }
            else if (10000 > tax){
                tax = 10000;
            }
        } 
        if (tier = 3){
            if (tax > 25000){
                tax = tax;
            }
            else if (25000 > tax){
                tax = 25000;
            }
        }
        if (tier = 4){
            if (tax > 75000){
                tax = tax;
            }
            else if (75000 > tax){
                tax = 75000;
            }
        }
        if (tier = 250000){
            if (tax > 250000){
                tax = tax;
            }
            else if (250000 > tax){
                tax = 250000;
            }
        }
        System.out.println("You are paying $" + tax + " in taxes.");
    }
}