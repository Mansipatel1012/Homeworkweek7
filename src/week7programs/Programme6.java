package week7programs;
/* 6. Write a java program to input any number and find out if it’s odd or even
*/


import java.util.Scanner;

public class Programme6 {

    public static void main(String[] args) {
        Programme6 obj = new Programme6();
        obj.evenOdd();
    }

    public void evenOdd() {
        //to take input from the user
        //create object using scanner
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println("Enter the number");
        number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("The entered number is even");
        } else
            System.out.println("The entered number is odd");
        scan.close();
    }

}


