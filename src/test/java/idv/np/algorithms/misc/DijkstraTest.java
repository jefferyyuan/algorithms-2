package idv.np.algorithms.misc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Nightpig
 * Date: 2013/8/14
 * Time: 下午 4:27
 */
public class DijkstraTest {

    @Test
    public void execute() {
        int[][] graph = new int[][]{
                {0, 20, -1, 80, -1, -1, 90, -1},
                {-1, 0, -1, -1, -1, 10, -1, -1},
                {-1, -1, 0, 10, -1, 50, -1, 20},
                {-1, -1, 10, 0, -1, -1, 20, -1},
                {-1, 50, -1, -1, 0, -1, 30, -1},
                {-1, -1, 10, 40, -1, 0, -1, -1},
                {20, -1, -1, -1, -1, -1, 0, -1},
                {-1, -1, -1, -1, -1, -1, -1, 0}};
        assertEquals("0 1 5 2 3", Dijkstra.execute(graph, 0, 3));
    }

}
