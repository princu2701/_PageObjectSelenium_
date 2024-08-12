package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "[name='loginname']")
	private WebElement login;

	@FindBy(css = "[name='password']")
	private WebElement password;

	@FindBy(linkText = "Forgot your password?")
	private WebElement ForgotPass;

	@FindBy(linkText = "Forgot your login?")
	private WebElement Forgotlogin;

	@FindBy(css = "[title='Login']")
	private WebElement Loginbutton;

	@FindBy(css = "[title='Continue']")
	private WebElement ContinueButton;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getForgotPass() {
		return ForgotPass;
	}

	public WebElement getForgotlogin() {
		return Forgotlogin;
	}

	public WebElement getLoginbutton() {
		return Loginbutton;
	}

	public WebElement getContinueButton() {
		return ContinueButton;
	}

	public void Login(String username, String pasword) {

		login.sendKeys(username);

		password.sendKeys(pasword);

		Loginbutton.click();

	}

}
