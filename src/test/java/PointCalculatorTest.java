import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PointCalculatorTest {

   private Point p1, p2, p3, p4, p0;

    @BeforeClass
    public void setUp(){
        p1 = new Point(1,1);
        p2 = new Point(-1,1);
        p3 = new Point(-1,-1);
        p4 = new Point(1,-1);
        p0 = new Point(0,0);
    }

    @Test
    public void tetGetQuarter(){
        Assert.assertEquals(PointCalculator.getQuarter(p1), Quarter.I);
        Assert.assertEquals(PointCalculator.getQuarter(p2), Quarter.II);
        Assert.assertEquals(PointCalculator.getQuarter(p3), Quarter.III);
        Assert.assertEquals(PointCalculator.getQuarter(p4), Quarter.IV);
        Assert.assertNull(PointCalculator.getQuarter(p0));
    }
}
