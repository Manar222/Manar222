import org.testng.annotations.Test;

public class HomePageTest extends TestBase{
    private HomePage homePage;
    @Test
    public void ValidSearch()
    {
        homePage = new HomePage(driver);
        homePage.SearchAbout("laptop");
        homePage.ClickOnSearchButton();
    }
}
