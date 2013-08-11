package idv.np.algorithms.q100;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Nightpig
 * Date: 2013/6/23
 * Time: 上午 10:46
 */
public class MinDistanceTest {

    @Test
    public void execute() {
        assertEquals(1, MinDistance.execute(new int[]{1, 3, 5, 7, 9}, new int[]{2, 6, 8}));
        assertEquals(0, MinDistance.execute(new int[]{1, 4, 5, 6, 7, 9}, new int[]{2, 4, 6, 8}));
    }

}
