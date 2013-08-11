package idv.np.algorithms.q100;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoincidenceCountTest {

    @Test
    public void execute() {
        assertEquals(2, CoincidenceCount.execute(new int[]{1, 3, 4, 7, 9}, new int[]{3, 5, 7, 8, 10}));
        assertEquals(5, CoincidenceCount.execute(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, CoincidenceCount.execute(new int[]{1, 3, 5, 7, 9}, new int[]{2, 4, 6, 8, 10}));
    }

}
