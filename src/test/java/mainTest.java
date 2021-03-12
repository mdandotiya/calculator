import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class mainTest {

    private Main objcalculator;

    @Before
    public void setObjcalculator(){
        objcalculator  = new Main();
    }

    @Test
    public void squareRoot() {
        double a = 64;
        double expectedresult = 8;
        double result = objcalculator.squareRoot(a);
        Assert.assertEquals(expectedresult,result,0.001);
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
        double expectedresult = 2.302585092994046;
        double result = objcalculator.logBaseE(a);
        Assert.assertEquals(expectedresult,result,0.001);
    }

    @Test
    public void power() {
        double a= 2,b=5;
        double expectedresult = 32;
        double result = objcalculator.power(a,b);
        Assert.assertEquals(expectedresult,result,0.001);
    }
}