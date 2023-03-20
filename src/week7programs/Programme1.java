package week7programs;

/* 1. Write a java program that tells us that Input number is odd or even?
        HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Programme1 {

    public static void main(String[] args) {  //main method
        Programme1 obj = new Programme1();    //object calling
        obj.evenOdd();
    }

    public void evenOdd(){
        Scanner scan = new Scanner(System.in);    //scanner method
        System.out.println("Enter number to test");
        int number = scan.nextInt();                        //stored value
        //ternary operator to check number
        String result = number % 2 == 0 ?"Even" : "Odd";
        System.out.println(number + " is " + result);
        scan.close();

    }
}




