package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;

	public Homepage(WebDriver driver) {

		// Initialize driver using this.driver as reference

		this.driver = driver;

		// Use page factory and store [driver and this] parameter in it

		PageFactory.initElements(driver, this);

	}

	// Now, use @findby and initialize using the web elements and then private
	// web element keywords
	@FindBy(linkText = "Login or register")
	private WebElement registerlinkorlogin;

	@FindBy(css = "[class='menu_text']")
	private WebElement Specials;

	@FindBy(xpath = "(//*[.='Account'])[1]")
	private WebElement Account;

	@FindBy(xpath = "(//*[.='Cart'])[1]")
	private WebElement Cart;

	@FindBy(xpath = "(//*[.='Checkout'])[1]")
	private WebElement Checkout;

	public WebElement getRegisterlinkorlogin() {
		return registerlinkorlogin;
	}

	public WebElement getSpecials() {
		return Specials;
	}

	public WebElement getAccount() {
		return Account;
	}

	public WebElement getCart() {
		return Cart;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	// Do right click and select the getters from the pop upbox to get the all

}
