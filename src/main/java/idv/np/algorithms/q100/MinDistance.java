package idv.np.algorithms.q100;

/**
 * User: Nightpig
 * Date: 2013/6/23
 * Time: 上午 10:46
 */
public class MinDistance {

    public static int execute(int[] a, int[] b) {
        int i = 0, j = 0, min = Integer.MAX_VALUE;
        while (i < a.length && j < b.length) {
            min = Math.min(min, Math.abs(a[i] - b[j]));
            if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return min;
    }

}
