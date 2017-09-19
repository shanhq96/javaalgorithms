package section1_1;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

/**
 * Author: shanhongqiang
 * DateTime: 2017/9/14 20:21
 * Description:please write the usage of this file.
 */
public class Test1_1_30 {
    @Test
    public void test() {
        int N = 5;
        boolean[][] a = new boolean[N][N];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                a[i][j] = Euclid.gcd(i, j) == 1;
                a[j][i] = a[i][j];
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                StdOut.printf("%7s",a[i][j]);
            }
            StdOut.println();
        }
    }
}
