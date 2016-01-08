/*
 * find the product of the numbers in a pythagoran triplet who's sum is 1000
 * aka find a*b*c where a+b+c = 1000 and a^2 + b^2 = c^2 where a,b,c are ints
 */

public class P9 {

    public static void main(String[] args) {
        int answer = findPythagoreanTriplet(1000);
        System.out.println(answer);
    }

    /*
     * Returns the product of the pythagorean triplet.
     * returns -1 if one does not exist
     */
    private static int findPythagoreanTriplet(int sum) {
        for (int c = 1; c < sum; c++) {
            for (int b = 1; b < c; b++) {
                for (int a = 1; a < b; a++) {
                    if (isPythTriplet(a,b,c) && (a + b + c) == sum) {
                        return a * b * c;
                    }
                }
            }
        }
        return -1;
    }

    private static boolean isPythTriplet(int a, int b, int c) {
        return a * a + b * b == c * c;
    }
}
