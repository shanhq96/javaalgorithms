package section1_3;

import org.junit.Assert;
import org.junit.Test;
import section1_3.test1_3_9.Solution;

/**
 * Author: shanhongqiang
 * DateTime: 2017/9/20 18:15
 * Description:please write the usage of this file.
 */
public class Test1_3_9 {
    Solution solution =new Solution();

    @Test
    public void test(){
        Assert.assertEquals("( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )",solution.Main("1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )"));
    }
}
