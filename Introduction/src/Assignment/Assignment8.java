package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		WebElement id =driver.findElement(By.id("autocomplete"));
		id.click();
		id.sendKeys("united");
		Thread.sleep(2000);
		id.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		id.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		id.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		System.out.println("the text is " + id.getText());
		//Javascript DOM can extract hidden elements
		//because selenium cannot identify hidden elements - (Ajax implementation)
		//investigate the properties of object if it have any hidden text
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script="return document.getElementById(\"autocomplete\").value;";
		String text=  (String) js.executeScript(script);
		System.out.println(text);
	}

}
