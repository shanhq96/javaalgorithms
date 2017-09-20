package section1_3.test1_3_9;

import section1_3.Stack;

/**
 * Author: shanhongqiang
 * DateTime: 2017/9/20 18:05
 * Description:please write the usage of this file.
 */
public class Solution {
    public String Main(String src) {
        Stack<String> numStack = new Stack<>();
        Stack<String> opsStack = new Stack<>();
        for (String s : src.split(" ")) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                opsStack.push(s);
            } else if (s.equals(")")) {
                String num2 = numStack.pop();
                String dst = "( " + numStack.pop() + " " + opsStack.pop() + " " + num2 + " )";
                numStack.push(dst);
            } else {
                numStack.push(s);
            }
        }
        return numStack.pop();
    }

}
