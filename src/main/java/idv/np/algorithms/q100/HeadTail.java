package idv.np.algorithms.q100;

/**
 * User: Nightpig
 * Date: 2013/6/23
 * Time: 下午 12:50
 * Given an array with positive elements, please counts how
 * many equal prefix and suffix sums there are
 */
public class HeadTail {

    public static int execute(int[] a) {
        int count = 1, i = 0, j = a.length - 1, sumi = a[i], sumj = a[j];
        while (i < a.length - 1 && j > 0) {
            if (sumi > sumj) {
                sumj += a[--j];
            } else if (sumi < sumj) {
                sumi += a[++i];
            } else {
                count++;
                sumj += a[--j];
                sumi += a[++i];
            }
        }
        return count;
    }

}
