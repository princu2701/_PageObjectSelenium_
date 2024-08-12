package Test;

import org.testng.annotations.Test;

import PageClasses.Homepage;
import PageClasses.LoginPage;
import PageClasses.RegsterPage;
import generics.basetest;

public class FinalTest extends basetest {

	LoginPage page;

	Homepage home;

	RegsterPage reg;

	// The base should be parent class for all the test classes

	@Test

	public void logintest() {

		home = new Homepage(driver);

		home.getRegisterlinkorlogin().click();

		page = new LoginPage(driver);

		page.Login(real1, real2);

		page.getContinueButton().click();

		reg = new RegsterPage(driver);

		reg.createacc(first, last, email, number, fax);

		reg.AddressDetails(company, add1, add2, city, state, add1, country);

		reg.LoginDetails(cnfrmpass, log, pass);

	}

}
