package week7programs;

/* 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)*/

import java.util.Scanner;

public class Programme10 {

    public static void main(String[] args) {
        Programme10 tn = new Programme10();
        tn.twoNumbers();

    }
public void twoNumbers(){
    char ch;
    Scanner scan = new Scanner(System.in);
    System.out.println("Input first number");
    int x = scan.nextInt();
    System.out.println("Input second number");
    int y = scan.nextInt();

    System.out.println("Enter symbol (+,-,*,/) : ");
    ch = scan.next().charAt(0);
    if (ch == '+') {
        System.out.println("Addition " + x + " + " + y + " = " + (x + y));
    }else if(ch == '-') {
        System.out.println("Substraction " + x + " - " + y + " = " + (x - y));
    }else if(ch == '*') {
        System.out.println("Multiplication " + x + " * " + y + " = " + (x * y));
    } else if (ch == '/') {
        System.out.println("Division " + x + " / " + y + " = " + (x / y));
    }else{
        System.out.println("Symbol is invalid");
        scan.close();
    }
}
}
