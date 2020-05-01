package wallethub.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Wallethub_creditcardpage
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wallethub.com/");
		System.out.println(driver.getTitle());

		WebElement creditcard_link = driver.findElement(By.linkText("Credit Cards"));
		System.out.println(creditcard_link.getText());
		String fount_size= creditcard_link.getCssValue("font-size");
		System.out.println("the header fount size is"+ creditcard_link);
		//creditcard_link.click();
		//WebElement move=driver.findElement(By.linkText("Credit Cards"));
		System.out.println("the background colour is "+ creditcard_link.getCssValue("background-color"));

		Actions a=new Actions(driver);
		a.moveToElement(creditcard_link).build().perform();
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//a.moveToElement(move).contextClick().build().perform();

	}

}
