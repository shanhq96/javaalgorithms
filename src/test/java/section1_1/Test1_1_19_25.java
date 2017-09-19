package section1_1;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

/**
 * Author: shanhongqiang
 * DateTime: 2017/9/13 20:15
 * Description:please write the usage of this file.
 */
public class Test1_1_19_25 {

    /**
     * 计算ln(N!)的值
     *
     * @param X
     * @return
     */
    public static double lnxxx(double X) {
        return lnxxx(X, 0);
    }

    private static double lnxxx(double X, double result) {
        if (X == 0 || X == 1) {
            return result;
        }
        return lnxxx(X - 1, Math.log(X) + result);
    }

    @Test
    public void test1_1_20() {
        StdOut.println(lnxxx(0) + " " + Math.log(1));
        StdOut.println(lnxxx(1) + " " + Math.log(1));
        StdOut.println(lnxxx(2) + " " + Math.log(2));
        StdOut.println(lnxxx(3) + " " + Math.log(6));
        StdOut.println(lnxxx(4) + " " + Math.log(24));
        StdOut.println(lnxxx(5) + " " + Math.log(120));
    }
}
