public class MathUtil {

    /**
     * Checks whether a given number n is prime.
     * @param n the number to check.
     * @return true if the number is prime, otherwise false.
     */
    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    /**
     * Calculates the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
     * @param a first number
     * @param b second number
     * @return the GCD of a and b.
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * Computes the least common multiple (LCM) of two numbers.
     * @param a first number
     * @param b second number
     * @return the LCM of a and b.
     */
    public static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }


    /**
     * Returns the nth Fibonacci number.
     * @param n index of the Fibonacci number.
     * @return the nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }


    /**
     * Calculates the factorial of a number n.
     * @param n the number to calculate factorial for.
     * @return the factorial of n.
     */
    public static int factorial(int n) {
        if (n <= 1) {
            return n;
        }
        return factorial(n - 1) + factorial(n - 2);
    }

    // non-static methods


    /**
     * Determines if the given number n is a perfect number.
     * @param num the number to check.
     * @return true if the number is perfect, otherwise false.
     */
    public boolean isPerfectNumber(int num) {
        int sum = 1;
        for(int i = 2 ; i <= num ; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }


    /**
     * Computes the sum of the digits of the given number n.
     * @param n the number to compute sum of digits for.
     * @return the sum of the digits of n.
     */
    public int sumOfDigits(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


    /**
     * Reverses the digits of a number n.
     * @param num the number to reverse.
     * @return the reversed number.
     */
    public int reverseNumber(int num) {
        int reversed = 1;
        while(num != 0) {
            reversed *= 10;
            num /= 10;
        }
        return reversed;
    }


    /**
     * Checks if a number is an Armstrong number.
     * @param num the number to check.
     * @return true if n is an Armstrong number, otherwise false.
     */
    public boolean isArmstrongNumber(int num) {
        int sum = 0;
        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum == num;
    }

    public int nextPrime(int num) {
        int prime = num + 1;
        while(isPrime(prime)) {
            prime++;
        }
        return prime;

    }



}