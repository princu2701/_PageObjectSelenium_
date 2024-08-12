package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegsterPage {

	WebDriver driver;

	Select text;

	public RegsterPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "[name='firstname']")
	private WebElement firstElement;

	@FindBy(css = "[name='lastname']")
	private WebElement lastElement;

	@FindBy(css = "[name='email']")
	private WebElement emailElement;

	@FindBy(css = "[name='telephone']")
	private WebElement telephonElement;

	@FindBy(css = "[name='fax']")
	private WebElement faxElement;

	@FindBy(css = "[name='company']")
	private WebElement companyElement;

	@FindBy(css = "[name='address_1']")
	private WebElement Address1;

	@FindBy(css = "[name='address_2']")
	private WebElement Address2;

	@FindBy(css = "[name='city']")
	private WebElement cityElement;

	@FindBy(css = "[name='zone_id']")
	private WebElement stateDropElement;

	@FindBy(css = "[name='postcode']")
	private WebElement postElement;

	@FindBy(css = "[name='country_id']")
	private WebElement countrydropElement;

	@FindBy(css = "[name='loginname']")
	private WebElement loginRElement;

	@FindBy(css = "[name='password']")
	private WebElement PasswordR;

	@FindBy(css = "[name='confirm']")
	private WebElement confirmPElement;

	@FindBy(css = "[type='checkbox']")
	private WebElement ticElement;

	@FindBy(css = "[title='Continue']")
	private WebElement Continue2;

	public WebElement getFirstElement() {
		return firstElement;
	}

	public WebElement getLastElement() {
		return lastElement;
	}

	public WebElement getEmailElement() {
		return emailElement;
	}

	public WebElement getTelephonElement() {
		return telephonElement;
	}

	public WebElement getFaxElement() {
		return faxElement;
	}

	public WebElement getCompanyElement() {
		return companyElement;
	}

	public WebElement getAddress1() {
		return Address1;
	}

	public WebElement getAddress2() {
		return Address2;
	}

	public WebElement getCityElement() {
		return cityElement;
	}

	public WebElement getStateDropElement() {
		return stateDropElement;
	}

	public WebElement getPostElement() {
		return postElement;
	}

	public WebElement getCountrydropElement() {
		return countrydropElement;
	}

	public WebElement getLoginRElement() {
		return loginRElement;
	}

	public WebElement getPasswordR() {
		return PasswordR;
	}

	public WebElement getConfirmPElement() {
		return confirmPElement;
	}

	public WebElement getTicElement() {
		return ticElement;
	}

	public WebElement getContinue2() {
		return Continue2;
	}

	public void createacc(String firstname, String lastname, String email, String telephone, String fax) {

		firstElement.sendKeys(firstname);

		lastElement.sendKeys(lastname);

		emailElement.sendKeys(email);

		telephonElement.sendKeys(telephone);

		faxElement.sendKeys(fax);

	}

	public void AddressDetails(String company, String address1, String address2, String city, String state, String post,
			String country) {

		companyElement.sendKeys(company);

		Address1.sendKeys(address1);

		Address2.sendKeys(address2);

		cityElement.sendKeys(city);

		text = new Select(countrydropElement);

		text.selectByValue("99");

		text = new Select(stateDropElement);

		text.selectByValue("1479");

		postElement.sendKeys(post);

	}

	public void LoginDetails(String login, String password, String confrmString) {

		loginRElement.sendKeys(login);

		PasswordR.sendKeys(password);

		confirmPElement.sendKeys(confrmString);

		ticElement.click();

		Continue2.click();

	}

}
