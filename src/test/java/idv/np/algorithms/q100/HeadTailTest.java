package idv.np.algorithms.q100;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeadTailTest {

    @Test
    public void execute() {
        assertEquals(3, HeadTail.execute(new int[]{3, 6, 2, 1, 4, 5, 2}));
    }

}
