package week7programs;
/* 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry*/

import java.util.Scanner;

public class Programme8 {

    public void myCity() {
                 //using single array syntax
        String a[] = {"America", "Belgium", "Canada", "Dubai","England", "France"};

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter first letter of city between A to F");
        String city = scan.next();
          // if else syntax
        if (city.startsWith("a")) {
            System.out.println(a[0]);
        } else if (city.startsWith("b")) {
            System.out.println(a[1]);
        } else if (city.startsWith("c")) {
            System.out.println(a[2]);
        } else if (city.startsWith("d")) {
            System.out.println(a[3]);
        } else if (city.startsWith("e")) {
            System.out.println(a[4]);
        } else if (city.startsWith("f")) {
            System.out.println(a[5]);
        } else {
            System.out.println("Invalid entry");
            scan.close();
        }

    }

    public static void main(String[] args) {
        Programme8 obj = new Programme8();   // object calling
        obj.myCity();

    }

}
