package idv.np.algorithms.uva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main105 {

    public static void main(String[] args) {
        List<int[]> bds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int[] bd = new int[3];
            bd[0] = sc.nextInt();
            bd[1] = sc.nextInt();
            bd[2] = sc.nextInt();
            bds.add(bd);
        }
        sc.close();
        int maxR = 0;
        int[] data = new int[10000];
        // init height
        Arrays.fill(data, 0);
        for (int[] bd : bds) {
            for (int j = bd[0]; j < bd[2]; j++) {
                // update height
                data[j] = (bd[1] > data[j]) ? bd[1] : data[j];
            }
            // udpate boundary
            maxR = (bd[2] > maxR) ? bd[2] : maxR;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= maxR; i++) {
            if (data[i - 1] != data[i]) {
                builder.append(i).append(" ").append(data[i]).append(" ");
            }
        }
        System.out.println(builder.toString().trim());
    }

}
