package firstautomationcodepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayOptionsInDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//Mohan//Downloads//chromedriver_win32 (2)//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.name("q"));
		Thread.sleep(5000);
		element.sendKeys("facebook sign up");
		Thread.sleep(5000);
		WebElement element1 = driver.findElement(By.name("btnG"));
		Thread.sleep(5000);
		element1.click();
		Thread.sleep(5000);
		WebElement element2 = driver.findElement(By.linkText("Sign Up for Facebook | Facebook"));
		element2.click();
		WebElement dropdown = driver.findElement(By.id("month"));
		dropdown.click();
		List<WebElement> months = dropdown.findElements(By.tagName("option"));
		System.out.println("The valus in drop down are displayed as follows:");
for(int i = 0; i<months.size(); i++){
	String value = months.get(i).getText();
	System.out.println(value);
}

driver.close();

	}

}
