package generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class basetest {

	// We have to create before class and after class in this
	protected WebDriver driver;

	protected String real1;

	protected String real2;

	protected String origin;

	protected String first;

	protected String last;

	protected String email;

	protected String number;

	protected String fax;

	protected String company;

	protected String add1;

	protected String add2;

	protected String city;

	protected String state;

	protected String zip;

	protected String country;

	protected String log;

	protected String pass;

	protected String cnfrmpass;

	@BeforeClass

	public void setup() throws IOException {

		driver = new ChromeDriver();

		// pCreate a property object for attracting data from config.properties

		Properties properties = new Properties();

		// Give the path using fileinputstream

		FileInputStream file = new FileInputStream(
				"C:\\Users\\Prince Raj\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\POMNEW1\\src\\test\\resources\\config.properties");

		// Load file in it

		properties.load(file);

		// USe .getproperty and store it in a string (url)

		origin = properties.getProperty("url");

		real1 = properties.getProperty("emailid");

		real2 = properties.getProperty("password");

		first = properties.getProperty("firstname");

		last = properties.getProperty("lastname");

		email = properties.getProperty("email");

		number = properties.getProperty("telephone");

		fax = properties.getProperty("fax");

		company = properties.getProperty("company");

		add1 = properties.getProperty("address1");

		add2 = properties.getProperty("address2");

		city = properties.getProperty("city");

		state = properties.getProperty("statedrop");

		zip = properties.getProperty("post");

		country = properties.getProperty("country");

		log = properties.getProperty("log");

		pass = properties.getProperty("pass");

		cnfrmpass = properties.getProperty("confirm");

		// Call it using driver.get

		driver.get(origin);

		// Now, We can some extra features for our convenience

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();

	}

	@AfterClass

	public void teardown() throws InterruptedException {

		Thread.sleep(2000);

		driver.close();

	}
}
