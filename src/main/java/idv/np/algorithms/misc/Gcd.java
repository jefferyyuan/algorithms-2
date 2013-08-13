package idv.np.algorithms.misc;

/**
 * User: Nightpig
 * Date: 2013/8/13
 * Time: 下午 9:22
 */
public class Gcd {

    public static int execute(int a, int b) {
        return b == 0 ? a : execute(b, a % b);
    }

}
