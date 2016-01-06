/*
 * Find the smallest number that is divisible by the numbers 1-20
 * A faster way would be to multiply the numbers 1-20 together and
 * then reduce it until it couldn't be reduced anymore.
 */

public class P5 {

    public static void main(String[] args) {
        System.out.println(smallestDivisible());
    }

    private static long smallestDivisible() {
        long i = 21L;
        while (!isDivisibleBy(i)) {
            i++;
        }
        return i;
    }

    private static boolean isDivisibleBy(long number) {
        int upTo = 20;
        for (int i = 2; i <= upTo; i++) {
            if (number % i != 0) {
                return false;
            }
        }
        return true;
    }
}
