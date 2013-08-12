package idv.np.algorithms.misc;

/**
 * User: Nightpig
 * Date: 2013/8/12
 * Time: 下午 3:47
 */
public class SplitNumber {

    public static int execute(int num) {
        int[][] table = new int[num + 1][num + 1];
        for (int i = 0; i < table.length; i++) {
            table[i][0] = 1;
            table[i][1] = 1;
        }
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j <= i; j++) {
                if (i + j > num) {
                    continue;
                }
                for (int k = 1; k <= j; k++) {
                    table[i][j] += table[i - k][Math.min(i - k, k)];
                }
            }
        }
        for (int k = 1; k <= num; k++) {
            table[num][num] += table[num - k][Math.min(num - k, k)];
        }
        return table[num][num];
    }

}
