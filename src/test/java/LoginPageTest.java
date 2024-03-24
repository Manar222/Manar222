import org.testng.annotations.Test;

public class LoginPageTest extends TestBase{
    private HomePage homePage;
    private LoginPage loginPage;
    @Test
    public void ValidLogin() {
        homePage = new HomePage(driver);
        loginPage = homePage.clickOnLoginButton();
        loginPage.EnterEmail("ashraf@gmail.com");
        loginPage.EnterPassword("123456789");
        loginPage.RememberMeButton();
        loginPage.ClickOnLoginButton();
    }

}
