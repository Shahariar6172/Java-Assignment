import java.util.Scanner;

class simplecalculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a > b ? a - b : b - a;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0 || a == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return a > b ? (double) a / b : (double) b / a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.printf("%d + %d = %d\n", a, b, add(a, b));
        System.out.printf("Subtraction (larger - smaller) = %d\n", subtract(a, b));
        System.out.printf("%d * %d = %d\n", a, b, multiply(a, b));
        System.out.printf("Division (larger / smaller) = %.2f\n", divide(a, b));

        input.close();
    }
}
