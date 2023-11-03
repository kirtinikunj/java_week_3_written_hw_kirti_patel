package week_3_homework;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12_FindInputValue {

    public static void main(String[] args) {

        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);

        //object creation
        Programme_12_FindInputValue inputValue = new Programme_12_FindInputValue();
        inputValue.checkInputvalueIsAlphabetNumberOrSymbol(ch);

        //closing scanner
        scanner.close();
    }

    //Find input value is ALPHABET, DIGIT OR SYMBOL
    public void checkInputvalueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit");
        } else {
            System.out.println(ch + " is a Symbol");
        }
    }
}
