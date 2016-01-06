/*
 * Find the largest Palindrome that is a product of two 3-digit numbers
 */

public class P4 {

    public static void main(String[] args) {
        System.out.println(largestPalindrome());
    }

    private static int largestPalindrome() {
        int max = 0;
        for (int i = 1; i < 1000; i++) {
            for (int x = 1; x < 1000; x++) {
                int currentNum = x*i;
                if (currentNum > max && isPalindrome(currentNum)) {
                    max = currentNum;
                }
            }
        }
        return max;
    }

    private static boolean isPalindrome(int num) {
        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) != numStr.charAt(numStr.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
