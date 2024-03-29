package idv.np.algorithms.q100;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * User: Nightpig
 * Date: 2013/7/7
 * Time: 下午 8:15
 */
public class ArmstrongTest {

    @Test
    public void execute() {
        assertArrayEquals(new int[]{153, 370, 371, 407}, Armstrong.execute(3));
        assertArrayEquals(new int[]{1634, 8208, 9474}, Armstrong.execute(4));
    }

}
