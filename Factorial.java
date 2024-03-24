// find factorial of a number in java.
// For ex. 5! = 5 x 4 x 3 x 2 x 1 = 120.

import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        // Taking input number from user
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number to find factorial: ");
        int number = scan.nextInt();

        int i;
        int Factorial = 1;
        // Calculating factorial of the number
        // Reversing number up to 1
        for(i=number; i>=1; i--){
            Factorial *= i;
        }
        System.out.println("Factorial of " + number + " is : " + Factorial);
    }
}

