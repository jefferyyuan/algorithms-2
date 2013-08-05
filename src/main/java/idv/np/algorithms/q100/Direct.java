package idv.np.algorithms.q100;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Nightpig
 * Date: 2013/8/5
 * Time: 下午 9:40
 * This program lists all subsets of a given set with elements {1,2,...,n}.
 */
public class Direct {

    public static List<String> execute(int n) {
        boolean[] digits = new boolean[n];
        List<String> result = new ArrayList<>();
        result.add("{}");
        while (true) {
            int i;
            for (i = 0; i < n && digits[i]; digits[i] = false, i++) ;
            if (i == n) {
                break;
            }
            digits[i] = true;
            for (i = 0; i < n && !digits[i]; i++) ;
            StringBuilder set = new StringBuilder("{");
            set.append(i + 1).append(",");
            for (int j = i + 1; j < n; j++) {
                if (digits[j]) {
                    set.append(j + 1).append(",");
                }
            }

            result.add(set.append("}").toString());
        }
        return result;
    }

}
