package idv.np.algorithms.q100;

import java.util.ArrayList;

/**
 * User: Nightpig
 * Date: 2013/7/7
 * Time: 下午 8:00
 */
public class Armstrong {

    public static int[] execute(int n) {
        ArrayList<Integer> ansList = new ArrayList<>();
        int[] pows = new int[10];
        for (int i = 0; i < pows.length; i++) {
            pows[i] = (int) Math.pow(i, n);
        }
        int[] pows10 = new int[n + 1];
        for (int i = 0; i < pows10.length; i++) {
            pows10[i] = (int) Math.pow(10, i);
        }
        for (int i = pows10[n - 1], end = pows10[pows10.length - 1]; i < end; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += pows[i % pows10[j + 1] / pows10[j]];
            }
            if (i == sum) {
                ansList.add(i);
            }
        }
        int[] ans = new int[ansList.size()];
        for (int i = 0, size = ansList.size(); i < size; i++) {
            ans[i] = ansList.get(i);
        }
        return ans;
    }

}
