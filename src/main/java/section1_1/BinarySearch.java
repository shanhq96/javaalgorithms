package section1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.*;
import java.util.Arrays;

/**
 * Author: shanhongqiang
 * DateTime: 2017/9/11 20:54
 * Description:please write the usage of this file.
 */
public class BinarySearch {

    public static int rank_1_1_29(int key,int[] a){
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi){
            //被查找的键要么不存在，要么必然存在于a[lo..hi]之中
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key >= a[mid]) {
                lo = mid + 1;
            }
        }
        return lo;
    }

    public static int count(int key,int[] a){
        int count = 0;
        int left = 0;
        int right = a.length - 1;
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi){
            //被查找的键要么不存在，要么必然存在于a[lo..hi]之中
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key >= a[mid]) {
                lo = mid + 1;
            }
        }
        right = lo - 1;
        hi = right;
        lo = 0;
        while (lo <= hi){
            //被查找的键要么不存在，要么必然存在于a[lo..hi]之中
            int mid = lo + (hi - lo) / 2;
            if (key <= a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            }
        }
        left = hi + 1;
        return right - left + 1;
    }

    public static int rank(int key, int[] a) {
        //数组必须是有序的
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            //被查找的键要么不存在，要么必然存在于a[lo..hi]之中
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        System.setIn(ReadInput(args[1]));
        while(!StdIn.isEmpty()){
            //读取键值，如果不存在于白名单中则将其打印
            int key = StdIn.readInt();
            /*if(rank(key,whitelist) < 0){
                StdOut.println(key);
            }*/
            //StdOut.println(rank_1_1_29(key,whitelist));
            StdOut.println(count(key,whitelist));
        }
    }

    public static InputStream ReadInput(String filepath){
        try{
            return new FileInputStream(System.getProperty("user.dir") +"\\src\\main\\resources\\data\\"+ filepath);
        }catch (FileNotFoundException e) {
            //e.printStackTrace();
        }
        return null;
    }



}
