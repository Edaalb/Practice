package bootcamp.day_15;

import java.util.Scanner;

public class Day15_SumOfDigits {

    // Find the sum of digits of the number received from the user using the while loop.

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter numbers");
        int number= scan.nextInt();
        int onesDigit=0;
        int sumOfDigits=0;
        while(number!=0){
            onesDigit=number%10;
            sumOfDigits += onesDigit;
            number /= 10 ;
        }
        System.out.println("Sum of Digits: " + sumOfDigits);
    }


}
