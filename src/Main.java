import java.util.Scanner;

public class Main {

   /* Write a program that asks the user to enter their birth month (integer 1 – 12 inclusive). If the user enters a
    value in the range, the program echoes the input (“Your birth month is: N”). If the value is not in the range it
    outputs an error message (“You entered an incorrect month value: N”).   Here N should be the value they entered.
    You DO NOT have to return the birth month itself, just the number of the month.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month;
        System.out.print("Enter your birth month (1-12): ");
        month = scan.nextInt();
        if (month >= 1 && month <= 12){
            System.out.println("Your birth month is: " + month);
        } else {
            System.out.println("You entered an incorrect month value: " + month);
        }

    }
}