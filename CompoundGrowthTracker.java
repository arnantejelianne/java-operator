public class CompoundGrowthTracker {
    public static void main(String[] args) {
        double balance = 1000.0;
        System.out.println("Initial Balance: PHP " + balance);

        balance += 250.0;
        System.out.println("After += 250.0 (Deposit): PHP " + balance);

        balance *= 1.05;
        System.out.println("After *= 1.05 (Interest): PHP " + balance);

        balance += 500.0;
        System.out.println("After += 500.0 (Deposit): PHP " + balance);

        System.out.println();

        int count = 5;
        System.out.println("--- Postfix Increment (count++) ---");
        System.out.println("Value printed during count++: " + count++);
        System.out.println("Value printed immediately after: " + count);

        System.out.println();

        int counter = 5;
        System.out.println("--- Prefix Increment (++counter) ---");
        System.out.println("Value printed during ++counter: " + ++counter);
        System.out.println("Value printed immediately after: " + counter);
    }
}
