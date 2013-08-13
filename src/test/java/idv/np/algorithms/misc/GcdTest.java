package idv.np.algorithms.misc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Nightpig
 * Date: 2013/8/13
 * Time: 下午 9:26
 */
public class GcdTest {

    @Test
    public void execute() {
        assertEquals(2, Gcd.execute(90, 26));
    }

}
