package idv.np.algorithms.misc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Nightpig
 * Date: 2013/8/13
 * Time: 下午 9:30
 */
public class LcmTest {

    @Test
    public void execute() {
        assertEquals(1170, Lcm.execute(90, 26));
    }

}
