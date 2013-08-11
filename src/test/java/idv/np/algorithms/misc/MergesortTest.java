package idv.np.algorithms.misc;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * User: Nightpig
 * Date: 2013/8/11
 * Time: 下午 8:36
 */
public class MergesortTest {

    @Test
    public void execute() {
        int[] data = new int[]{-100, -1, 0, 1, 2};
        Mergesort.execute(data);
        assertArrayEquals(new int[]{-100, -1, 0, 1, 2}, data);
    }

}
