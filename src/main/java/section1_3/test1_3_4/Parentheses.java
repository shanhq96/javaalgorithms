package section1_3.test1_3_4;

import section1_3.Stack;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: shanhongqiang
 * DateTime: 2017/9/20 17:11
 * Description:please write the usage of this file.
 */
public class Parentheses {
    private final static Map<Character,Character> rule = new HashMap<>();
    public Parentheses(){
        rule.put('}','{');
        rule.put(']','[');
        rule.put(')','(');
    }
    public boolean isFormat(String str){
        Stack<Character> characterStack = new Stack<>();
        for (char c : str.toCharArray()){
            if (!rule.containsKey(c)){
                characterStack.push(c);
            } else {
                char peek = characterStack.pop();
                if (rule.get(c) != peek){
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }
}
