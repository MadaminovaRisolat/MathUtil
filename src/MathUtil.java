

public class MathUtil {

    // 5 Non-static Methods

    public boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }


    public int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


    public int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }


    public boolean isArmstrongNumber(int n) {
        int original = n, sum = 0, digits = String.valueOf(n).length();
        while (n > 0) {
            int digit = n % 10;
            sum += (int)Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }


    public int nextPrime(int n) {
        int candidate = n + 1;
        while (!Main.isPrime(candidate)) {
            candidate++;
        }
        return candidate;
    }

}
