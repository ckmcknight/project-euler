/*
 * find the difference between the square of the sum of the first 100 numbers
 * and the sum of the squares of the first 100 numbers.
 */

public class P6 {

    public static final long FINALNUM = 100;

    public static void main(String[] args) {
        long solution = squareOfSum(FINALNUM) - sumSquares(FINALNUM);
        System.out.println(solution);
    }

    private static long sumSquares(long finalNum) {
        long sum = 0;
        for (long i = 1; i <= finalNum; i++) {
            sum += i * i;
        }
        return sum;
    }

    private static long squareOfSum(long finalNum) {
        long sum = 0;
        for (long i = 1; i <= finalNum; i++) {
            sum += i;
        }
        return sum * sum;
    }

}
