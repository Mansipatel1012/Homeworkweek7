package week7programs;
/* Input any alphabet from “A" to “F” and print their city name accordingly (use Switch Statement) if
any other alphabet should be invalid entry */

import java.util.Scanner;

public class Programme9 {

    public static void main(String[] args) {
        Programme9 obj = new Programme9();
        obj.alphabet();
    }

    public void alphabet() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter city name between A to F");
        String letter = scan.next();

        switch (letter.toUpperCase()) {
            case "A":
                System.out.println("America");
                break;
            case "B":
                System.out.println("Belgium");
                break;
            case "C":
                System.out.println("Canada");
                break;
            case "D":
                System.out.println("Dubai");
                break;
            case "E":
                System.out.println("England");
                break;
            case "F":
                System.out.println("France");
                break;
            default:
                System.out.println("Invalid Entry");
                scan.close();
        }
    }
}