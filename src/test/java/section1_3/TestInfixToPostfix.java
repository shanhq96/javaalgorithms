package section1_3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Author: shanhongqiang
 * DateTime: 2017/9/20 18:32
 * Description:please write the usage of this file.
 */
public class TestInfixToPostfix {
    InfixToPostfix infixToPostfix = new InfixToPostfix();
    @Test
    public void test(){
        Assert.assertEquals("1 2 + 3 4 - 5 6 - * *",infixToPostfix.Main("( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )"));
    }

}
