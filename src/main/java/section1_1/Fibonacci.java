package section1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Author: shanhongqiang
 * DateTime: 2017/9/13 20:16
 * Description:please write the usage of this file.
 */
public class Fibonacci {
    static long[] temp = new long[100];

    public static long F(int N) {
        if (N == 0) {
            temp[N] = 0L;
        }else  if (N == 1) {
            temp[N] = 1L;
        }else {
            temp[N] = temp[N - 2] + temp[N - 1];
        }

        return temp[N];
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + F(N));
    }

}
