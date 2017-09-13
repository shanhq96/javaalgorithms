package section1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class BinarySearchRecursion {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int level) {
        for (int i=0;i<level;i++){
            StdOut.print("_");
        }
        StdOut.println(lo + " " + hi);

        //如果key存在于a[]中，它的索引不会小于lo且不会大于hi
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1, level + 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, level + 1);
        else return mid;
    }


    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        System.setIn(ReadInput(args[1]));
        while (!StdIn.isEmpty()) {
            //读取键值，如果不存在于白名单中则将其打印
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0) {
                StdOut.println(key);
            }
        }
    }

    public static InputStream ReadInput(String filepath) {
        try {
            return new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\data\\" + filepath);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
        }
        return null;
    }


}
