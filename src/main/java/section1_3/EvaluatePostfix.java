package section1_3;

/**
 * Author: shanhongqiang
 * DateTime: 2017/9/20 18:39
 * Description:please write the usage of this file.
 */
public class EvaluatePostfix {
    public double Main(String src) {
        Stack<Double> numsStack = new Stack<>();
        for (String s : src.split(" ")) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                double v = numsStack.pop();
                if (s.equals("+")) {
                    v = numsStack.pop() + v;
                } else if (s.equals("-")) {
                    v = numsStack.pop() - v;
                } else if (s.equals("*")) {
                    v = numsStack.pop() * v;
                } else if (s.equals("/")) {
                    v = numsStack.pop() / v;
                }
                numsStack.push(v);
            } else {
                numsStack.push(Double.parseDouble(s));
            }
        }
        return numsStack.pop();
    }


}
