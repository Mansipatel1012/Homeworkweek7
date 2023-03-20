package week7programs;
/* 20. Write a Java program to test if an array contains a specific value.*/


import java.util.stream.IntStream;

public class Programme20 {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5};   //using array method
        int toFind = 7;

        boolean found = IntStream.of(num).anyMatch(n -> n == toFind);

        if (found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");

    }
}

