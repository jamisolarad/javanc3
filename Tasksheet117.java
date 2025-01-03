import java.util.Scanner;

public class Tasksheet117 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int firstNum = scanner.nextInt();

    System.out.print("Enter second number: ");
    int secondNum = scanner.nextInt();
 
    System.out.print("Enter third number: ");
    int thirdNum = scanner.nextInt();

    if (firstNum == secondNum && secondNum == thirdNum) {
        
    System.out.println("All numbers are equal");
    
    }

    else {

    int largest = firstNum;

    if (secondNum > largest) {
        largest = secondNum;
    } 

    if (thirdNum > largest) {
        largest = thirdNum;
    }

    System.out.println("The largest number is " + largest);
    }
}

}
