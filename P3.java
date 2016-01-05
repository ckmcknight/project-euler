/*
 * Find the largest prime factor of 600851475143
 *
 * This is not the most efficient solution but solves practically instantly
 * so I decided it was fine
 */

public class P3 {
    public static final double NUMBER = 600851475143L;

    public static void main(String[] args) {
        int answer = largestPrimeFactor(NUMBER);
        System.out.println(answer);
    }

    public static int largestPrimeFactor(double number) {
        for ( int x = (int) Math.floor(Math.sqrt(number)); x > 0; x--) {
            if (number % x == 0 && isPrime(x)) {
                return x;
            }
        }
        return -1;
    }

    public static boolean isPrime(double number) {
        for (int x = 2; x <= Math.floor(Math.sqrt(number)); x++) {
            if (number % x == 0) {
                return false;
            }
        }
        return true;
    }

}
