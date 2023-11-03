package week_3_homework;

import java.util.Scanner;

/**
 * Write a java program input seller id, sellers name, sales amount, and basic salary
 * then fined this sales
 * Commission
 * Sales amount &gt;= 50,000 35%
 * Sales amount &gt;= 30,000 20%
 * &gt;= 20,000 10%
 * &gt;= 10,000 5%
 * &lt; 10,000 2%
 */
public class Programme_7_SalesCommision {

    public static void main(String[] args) {

        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seller name : ");
        String name = scanner.nextLine();
        System.out.println("Enter Seller ID : ");
        int sellerID = scanner.nextInt();
        System.out.println("Enter sales amount : ");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter basic Salary : ");
        int basicSalary = scanner.nextInt();

        //creating object to call instance method
        Programme_7_SalesCommision salesCommision = new Programme_7_SalesCommision();
        int grossSalary = basicSalary + salesCommision.caculateCommission(salesAmount);

        System.out.println("Seller Name : " + name);
        System.out.println("Seller ID : " + sellerID);
        System.out.println("Seller's Sales Amount : " + salesAmount);
        System.out.println("Seller's basic salary : " + basicSalary);
        System.out.println("Seller's Gross Salary : " + grossSalary);

        //closing scanner
        scanner.close();
    }

    //calculating the sales commission
    public int caculateCommission(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales commisson is : " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales commisson is : " + commission);
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
            System.out.println("Sales commisson is : " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales commisson is : " + commission);
        } else {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales commisson is : " + commission);
        }
        return commission;
    }
}
