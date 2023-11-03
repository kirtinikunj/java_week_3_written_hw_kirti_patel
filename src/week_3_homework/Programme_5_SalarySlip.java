package week_3_homework;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | DA 8% : 2250.0 |
 * | TA 9% : 2000.0 |
 * | PF - 20%; : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */
public class Programme_5_SalarySlip {

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        System.out.println("Enter your employee ID : ");
        int employeeID = scanner.nextInt();

        System.out.println("Enter basic salary : ");
        double baiscSalary = scanner.nextDouble();

        //calculating HRA,DA,TA and PF
        double hRA = calculateHRA(baiscSalary);
        double da = calculateHRA(baiscSalary);
        double ta = calculateHRA(baiscSalary);
        double pf = calculateHRA(baiscSalary);

        //calculating the gross salary
        double grossSalary = baiscSalary + hRA + da + ta + pf;

        System.out.println("---------------------------------------");
        System.out.println("| Salary slip                         |");
        System.out.println("|-------------------------------------|");
        System.out.println("| Employee ID : " + employeeID + "                   |");
        System.out.println("| Employee Name : " + name + "                |");
        System.out.println("|-------------------------------------|");
        System.out.println("| HRA 10% : " + hRA + "                   |");
        System.out.println("| DA 8% : " + da + "                     |");
        System.out.println("| TA 9% : " + ta + "                     |");
        System.out.println("| PF 20% : " + pf + "                    |");
        System.out.println("|-------------------------------------|");
        System.out.println("| Gross Salary : " + grossSalary + "            |");
        System.out.println("|-------------------------------------|");
    }

    //calculating HRA
    public static double calculateHRA(double basicSalary) {
        return (basicSalary * 10) / 100;
    }

    //calculating DA
    public static double calculateDA(double basicSalary) {
        return (basicSalary * 8) / 100;
    }

    //calculating TA
    public static double calculateTA(double basicSalary) {
        return (basicSalary * 9) / 100;
    }

    //calculating PF
    public static double calculatePF(double basicSalary) {
        return (basicSalary * 20) / 100;
    }
}
