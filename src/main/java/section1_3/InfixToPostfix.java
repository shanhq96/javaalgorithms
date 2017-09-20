package section1_3;

/**
 * Author: shanhongqiang
 * DateTime: 2017/9/20 18:28
 * Description:please write the usage of this file.
 */
public class InfixToPostfix {

    public String Main(String infixStr) {
        Stack<String> numStack = new Stack<>();
        Stack<String> opsStack = new Stack<>();
        for (String s : infixStr.split(" ")) {
            if (s.equals("(")){

            } else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                opsStack.push(s);
            } else if (s.equals(")")) {
                String num2 = numStack.pop();
                String dst = numStack.pop() + " " + num2 + " " + opsStack.pop();
                numStack.push(dst);
            } else {
                numStack.push(s);
            }
        }
        return numStack.pop();
    }

}
