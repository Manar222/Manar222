import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage  extends PageBase{
    public HomePage(WebDriver driver){
        super(driver);
    }
    By registerButton = By.className("ico-register");
    By loginButton = By.className("ico-login");
    WebElement registerButtonElement;
    WebElement loginButtonElement;
    public RegisterPage clickOnRegisterButton()
    {
        registerButtonElement=driver.findElement(registerButton);
        Clicking(registerButtonElement);
        return new RegisterPage(driver);
    }
    public LoginPage clickOnLoginButton()
    {
        loginButtonElement=driver.findElement(loginButton);
        Clicking(loginButtonElement);
        return new LoginPage(driver);
    }
    private By searchIndex = By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/input");
     private WebElement searchIndexElement;
    private By searchButton =By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/button");
    private WebElement searchButtonElement;
    public void SearchAbout(String search)
    {
        searchIndexElement=driver.findElement(searchIndex);
        sendText(searchIndexElement,search);
    }
    public void ClickOnSearchButton()
    {
        searchButtonElement=driver.findElement(searchButton);
        Clicking(searchButtonElement);

    }

}
