import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases extends Parameters {

	@BeforeTest
	public void mySetup() {

		driver.get("https://automationteststore.com/");

	}

	@Test(priority = 1, enabled = false)
	public void signUp() {

		WebElement signUpButton = driver.findElement(By.id("customernav"));
		signUpButton.click();

		WebElement register = driver.findElement(By.cssSelector(".col-sm-6.newcustomer"));
		WebElement continueButton = register.findElement(By.cssSelector(".btn.btn-orange.pull-right"));
		continueButton.click();

	}

	@Test(priority = 2, enabled = false)
	public void registerInfo() throws InterruptedException {

		WebElement contentPanel = driver.findElement(By.cssSelector(".col-md-12.col-xs-12.mt20"));

		WebElement firstName = contentPanel.findElement(By.id("AccountFrm_firstname"));
		WebElement lastName = contentPanel.findElement(By.id("AccountFrm_lastname"));
		WebElement email = contentPanel.findElement(By.id("AccountFrm_email"));
		WebElement address = contentPanel.findElement(By.id("AccountFrm_address_1"));
		WebElement city = contentPanel.findElement(By.id("AccountFrm_city"));

		firstName.sendKeys("Musab");
		lastName.sendKeys("Sadoon");
		email.sendKeys("jfkdjfoeoeoe@oekfkr12.com");
		address.sendKeys("Shafa Badran");
		city.sendKeys("Amman");

		WebElement country = contentPanel.findElement(By.id("AccountFrm_country_id"));
		List<WebElement> countryList = country.findElements(By.tagName("option"));

		WebElement jordan = countryList.get(108);
		jordan.click();

		Thread.sleep(1000);

		WebElement zone = contentPanel.findElement(By.id("AccountFrm_zone_id"));
		List<WebElement> zoneList = zone.findElements(By.tagName("option"));

		WebElement Irbid = zoneList.get(9);
		Irbid.click();

		WebElement zipCode = contentPanel.findElement(By.id("AccountFrm_postcode"));
		zipCode.sendKeys("11181");

		WebElement loginName = contentPanel.findElement(By.id("AccountFrm_loginname"));
		loginName.sendKeys("2musab");

		WebElement password = contentPanel.findElement(By.id("AccountFrm_password"));
		WebElement confirm = contentPanel.findElement(By.id("AccountFrm_confirm"));

		password.sendKeys("45yhfhfkj#@fkfghj");
		confirm.sendKeys("45yhfhfkj#@fkfghj");

		WebElement agree = contentPanel.findElement(By.id("AccountFrm_agree"));
		agree.click();

		WebElement continueButton = contentPanel.findElement(By.cssSelector("button[title='Continue']"));
		continueButton.click();
	}

	@Test(priority = 3, enabled = true)
	public void login() {

		WebElement login = driver.findElement(By.cssSelector("ul[id='customer_menu_top'] li a"));
		login.click();

		WebElement loginName = driver.findElement(By.id("loginFrm_loginname"));
		loginName.sendKeys("2musab");

		WebElement password = driver.findElement(By.id("loginFrm_password"));
		password.sendKeys("45yhfhfkj#@fkfghj");

		WebElement loginButton = driver.findElement(By.cssSelector("button[title='Login']"));
		loginButton.click();

	}

	@Test(priority = 4, enabled = false)
	public void addMenItem() {

		homePageMethod();

		WebElement section = driver.findElement(By.cssSelector(".nav-pills.categorymenu"));
		List<WebElement> sectionList = section.findElements(By.tagName("li"));

		WebElement men = sectionList.get(34);
		men.click();

	}

	@Test(priority = 5, enabled = false)
	public void addCK() {

		WebElement ck = driver.findElement(By.cssSelector(".productcart"));
		ck.click();

		addToCartMethod();

		WebElement section = driver.findElement(By.cssSelector(".nav-pills.categorymenu"));
		List<WebElement> sectionList = section.findElements(By.tagName("li"));

		WebElement men = sectionList.get(34);
		men.click();

	}

	@Test(priority = 6, enabled = false)
	public void Deodorant() {

		WebElement menItem = driver.findElement(By.cssSelector(".thumbnails.grid.row.list-inline"));
		List<WebElement> menItemList = menItem.findElements(By.cssSelector(".productcart"));

		WebElement doveDeodorant = menItemList.getLast();
		doveDeodorant.click();

	}

	@Test(priority = 7, enabled = false)
	public void footer() {

		WebElement contact = driver.findElement(By.cssSelector(".contact"));
		List<WebElement> contactList = contact.findElements(By.tagName("li"));

		String actualContact = contactList.get(0).getText();
		String expectedContact = " +123 456 7890";

		Assert.assertEquals(actualContact, expectedContact);

	}

	@Test(priority = 8,enabled = false)
	public void hairCare() {

		homePageMethod();

		WebElement section = driver.findElement(By.cssSelector(".nav-pills.categorymenu"));
		List<WebElement> sectionList = section.findElements(By.tagName("li"));

		WebElement hairCareSection = sectionList.get(41);
		hairCareSection.click();

	}

	@Test(priority = 9,enabled = false)
	public void Seaweed() {

		WebElement hairCareItems = driver.findElement(By.cssSelector(".thumbnails.grid.row.list-inline"));
		List<WebElement> hairCareItemsList = hairCareItems.findElements(By.tagName("div"));

		WebElement seaweedConditioner = hairCareItemsList.get(1);
		seaweedConditioner.click();

	}

	@Test(priority = 10,enabled = false)
	public void addSeaweed() {

		addToCartMethod();
	}
	
	@Test(priority = 11)
	public void siteMap() {
		
		WebElement siteMapPage = driver.findElement(By.linkText("Site Map"));
		siteMapPage.click();
		
		WebElement contents = driver.findElement(By.cssSelector(".col-md-12.col-xs-12.mt20"));
		String capitalContents = contents.getText().toUpperCase();
		
		System.out.println(capitalContents);
	}

}