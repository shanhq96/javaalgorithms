package section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Author: shanhongqiang
 * DateTime: 2017/9/13 21:05
 * Description:please write the usage of this file.
 */
public class Euclid {

    public static int gcd(int p, int q) {
        StdOut.println(p + " " + q);
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        StdOut.println(gcd(1111111, 1234567));
    }
}
