import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalculatorTest {

    int sum = 5;
    int[] val = new int[]{1, 2};
    int[][] twoD = new int[][]{
        {1,1},
        {2,2}
    };

    @BeforeMethod
    public void setUp(ITestResult result) {
        String methodName = result.getMethod().getMethodName();
        System.out.println("I am running at the start of " + methodName);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("I am running at the end");
    }

    @Parameters({"first-number", "second-number"})
    @Test(groups = {"smoke", "critical"}/*, dataProviderClass = Calculator.class, dataProvider =
        "testDataProvider"*/)
    public void testCalculations(@Optional(value = "1") int a, @Optional(value = "3")int b) throws Exception {
        Calculator calculator = new Calculator();
        int sum = calculator.add(a, b);
        Assert.assertEquals(sum, 3);

        int diff = calculator.subtract(2, 2);
        Assert.assertEquals(diff, 0);
    }

    @Test
    public void testCalculationsThroughOut() throws Exception {
        SoftAssert softly = new SoftAssert();
        Calculator calculator = new Calculator();
        int sum = calculator.add(1, 2);
        softly.assertEquals(sum, 3);

        int diff = calculator.subtract(2, 2);
        softly.assertEquals(diff, 0);

        softly.assertAll();

    }


    @DataProvider(name = "testDataProvider")
    public Object[][] testDataGenerator() {
        return new Object[][]{
            {1, 2},
            {1, 3}
        };

    }
}
