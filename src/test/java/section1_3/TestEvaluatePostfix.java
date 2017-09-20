package section1_3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Author: shanhongqiang
 * DateTime: 2017/9/20 18:46
 * Description:please write the usage of this file.
 */
public class TestEvaluatePostfix {
    InfixToPostfix infixToPostfix = new InfixToPostfix();
    EvaluatePostfix evaluatePostfix = new EvaluatePostfix();
    @Test
    public void test(){
        Assert.assertEquals(3,evaluatePostfix.Main(infixToPostfix.Main("( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )")),0.00001);
    }


}
