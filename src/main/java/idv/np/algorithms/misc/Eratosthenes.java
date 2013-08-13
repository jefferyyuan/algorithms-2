package idv.np.algorithms.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: Nightpig
 * Date: 2013/8/13
 * Time: 下午 8:57
 */
public class Eratosthenes {

    public static Integer[] execute(int max) {
        boolean[] table = new boolean[max];
        Arrays.fill(table, true);
        table[0] = false;
        table[1] = false;
        for (int i = 2; i < table.length; i++) {
            for (int j = i * i; j < table.length; j += i) {
                table[j] = false;
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < table.length; i++) {
            if (table[i]) {
                primes.add(i);
            }
        }
        return primes.toArray(new Integer[0]);
    }

}
