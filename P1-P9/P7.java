/*
 * Find the 10,001st prime number. Using a brute force algorithm.
 */

public class P7 {

    public static void main(String[] args) {
        long answer = nthPrime(10001);
        System.out.println(answer);
    }

    public static long nthPrime(int n) {
        int primeNum = 0;
        long currentTest = 1;
        while (primeNum != n) {
            currentTest += 1;
            if (isPrime(currentTest)) {
                primeNum += 1;
            }
        }
        return currentTest;
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
