package Assignment1;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Output temperature in Fahrenheit
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }
}
