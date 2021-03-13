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
    public void squareRootTruePositive() {
        Assert.assertEquals("Square root of an number for true positive result",8,objcalculator.squareRoot(64),0.001);
    }

    @Test
    public void squareRootFalsePositive() {
        Assert.assertNotEquals("Square root of an number for false positive result",6,objcalculator.squareRoot(64),0.001);
    }

    @Test
    public void factorialTruePositive() {
        Assert.assertEquals("Factorial of a number for true positive result",120,objcalculator.factorial(5));
    }

    @Test
    public void factorialFalsePositive() {
        Assert.assertEquals("Factorial of a number for false positive result",100,objcalculator.factorial(5));
    }

    @Test
    public void logBaseETruePositive() {
        Assert.assertEquals("logBaseE of a number for true positive result",2.30,objcalculator.logBaseE(10),0.001);
    }

    @Test
    public void logBaseEFalsePositive() {
        Assert.assertEquals("logBaseE of a number for false positive result",3.20,objcalculator.logBaseE(10),0.001);
    }

    @Test
    public void powerTruePositive() {
        Assert.assertEquals("power of a to b for true postive result",32,objcalculator.power(2,5),0.001);
    }

    @Test
    public void powerFalsePositive() {
        Assert.assertEquals("power of a to b for false postive result",20,objcalculator.power(2,5),0.001);
    }
}