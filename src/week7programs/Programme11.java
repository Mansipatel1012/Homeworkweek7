package week7programs;

/* 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately*/


import java.util.Scanner;

public class Programme11 {

    public static void main(String[] args) {
        Programme11 obj1 = new Programme11();
        obj1.numbers();
    }

    public void numbers(){

        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println("Divided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.println(i + " ,");
        }
        System.out.println("Divided by 5 : ");
        for (int i = 1; i < 100; i++){
            if (i % 5 == 0)
                System.out.println(i + " , ");

        }
        System.out.println("Divided by 3 & 5 :");
        for (int i = 1; i < 100; i++){
            if (i%3==0 && i%5==0)
                System.out.println(i + " , ");
        }
        System.out.println("\n");
        scan.close();
    }
}