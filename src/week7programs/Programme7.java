package week7programs;
/* 7. Write a java program input sales id, seller's name, sales amount, and salary basic and 
then fined this sales 
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%

 */

import java.util.Scanner;

public class Programme7 {
    
    public static void main(String[] args) {
         int commission;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter seller id");
        int saleId = scan.nextInt();

        System.out.println("Enter seller name");
        String saleName = scan.next();

        System.out.println("Enter sales amount ");
        int salesAmount = scan.nextInt();

        System.out.println("Enter basic salary");
        int basicSalary=scan.nextInt();
        
        if(salesAmount >=50000){
            commission =(salesAmount * 35)/100;
            System.out.println("sales commision is " + commission);
        } else if (salesAmount >= 30000 && salesAmount<= 499999) {
            commission = (salesAmount * 20) / 100;
            System.out.println("sales commission is " + commission);
        } else if (salesAmount >= 20000 && salesAmount <= 29999) {
            commission=(salesAmount*10)/100;
            System.out.println("Sales commission is " + commission);
        } else if (salesAmount >= 10000 && salesAmount <= 19999) {
            commission=(salesAmount * 5)/100;
            System.out.println("sales commission is " + commission);
        } else if (salesAmount <10000) {
            commission=(salesAmount*2)/100;
            System.out.println("sales commission is " + commission);
            scan.close();
        }
    }

    }


