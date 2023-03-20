package week7programs;

import java.util.Scanner;
/* 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
*/

public class Programme2 {

    public void leapYear() {
        int year;
        System.out.println("Enter an Year : ");
        Scanner scan = new Scanner(System.in);     //scanner calling
        year = scan.nextInt();                    // store value
                                                  //leap year calculation
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");
         scan.close();
    }

    public static void main(String[] args) {
        Programme2 LP = new Programme2();
        LP.leapYear();                        //object calling in main method
    }
}

