import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends PageBase{
    public RegisterPage(WebDriver driver)
    {
        super(driver);
    }
    private By genderMale = By.id("gender-male");
    private WebElement genderMaleElement;
    private By firstName = By.id("FirstName");
    private WebElement firstNameElement;
    private By lastName = By.id("LastName");
    private WebElement lastNameElement;
    private By emailField = By.id("Email");
    private WebElement emailElement;
    private By passwordField = By.id("Password");
    private WebElement passwordElement;
    private By rePasswordField = By.id("ConfirmPassword");
    private WebElement rePasswordElement;
    private By registerButton = By.id("register-button");
    private WebElement registerButtonElement;

    public void EnterFirstName(String fName)
    {
        firstNameElement=driver.findElement(firstName);
        sendText(firstNameElement,fName);
    }
    public void EnterLastName(String lName)
    {
        lastNameElement=driver.findElement(lastName);
        sendText(lastNameElement,lName);

    }
    public void EnterEmail(String email)
    {
        emailElement=driver.findElement(emailField);
        sendText(emailElement ,email);

    }
    public void EnterPassword(String password)
    {
        passwordElement=driver.findElement(passwordField);
        sendText(passwordElement,password);
    }
    public void EnterRePassword(String rePassword)
    {
        rePasswordElement=driver.findElement(rePasswordField);
        sendText(rePasswordElement,rePassword);
    }
    public void chooseGender()
    {
        genderMaleElement=driver.findElement(genderMale);
        Clicking(genderMaleElement);

    }
    public void ClickOnRegisterButton()
    {
        registerButtonElement=driver.findElement(registerButton);
        Clicking(registerButtonElement);

    }


}
