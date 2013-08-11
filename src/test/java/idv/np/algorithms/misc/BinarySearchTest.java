package idv.np.algorithms.misc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Nightpig
 * Date: 2013/8/11
 * Time: 下午 9:16
 */
public class BinarySearchTest {

    @Test
    public void execute() {
        assertEquals(-1, BinarySearch.execute(new int[]{}, -100));
        assertEquals(0, BinarySearch.execute(new int[]{-100}, -100));
        assertEquals(2, BinarySearch.execute(new int[]{-100, -1, 0, 1, 2}, 0));
        assertEquals(-1, BinarySearch.execute(new int[]{-100, -1, 0, 1, 2}, 3));
    }

}
