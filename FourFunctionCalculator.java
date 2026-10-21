import java.util.Scanner;

public class FourFunctionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        int plus = num1 + num2;
        int minus = num1 - num2;
        int times = num1 * num2;

        System.out.println("\nResults for " + num1 + " and " + num2 + ":");
        System.out.println("Addition = " + plus);
        System.out.println("Subtraction = " + minus);
        System.out.println("Multiplication = " + times);

        if (num2 == 0) {
            
            System.out.println("Division = undefined");
            System.out.println("Modulus = undefined");
        } else {
            System.out.println("Division = " + (num1 / num2));
            System.out.println("Modulus = " + (num1 % num2));
        }

        input.close();
    }
}
