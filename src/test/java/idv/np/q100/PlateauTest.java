package idv.np.q100;

import org.junit.Assert;
import org.junit.Test;

public class PlateauTest {

    @Test
    public void plateau1() {
        Assert.assertEquals(4, Plateau.plateau1(new int[]{1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6}));
        Assert.assertEquals(3, Plateau.plateau1(new int[]{1, 2, 3, 4, 4, 4, 5, 5, 6}));
        Assert.assertEquals(4, Plateau.plateau1(new int[]{1, 1, 1, 1, 2, 3, 4, 4, 4, 5, 5, 6}));
    }

    @Test
    public void plateau2() {
        Assert.assertEquals(4, Plateau.plateau2(new int[]{1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6}));
        Assert.assertEquals(3, Plateau.plateau2(new int[]{1, 2, 3, 4, 4, 4, 5, 5, 6}));
        Assert.assertEquals(4, Plateau.plateau2(new int[]{1, 1, 1, 1, 2, 3, 4, 4, 4, 5, 5, 6}));
    }

}
