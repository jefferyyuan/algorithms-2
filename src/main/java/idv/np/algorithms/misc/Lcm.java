package idv.np.algorithms.misc;

/**
 * User: Nightpig
 * Date: 2013/8/13
 * Time: 下午 9:27
 */
public class Lcm {

    public static int execute(int a, int b) {
        return a * b / Gcd.execute(a, b);
    }

}
