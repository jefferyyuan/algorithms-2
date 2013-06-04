package idv.np.algorithms.q100;

import org.junit.Assert;
import org.junit.Test;

public class PlateauTest {

    @Test
    public void execute1() {
        Assert.assertEquals(4, Plateau.execute1(new int[]{1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6}));
        Assert.assertEquals(3, Plateau.execute1(new int[]{1, 2, 3, 4, 4, 4, 5, 5, 6}));
        Assert.assertEquals(4, Plateau.execute1(new int[]{1, 1, 1, 1, 2, 3, 4, 4, 4, 5, 5, 6}));
    }

    @Test
    public void execute2() {
        Assert.assertEquals(4, Plateau.execute2(new int[]{1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6}));
        Assert.assertEquals(3, Plateau.execute2(new int[]{1, 2, 3, 4, 4, 4, 5, 5, 6}));
        Assert.assertEquals(4, Plateau.execute2(new int[]{1, 1, 1, 1, 2, 3, 4, 4, 4, 5, 5, 6}));
    }

}
