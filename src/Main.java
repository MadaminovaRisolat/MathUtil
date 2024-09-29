import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Test the static methods
        System.out.println("Static Methods:");
        System.out.println(isPrime(scanner.nextInt()));
        System.out.println(gcd(scanner.nextInt(), scanner.nextInt()));
        System.out.println(lcm(scanner.nextInt(), scanner.nextInt()));
        System.out.println(fibonacci(scanner.nextInt()));
        System.out.println(factorial(scanner.nextInt()));

        // Create an instance of MathUtil to test non-static methods
        MathUtil util = new MathUtil();

        System.out.println("\nNon-Static Methods:");
        System.out.println(util.isPerfectNumber(scanner.nextInt()));
        System.out.println(util.sumOfDigits(scanner.nextInt()));
        System.out.println(util.reverseNumber(scanner.nextInt()));
        System.out.println(util.isArmstrongNumber(scanner.nextInt()));
        System.out.println(util.nextPrime(scanner.nextInt()));
    }
    //5 Static methods

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }


    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }


    public static long factorial(int n) {
        if (n == 0) return 1;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
