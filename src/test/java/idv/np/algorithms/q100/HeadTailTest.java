package idv.np.algorithms.q100;

import org.junit.Assert;
import org.junit.Test;

public class HeadTailTest {

    @Test
    public void execute() {
        Assert.assertEquals(3, HeadTail.execute(new int[]{3, 6, 2, 1, 4, 5, 2}));
    }

}
