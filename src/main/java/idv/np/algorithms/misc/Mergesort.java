package idv.np.algorithms.misc;

import java.util.Arrays;

/**
 * User: Nightpig
 * Date: 2013/8/11
 * Time: 下午 6:35
 */
public class Mergesort {

    public static void execute(int[] data) {
        mergesort(data);
    }

    private static void mergesort(int[] data) {
        if (data.length < 2) {
            return;
        }
        int[] left = Arrays.copyOfRange(data, 0, data.length / 2);
        int[] right = Arrays.copyOfRange(data, left.length, data.length);
        mergesort(left);
        mergesort(right);
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                data[k] = left[i];
                i++;
            } else {
                data[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            data[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            data[k] = right[j];
            k++;
            j++;
        }
    }

}
