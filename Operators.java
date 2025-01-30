import java.util.Scanner;
public class Operators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("num1 == num2: " + (num1 == num2)); // Equal to
        System.out.println("num1 != num2: " + (num1 != num2)); // Not equal to
        System.out.println("num1 > num2: " + (num1 > num2)); // Greater than
        System.out.println("num1 < num2: " + (num1 < num2)); // Less than
        System.out.println("num1 >= num2: " + (num1 >= num2)); // Greater than or equal to
        System.out.println("num1 <= num2: " + (num1 <= num2)); // Less than or equal to

        // Logical Operators
        System.out.println("\nLogical Operators:");
        boolean condition1 = (num1 > 0); 
        boolean condition2 = (num2 > 0); 
        System.out.println("Both numbers are positive: " + (condition1 && condition2)); // Logical AND
        System.out.println("At least one number is positive: " + (condition1 || condition2)); // Logical OR
        System.out.println("At least one number is not positive: " + (!condition1 || !condition2)); // Logical NOT

        //Shift Operators   
        // Demonstrating left shift operator
        int leftShift = num1 << 1; // Shift left by 1 (multiply by 2)
        System.out.println("Left Shift (number << 1): " + leftShift);
    
        // Demonstrating right shift operator
        int rightShift = num2 >> 1; // Shift right by 1 (divide by 2)
        System.out.println("Right Shift (number >> 1): " + rightShift);
    
        // Demonstrating unsigned right shift operator
        int unsignedRightShift = num1 >>> 1; // Unsigned right shift by 1
        System.out.println("Unsigned Right Shift (number >>> 1): " + unsignedRightShift);
    
        scanner.close();
    }
}
