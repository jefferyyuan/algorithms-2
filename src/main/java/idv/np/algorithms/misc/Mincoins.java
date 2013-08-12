package idv.np.algorithms.misc;

import java.util.Arrays;

/**
 * User: Nightpig
 * Date: 2013/8/12
 * Time: 下午 2:17
 */
public class MinCoins {

    public static int execute(int money, int[] coins) {
        Arrays.sort(coins);
        int[] table = new int[money + 1];
        Arrays.fill(table, -1);
        table[0] = 0;
        for (int i = 1; i < table.length; i++) {
            for (int j = coins.length - 1; j > -1; j--) {
                int r = i - coins[j];
                if (r >= 0 && table[r] != -1) {
                    table[i] = 1 + table[r];
                    break;
                }
            }
        }
        return table[money];
    }

}
