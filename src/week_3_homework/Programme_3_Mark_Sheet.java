package week_3_homework;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
public class Programme_3_Mark_Sheet {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Student Name     \t \t:\t");
        String name = scanner.next();
        System.out.println("Enter Student Roll Number  \t\t:\t");
        int rollNum = scanner.nextInt();
        System.out.println("Enter Marks of Subject Maths \t:\t");
        int mathMarks = scanner.nextInt();
        if (mathMarks < 0 || mathMarks > 100) {
            System.out.println("\nInvalid input, Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            mathMarks = scanner.nextInt();
        }

        System.out.println("Enter Marks of Subject Science \t:\t");
        int scienceMarks = scanner.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("\nInvalid input, Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            scienceMarks = scanner.nextInt();
        }

        System.out.println("Enter Marks of Subject English \t:\t");
        int englishMarks = scanner.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("\nInvalid input, Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            englishMarks = scanner.nextInt();
        }

        int total = sum(mathMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathMarks, scienceMarks, englishMarks, total, percentage, result, grade);

        //Closing the scanner object
        scanner.close();
    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //Calculating the results on subject marks
    public static String calculateResult(int mathMarks, int scienceMarks, int engkishMarks) {
        if (mathMarks < 35 || scienceMarks < 35 || engkishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    //Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B+";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "-";
        }
        return grade;
    }

    //Printing the Marks sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathMarks, int scienceMarks, int englishMarks, double total, double percentage, String result, String grade) {
        System.out.println("----------------------------");
        System.out.println("|                          |");
        System.out.println("|    Mark Sheet            |");
        System.out.println("|__________________________|");
        System.out.println("| Name  : " + name + "                 |");
        System.out.println("| Roll No : " + rollNum + "               |");
        System.out.println("|__________________________|");
        System.out.println("| Subject  :  Marks        |");
        System.out.println("|__________________________|");
        System.out.println("| Math : " + mathMarks + "                    |");
        System.out.println("| Science : " + scienceMarks + "              |");
        System.out.println("| English : " + englishMarks + "              |");
        System.out.println("|__________________________|");
        System.out.println("| Total : " + total + "             |");
        System.out.println("|__________________________|");
        System.out.println("| Percentage : " + percentage + "            |");
        System.out.println("| Result : " + result + "                  |");
        System.out.println("| Grade : " + grade + "                   |");
        System.out.println("|__________________________|");
    }
}
