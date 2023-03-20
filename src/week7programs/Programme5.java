package week7programs;
/* 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF */

import java.util.Scanner;

public class Programme5 {

    public void salary() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee id");
        int employeeID = scan.nextInt();
        System.out.println("Enter name");
        String name = scan.next();
        System.out.println("Enter basic salary");
        int salary=scan.nextInt();

        double allowance;
        double hra,da,ta,pf;
        double gross;
        hra = 20*salary/100;
        da = 8 *salary/100;
        ta = 9* salary/100;
        pf = 20*salary/100;
        gross =(salary+ hra+da+ta+pf);
        System.out.println("|-------------------------------------|");
        System.out.println("|          Salary Slip                |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Employee Id     :   " + employeeID+"             |");
        System.out.println("|Employee Name   :"    + name +"                |" );
        System.out.println("|_____________________________________|");
        System.out.println("| Basic Salary   :"  +  salary +  "               |"  );
        System.out.println("| HRA 10%        :"  +  hra +    "              |");
        System.out.println("| TA  08%        : " +  ta +     "             |");
        System.out.println("| DA 09%         : " +  da +     "             |");
        System.out.println("| PF-20&         : " +  pf +     "             |");
        System.out.println("| ____________________________________|");
        System.out.println("| Gross salary    : " + gross + "           |");
        System.out.println("|=====================================|");
        scan.close();
    }

    public static void main(String[] args) {
        Programme5 obj = new Programme5();
        obj.salary();

    }

    }


