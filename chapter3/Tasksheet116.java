package chapter3;

import java.util.Scanner;

public class Tasksheet116 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Please enter any String ");
        String inputtedString = scn.nextLine();

        // Use StringBuilder to create a new string that is a reverse of the input string.
        StringBuilder reversedString = new StringBuilder(inputtedString);
        reversedString.reverse();

        // Use the equals() method to check if the input string and the reversed string are the same.
        if (inputtedString.equals(reversedString.toString()))
        System.out.println("The input string is a palindrome");
        else
        System.out.println("The input string is not a palindrome.");


    }
    
}
