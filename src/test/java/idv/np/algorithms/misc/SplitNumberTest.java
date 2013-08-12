package idv.np.algorithms.misc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Nightpig
 * Date: 2013/8/12
 * Time: 下午 6:35
 */
public class SplitNumberTest {

    @Test
    public void execute() {
        assertEquals(7, SplitNumber.execute(5));
        assertEquals(190569292, SplitNumber.execute(100));
    }

}
