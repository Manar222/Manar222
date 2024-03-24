import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
    private By enterEmail = By.id("Email");
    private WebElement enterEmailElement;
    private By enterPassword = By.id("Password");
    private WebElement enterPasswordElement;
    private By rememberMe =By.id("RememberMe");
    private WebElement rememberMeElement;
    private By loginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    private WebElement loginButtonElement;
    public void EnterEmail(String email)
    {
        enterEmailElement=driver.findElement(enterEmail);
        sendText(enterEmailElement,email);
    }
    public void EnterPassword(String pass)
    {
        enterPasswordElement=driver.findElement(enterPassword);
        sendText(enterPasswordElement,pass);
    }
    public void RememberMeButton()
    {
        rememberMeElement=driver.findElement(rememberMe);
        Clicking(rememberMeElement);

    }

    public void ClickOnLoginButton()
    {
        loginButtonElement=driver.findElement(loginButton);
        Clicking(loginButtonElement);

    }

}
