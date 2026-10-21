public class PrecedencePuzzleSolver {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 15;

        boolean result1 = ++ a + b * 2 > c && ! (b > c);

        System.out.println("Result 1: " + result1);

        int x = 8;
        int y = 4;
        int z = 2;

        int result2 = x-- - y * z + ++x;
        System.out.println("Result 2: " + result2);
  
        boolean result3 = (a + b > c) || (x * y <= z) && (b / y == 2);
        System.out.println("Result 3: " + result3);
        }
}
