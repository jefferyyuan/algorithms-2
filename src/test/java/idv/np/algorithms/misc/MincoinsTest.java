package idv.np.algorithms.misc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Nightpig
 * Date: 2013/8/12
 * Time: 下午 2:48
 */
public class MincoinsTest {

    @Test
    public void execute() {
        assertEquals(3, Mincoins.execute(11, new int[]{1, 3, 5}));
        assertEquals(-1, Mincoins.execute(11, new int[]{5, 5, 5}));
    }

}
