package section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: shanhongqiang
 * DateTime: 2017/9/13 20:43
 * Description:please write the usage of this file.
 */
public class Section1_1_1_21 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<Integer> num1s = new ArrayList<>();
        List<Integer> num2s = new ArrayList<>();
        while (!StdIn.isEmpty()) {
            names.add(StdIn.readString());
            num1s.add(StdIn.readInt());
            num2s.add(StdIn.readInt());
        }

        for (int i = 0; i < names.size(); i++) {
            StdOut.printf("%14s\t%14d\t%14d\t%14.3f\n", names.get(i), num1s.get(i), num2s.get(i), num1s.get(i) * 1.0 / num2s.get(i));
        }
    }


}
