package idv.np.algorithms.q100;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Nightpig
 * Date: 2013/8/5
 * Time: 下午 10:33
 */
public class DirectTest {

    @Test
    public void execute() {
        assertEquals(16, Direct.execute(4).size());
    }

}
