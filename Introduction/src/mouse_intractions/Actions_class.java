package mouse_intractions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src//Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		WebElement move=driver.findElement(By.cssSelector("#nav-link-accountList"));
		
		Actions a=new Actions(driver);
		a.moveToElement(move).build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(move).contextClick().build().perform();
//#nav-link-accountList
	}

}
