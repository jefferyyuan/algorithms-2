package idv.np.algorithms.misc;

/**
 * User: Nightpig
 * Date: 2013/8/11
 * Time: 下午 6:34
 */
public class Quicksort {

    public static void execute(int[] data) {
        quicksort(data, 0, data.length - 1);
    }

    private static void quicksort(int[] data, int l, int r) {
        if (l > r) {
            return;
        }
        int p = data[l];
        int i = l + 1;
        int j = r;
        while (true) {
            while (i <= r) {
                if (data[i] > p) {
                    break;
                }
                i++;
            }
            while (j > l) {
                if (data[j] < p) {
                    break;
                }
                j--;
            }
            if (i > j) {
                break;
            }
            swap(data, i, j);
        }
        swap(data, l, j);
        quicksort(data, l, j - 1);
        quicksort(data, j + 1, r);
    }

    private static void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

}
