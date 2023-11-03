package week_3_homework;

import java.util.Scanner;

/**
 * /**
 * * 1. Write a java program that tells us that Input number is odd or even?
 * * HINT: use ternary operator (? :)
 */
public class Programme_1_OddEvenTernaryOperator {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number = scanner.nextInt();
        isOddEvenNumber(number);
        //closing scanner
        scanner.close();
    }

    //checking the number is even or odd
    public static void isOddEvenNumber(int number) {
        //ternary operator is used
        String evenOeOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOeOdd + " number");
    }
}
