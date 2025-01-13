package chapter4;

import static java.lang.Math.*;
import java.util.Scanner;

public class Tasksheet121 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first param");
        int x = s.nextInt();

        System.out.print("Enter second param");
        int y = s.nextInt();

        System.out.println("Addition: " + add(x, y));
        System.out.println("Subraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division: " + divide(x, y));



    }
}
