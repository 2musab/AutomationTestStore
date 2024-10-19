import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameters {

	WebDriver driver = new ChromeDriver();
	Random rand = new Random();

	public void addToCartMethod() {

		WebElement addToCart = driver.findElement(By.cssSelector(".cart"));
		addToCart.click();
	}

	public void homePageMethod() {

		WebElement homePage = driver.findElement(By.cssSelector(".logo"));
		homePage.click();
	}
	
	public WebElement sectionMethod(int index) {
		
		WebElement section = driver.findElement(By.cssSelector(".nav-pills.categorymenu"));
		List<WebElement> sectionList = section.findElements(By.tagName("li"));
		return sectionList.get(index);
		
	}

}
