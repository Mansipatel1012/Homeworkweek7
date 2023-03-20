package week7programs;
/* 17. Write a Java program to sort a numeric array and a string array. */

import java.util.Arrays;

public class Programme17 {

    public static void main(String[] args) {

        int[] myArray ={50,40,30,20,10};

        String [] myArray1 = {"Mansi","Madhuri","Rani","kajol","Sita","Geeta"};

        System.out.println("Original numeric array :"+ Arrays.toString(myArray));
        Arrays.sort(myArray1);
        System.out.println("sorted numeric array : " + Arrays.toString(myArray));
        System.out.println("Original String array" + Arrays.toString(myArray1));
        Arrays.sort(myArray1);
        System.out.println("sorted string array :"+ Arrays.toString(myArray1));

    }

}
