/*
 * Find the sum of all the even fibonacci numbers under 4 million
 */
public class P2 {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int sum = 0;
        while (i < 4000000) {
            if (i % 2 == 0) {
                sum += i;
            }
            int temp;
            temp = i;
            i = i + j;
            j = temp;
        }
        System.out.println(sum);
    }

}
