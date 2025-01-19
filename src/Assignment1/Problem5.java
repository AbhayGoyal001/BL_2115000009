package Assignment1;
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Input radius and height of the cylinder
            System.out.print("Enter the radius of the cylinder: ");
            double radius = scanner.nextDouble();

            System.out.print("Enter the height of the cylinder: ");
            double height = scanner.nextDouble();

            // Calculate the volume
            double volume = Math.PI * Math.pow(radius, 2) * height;

            // Output the volume
            System.out.println("The volume of the cylinder is: " + volume);
    }
}
