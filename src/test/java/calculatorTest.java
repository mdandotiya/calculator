import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {

    private calculator objcalculator;

    @Before
    void setObjcalculator(){
        objcalculator  = new calculator();
    }

    @Test
    public void squareRoot() {
        double a = 64;
        double expectedresult = 8;
        double result = objcalculator.squareRoot(a);
        Assert.assertEquals(expectedresult,result);
    }

    @Test
    public void factorial() {
        int a = 5;
        int expectedresult = 120;
        int result = objcalculator.factorial(a);
        Assert.assertEquals(expectedresult,result);
    }

    @Test
    public void logBaseE() {
        double a = 10;
        double expectedresult = 2.30;
        double result = objcalculator.logBaseE(a);
        Assert.assertEquals(expectedresult,result);
    }

    @Test
    public void power() {
        double a= 2,b=5;
        double expectedresult = 32;
        double result = objcalculator.power(a,b);
        Assert.assertEquals(expectedresult,result);
    }
}