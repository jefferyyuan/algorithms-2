package idv.np.algorithms.q100;

import org.junit.Assert;
import org.junit.Test;

/**
 * User: Nightpig
 * Date: 2013/8/5
 * Time: 下午 10:33
 */
public class DirectTest {

    @Test
    public void execute() {
        Assert.assertEquals(16, Direct.execute(4).size());
    }

}
