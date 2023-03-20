package week7programs;

/* 12. Write a program that tells us input value is number or an alphabet or symbol.*/

import java.util.Scanner;

public class Programme12 {
    public static void main(String[] args) {
        Programme12 obj = new Programme12();
        obj.inputValue();

    }

    public void inputValue() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = scan.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' &&  ch <= 'z')) {
            System.out.println(ch + " is A Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is A Digit");
        }else {
            System.out.println(ch + " is A Special Character");
            scan.close();
    }
    }
}