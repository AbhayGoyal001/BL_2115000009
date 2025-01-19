package Assignment1;
import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area
        double area = Math.PI * Math.pow(radius, 2);

        // Output the area
        System.out.println("The area of the circle is: " + area);
    }
}
