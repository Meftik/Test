import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    @Test
    public void testSum() throws Exception{
       Calculator cal=new Calculator();
     int sum=  cal.sum(3,4);
        Assert.assertEquals(7,sum);

    }
}
