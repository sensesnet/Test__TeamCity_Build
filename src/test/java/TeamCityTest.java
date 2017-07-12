import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Kirill on 12.07.2017.
 */
public class TeamCityTest {
    @DataProvider(name = "DataProvider")
    public static Object[][] DataProvider() {
        return new Object [][]{
            {"a","a"},
            {"b","b"}
        };
    }

    @Test(dataProvider = "DataProvider")
    public void testTeamCity(String s_1, String s_2) throws Exception {

        try {
            Assert.assertEquals(s_1,s_2,"Object was't equal!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
