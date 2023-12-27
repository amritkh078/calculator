import java.util.Scanner;

public class Calculator {
    // Method to add two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers (accepts double)
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throwDivideByZeroException();
        }
        return num1 / num2;
    }

    // Method to handle divide by zero exception
    private void throwDivideByZeroException() {
        throw new IllegalArgumentException("Cannot divide by zero!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        int choice;
        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int additionResult = calc.add((int) num1, (int) num2);
                    System.out.println("Addition: " + additionResult);
                    break;
                case 2:
                    int subtractionResult = calc.subtract((int) num1, (int) num2);
                    System.out.println("Subtraction: " + subtractionResult);
                    break;
                case 3:
                    double multiplicationResult = calc.multiply(num1, num2);
                    System.out.println("Multiplication: " + multiplicationResult);
                    break;
                case 4:
                    try {
                        double divisionResult = calc.divide(num1, num2);
                        System.out.println("Division: " + divisionResult);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
