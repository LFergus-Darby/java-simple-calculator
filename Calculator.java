import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");

        int choice = scanner.nextInt();

        double result;

        if (choice == 1) {
        result = num1 + num2;
        } else if (choice == 2) {
        result = num1 - num2;
        } else if (choice == 3) {
    result = num1 * num2;
        } else if (choice == 4) {
        result = num1 / num2;
        } else {
        System.out.println("Invalid choice.");
        scanner.close();
        return;
        }

        System.out.println("Result: " + result);

        scanner.close();

    }

}