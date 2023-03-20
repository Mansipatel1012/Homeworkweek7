package week7programs;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 **/


public class Programme16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = scan.nextInt();
        if (x >= 0) {
            System.out.println(x + " is positive");
        } else {
            System.out.println(x + " is negative");
            scan.close();
        }
    }
}
