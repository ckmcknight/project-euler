/**
 * Find the sum of all primes below 2 Milliom
 */

public class P10 {
    public static final int FINALNUM = 2000000;

    public static void main(String[] args) {
        long answer = sumPrimes(FINALNUM);
        System.out.println(answer);
    }

    private static long sumPrimes(int finalNum) {
        long sum = 0;
        for (int i = 2; i <= finalNum; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isPrime(double number) {
        for (int x = 2; x <= Math.floor(Math.sqrt(number)); x++) {
            if (number % x == 0) {
                return false;
            }
        }
        return true;
    }


}
