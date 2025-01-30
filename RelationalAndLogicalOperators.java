import java.util.Scanner;

public class RelationalAndLogicalOperators {

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
        scanner.close();
    }
}