package chapter4;

import java.util.Scanner;

public class Tasksheet119 {


    public static double addition (double num1, double num2){
        double sum = num1 + num2 ;
        return sum;
    }

    public static double subtraction (double num1, double num2){
        double difference = num1 - num2;
        return difference;
    }

    public static double multiplication (double num1, double num2){
        double product = num1 * num2; 
        return product;
    }

    public static double division (double num1, double num2){
        double quotient = num1 / num2; 
        return quotient;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        double num1 = s.nextDouble();

        System.out.print("Enter Second Number: ");
        double num2 = s.nextDouble();

        System.out.println("Additon " + addition(num1, num2));
        System.out.println("Subtraction " + subtraction(num1, num2));
        System.out.println("Multiplication " + multiplication(num1, num2));
        System.out.println("Division " + division(num1, num2));
    }
}
