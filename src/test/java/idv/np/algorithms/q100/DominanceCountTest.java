package idv.np.algorithms.q100;

import org.junit.Assert;
import org.junit.Test;

public class DominanceCountTest {

    @Test
    public void execute() {
        Assert.assertEquals(12, DominanceCount.execute(new int[]{1, 3, 5, 7, 9}, new int[]{2, 3, 4, 7, 8}));
        Assert.assertEquals(20, DominanceCount.execute(new int[]{1, 3, 5, 7, 9}, new int[]{2, 2, 2, 2, 2}));
        Assert.assertEquals(0, DominanceCount.execute(new int[]{2, 2, 2, 2, 2}, new int[]{2, 2, 2, 2, 2}));
    }

}
