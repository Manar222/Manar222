import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    private HomePage homePage;
    private RegisterPage registerPage;
    @Test
    public void ValidRegister()
    {
        homePage=new HomePage(driver);
       registerPage= homePage.clickOnRegisterButton();
       registerPage.chooseGender();
       registerPage.EnterFirstName("Ahmed");
       registerPage.EnterLastName("Ashraf");
       registerPage.EnterEmail("ashraf@gmail.com");
       registerPage.EnterPassword("123456789");
       registerPage.EnterRePassword("123456789");
       registerPage.ClickOnRegisterButton();

    }
}
