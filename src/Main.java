
public class Main {
    public static void main(String[] args) {

        // Static method
        System.out.println(MathUtil.isPrime(7));  // true
        System.out.println(MathUtil.gcd(12, 18));  // 6
        System.out.println(MathUtil.lcm(4, 5));  // 20
        System.out.println(MathUtil.fibonacci(7));  // 13
        System.out.println( MathUtil.factorial(5));  // 120


        // Non-static method
        MathUtil util = new MathUtil();
        System.out.println(util.isPerfectNumber(6));  // true
        System.out.println(util.sumOfDigits(1234));  // 10
        System.out.println(util.reverseNumber(4321));  // 1234
        System.out.println(util.isArmstrongNumber(153));  // true
        System.out.println(util.nextPrime(14));  // 17
    }

}