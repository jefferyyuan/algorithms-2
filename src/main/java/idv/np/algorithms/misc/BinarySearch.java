package idv.np.algorithms.misc;

/**
 * User: Nightpig
 * Date: 2013/8/11
 * Time: 下午 9:09
 */
public class BinarySearch {

    public static int execute(int[] data, int key) {
        int head = 0;
        int tail = data.length - 1;
        while (head <= tail) {
            int mid = (tail + head) / 2;
            if (data[mid] < key) {
                head = mid + 1;
            } else if (data[mid] > key) {
                tail = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
