package section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Author: shanhongqiang
 * DateTime: 2017/9/12 18:20
 * Description:please write the usage of this file.
 */
public class Test {

    /**
     * 写一个静态方法lg(),接受一个整型参数N,返回不大于log2N的最大整数.不要使用Math库
     *
     * @param N
     * @return
     */
    private static int lg(int N) {
        int i = -1;
        int temp = 1;
        while (temp <= N) {
            temp = temp * 2;
            i++;
        }
        return i;
    }

    private static int[] historgram(int[] a, int M) {
        int[] result = new int[M];
        for (int j = 0; j < a.length; j++) {
            if (a[j] < M) {
                result[a[j]]++;
            }
        }
        return result;
    }

    @org.junit.Test
    public void test1_1_2() {
        StdOut.println((1 + 2.236) / 2);
        StdOut.println(1 + 2 + 3 + 4.0);
        StdOut.println(4.1 >= 4);
        StdOut.println(1 + 2 + "3");
    }

    @org.junit.Test
    public void test1_1_3() {
        int a = 1;
        int b = 1;
        int c = 1;

        StdOut.println(method1_1_3(a, b, c) ? "equal" : "not equal");
    }

    private boolean method1_1_3(int a, int b, int c) {
        return a == b && a == c;
    }

    @org.junit.Test
    public void test1_1_7() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001)
            t = (9.0 / t + t) / 2.0;
        StdOut.printf("%.5f\n", t);

        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);

        int sum1 = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < 1000; j++)
                sum1++;
        StdOut.println(sum1);

    }

    @org.junit.Test
    public void test1_1_8() {
        StdOut.println('b');
        StdOut.println('b' + 'c');
        StdOut.println((char) ('a' + 4));
    }

    @org.junit.Test
    public void test1_1_9() {
        int N = 5;
        String s = "";
        for (int n = N; n > 0; n = n >> 1) {
            s = (n % 2) + s;
        }
        StdOut.println(s);
    }

    @org.junit.Test
    public void test1_1_11() {
        boolean[][] arr = {{true, false}, {false, true}, {true, true}};
        method1_1_11(arr);

    }

    private void method1_1_11(boolean[][] arr) {
        for (int i = -1; i < arr[0].length; i++) {
            StdOut.printf("%5s", i);
        }
        StdOut.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = -1; j < arr[i].length; j++) {
                if (j == -1) {
                    StdOut.printf("%5s", i);
                } else {
                    StdOut.printf("%5s", arr[i][j] ? "*" : " ");
                }
            }
            StdOut.println();
        }
    }

    @org.junit.Test
    public void test1_1_12() {
        method1_1_12(9);
    }

    private void method1_1_12(int N) {
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = N - 1 - i;
        }
        for (int i = 0; i < N; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < N; i++) {
            StdOut.println(a[i]);
        }
    }

    @org.junit.Test
    public void test1_1_13() {
        Integer[][] arr = {{1, 2, 3}, {4, 5, 6}};
        Object[][] newArr = transpose(arr);
        printArray(arr);
        printArray(newArr);
    }

    private <T> Object[][] transpose(T[][] arr) {
        int row = arr.length;
        int line = arr[0].length;
        Object[][] newArr = new Object[line][row];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < row; j++) {
                newArr[i][j] = arr[j][i];
            }
        }
        return (T[][]) newArr;
    }

    private <T> void printArray(T[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                StdOut.printf("%5s", arr[i][j]);
            }
            StdOut.println();
        }
    }

    @org.junit.Test
    public void test1_1_14() {
        StdOut.println(lg(16));
    }


    @org.junit.Test
    public void test1_1_15() {
        int[] arr = {1, 4, 6, 2, 3, 2, 5};
        int[] result = historgram(arr, 5);

        for (int i=0;i<result.length;i++){
            StdOut.println(result[i]);
        }
    }

}
