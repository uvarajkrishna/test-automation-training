import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenStartTest {

    @Test
    public void testPrint() {
        MavenStartApp  mavenStartApp = new MavenStartApp();
        mavenStartApp.print();
        Assert.assertEquals(1,2);
    }
}
