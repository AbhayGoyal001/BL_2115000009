package Assignment1;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculate the sum
        double sum = num1 + num2;

        // Output the sum
        System.out.println("The sum of the two numbers is: " + sum);
    }
}
