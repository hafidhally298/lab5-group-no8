import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number, operator, and second number: ");
        double n1 = sc.nextDouble();
        char op = sc.next().charAt(0);
        double n2 = sc.nextDouble();

        System.out.println("Result: " + calculate(n1, n2, op));
    }

    static double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }
}
