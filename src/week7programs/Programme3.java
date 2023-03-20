package week7programs;
/*3. Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format.*/

import java.util.Scanner;

public class Programme3 {
    public static void main(String[] args) {    // main method
        Programme3 obj3 = new Programme3();      // calling object
        obj3.markSheet();

    }

    public void markSheet() {
        Scanner scan = new Scanner(System.in);      // scanner method
        int mathmark, sciencemark, englishmark, total;
        double percentage;
        String result;
        String grade = null;
         //Enter student name and roll number
        System.out.println("Enter student name: ");
        String name = scan.nextLine();
        System.out.println("Enter Student roll number : ");
        int rollnum = scan.nextInt();
         // Enter math marks using ifelse syntax
        System.out.println("Enter maths marks");     //maths
        mathmark = scan.nextInt();
        if (mathmark > 0 && mathmark <= 100) {
            System.out.println("valid input ");
        } else {
            System.out.println("Invalid input");
        }
                                              //Enter science marks
        System.out.println("Enter science marks");
        sciencemark = scan.nextInt();
        if (sciencemark > 0 && sciencemark <= 100) {
            System.out.println("valid input");
        } else {
            System.out.println("Invalid input");
        }

        System.out.println("Enter english marks");     //enter English marks
        englishmark = scan.nextInt();
        if (englishmark > 0 && englishmark <= 100){
            System.out.println("valid input");
        }else {
            System.out.println("Invalid input");
        }           // total
        double sum= (sciencemark + englishmark + mathmark);
        System.out.println(sum);
        percentage = sum / 300 *100;
        System.out.println(percentage);
        
        if (percentage >=35) {
            result = "pass";
        }else{
            result = "fail";
        }
        System.out.println(result);
        
        if (percentage >= 80){
            grade = "A+";
            System.out.println(grade);                           // using if -else statement
        } else if (percentage >= 60 && percentage<= 79) {
            grade = "A";
            System.out.println(grade);
        } else if (percentage >= 50 && percentage <= 59) {
            grade = "B";
            System.out.println(grade);
        } else if (percentage >= 35 && percentage <=49) {
            grade = "C";
            System.out.println(grade);
        }

        System.out.println("  ______________________________________ ");
        System.out.println(" |                                      |");
        System.out.println(" |               Mark Sheet             |");
        System.out.println(" |______________________________________|");
        System.out.println(" |  Name        :"   + name +"                      |");
        System.out.println(" |  Roll no     :"  + rollnum+"                      |");
        System.out.println(" |______________________________________|");
        System.out.println(" |  subject     :  marks                |");
        System.out.println(" |______________________________________|");
        System.out.println(" |  math        : " + mathmark + "                    |");
        System.out.println(" |  Science     : " + sciencemark + "                    |");
        System.out.println(" |  math        : " + englishmark + "                    |");
        System.out.println(" |______________________________________|");
        System.out.println(" |  Total       : " + sum + "                  |");
        System.out.println(" |______________________________________|");
        System.out.println(" |  Percentage  :"  + percentage+"                   |");
        System.out.println(" |  Result      :"  + result + "                   |");
        System.out.println(" |  Grade       :"  + grade + "                   |");
        System.out.println(" |______________________________________|");
         scan.close();
    }

}
