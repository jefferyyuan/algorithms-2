package idv.np.q100;

/**
 * User: Nightpig
 * Date: 2013/5/27
 * Time: 下午 8:26
 * Given an array, try to develop an efficient algorithm which can compute the length of the longest plateau.
 * A plateau is a consecutive segment of an array with equal contents. For example, if x[] = {1, 2, 3, 4, 4, 4, 5, 5, 6},
 * then we have six plateaus which are 1, 2, 3, 4-4-4, 5-5 and 6. And obviously the length of the longest plateaus is 3.
 */
public class Plateau {

    public static int plateau(int[] data) {
        if (data.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = 1;
        for (int i = 1; i < data.length; i++) {
            if (data[i - length] == data[i]) {
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(plateau(new int[]{1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6}));
        System.out.println(plateau(new int[]{1, 2, 3, 4, 4, 4, 5, 5, 6}));
        System.out.println(plateau(new int[]{1, 1, 1, 1, 2, 3, 4, 4, 4, 5, 5, 6}));
    }

}
