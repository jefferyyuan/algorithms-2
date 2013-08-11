package idv.np.algorithms.q100;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlateauTest {

    @Test
    public void execute1() {
        assertEquals(4, Plateau.execute1(new int[]{1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6}));
        assertEquals(3, Plateau.execute1(new int[]{1, 2, 3, 4, 4, 4, 5, 5, 6}));
        assertEquals(4, Plateau.execute1(new int[]{1, 1, 1, 1, 2, 3, 4, 4, 4, 5, 5, 6}));
    }

    @Test
    public void execute2() {
        assertEquals(4, Plateau.execute2(new int[]{1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6}));
        assertEquals(3, Plateau.execute2(new int[]{1, 2, 3, 4, 4, 4, 5, 5, 6}));
        assertEquals(4, Plateau.execute2(new int[]{1, 1, 1, 1, 2, 3, 4, 4, 4, 5, 5, 6}));
    }

}
