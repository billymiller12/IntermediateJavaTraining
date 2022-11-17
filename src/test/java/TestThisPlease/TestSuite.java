package TestThisPlease;

import org.junit.Assert;
import org.junit.Test;

public class TestSuite {

    @Test
    public void testAddInt()    {
        int a = 1;
        int b = 2;

        int result = Computations.addInt(a,b);
        Assert.assertEquals("Should be 3",3,result);
    }

    @Test (expected = ArithmeticException.class)
    public void testDivideDouble()  {
        double a=1;
        double b=2;

        double result = Computations.divideDouble(a,b);
    }



}
