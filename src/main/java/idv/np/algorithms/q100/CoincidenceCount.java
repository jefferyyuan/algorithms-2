package idv.np.algorithms.q100;

/**
 * User: Nightpig
 * Date: 2013/6/23
 * Time: 上午 10:17
 * Given two sorted arrays, this function computes the number
 * of pairs that satisfies a[i] == b[j].
 */
public class CoincidenceCount {

    public static int execute(int[] a, int[] b) {
        int i = 0, j = 0, total = 0;
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                i++;
                j++;
                total++;
            }
        }
        return total;
    }

}
