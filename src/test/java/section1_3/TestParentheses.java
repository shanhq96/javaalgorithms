package section1_3;

import org.junit.Assert;
import org.junit.Test;
import section1_3.test1_3_4.Parentheses;

/**
 * Author: shanhongqiang
 * DateTime: 2017/9/20 17:21
 * Description:please write the usage of this file.
 */
public class TestParentheses {
    Parentheses parentheses = new Parentheses();
    @Test
    public void test(){
        Assert.assertEquals(true,parentheses.isFormat("[{}](){}"));
        Assert.assertEquals(false,parentheses.isFormat("[{}](){}("));
        Assert.assertEquals(true,parentheses.isFormat("[{()()}](){}"));
    }
}
