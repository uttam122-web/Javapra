import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the dividend: ");
            double dividend = scanner.nextDouble();

            System.out.print("Enter the divisor: ");
            double divisor = scanner.nextDouble();

            if (divisor == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            double result = dividend / divisor;
            System.out.println("Result of division: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
