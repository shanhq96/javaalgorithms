package section1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Author: shanhongqiang
 * DateTime: 2017/9/20 16:33
 * Description:please write the usage of this file.
 */
public class FixedCapacityStackOfStrings {

    private String[] a;// stach entries
    private int N;// size

    public FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean isFull(){
        return N == a.length;
    }

    public int size() {
        return N;
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop() {
        return a[--N];
    }

    public static void main(String[] args) {
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        System.setIn(ReadInput(args[0]));
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
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
