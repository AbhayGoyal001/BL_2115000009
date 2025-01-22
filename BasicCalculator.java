// Program for a basic calculator
import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user for two numbers
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display results
        System.out.println("The addition, subtraction, multiplication and division of numbers " +
                           number1 + " and " + number2 + " are " + addition + ", " + subtraction +
                           ", " + multiplication + ", and " + division);
    }
}
