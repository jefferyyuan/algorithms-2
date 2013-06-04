package idv.np.algorithms.q100;

/**
 * Created with IntelliJ IDEA.
 * User: Nightpig
 * Date: 2013/6/4
 * Time: 下午 11:44
 */
public class DominanceCount {

    public static int execute(int[] a, int[] b) {
        int total, i, j;
        total = i = j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                i++;
            } else {
                j++;
                total += a.length - i;
            }
        }
        return total;
    }

}
