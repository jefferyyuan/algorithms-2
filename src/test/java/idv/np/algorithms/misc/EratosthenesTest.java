package idv.np.algorithms.misc;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * User: Nightpig
 * Date: 2013/8/13
 * Time: 下午 9:05
 */
public class EratosthenesTest {

    @Test
    public void execute() {
        assertArrayEquals(new Integer[]{
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        }, Eratosthenes.execute(100));
    }

}
