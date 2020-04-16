package Assignment;

import java.io.File;
import java.io.InputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.reporters.Files;

public class Assignment2_Cleartrip {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		System.out.println(driver.getTitle());

		System.out.println(
				driver.findElement(By.cssSelector(".banner-section.br4.light-wood-border.mb5.mt5.yellowBg")).getText());
		// select one way radio button

		driver.findElement(By.id("OneWay")).click();
		// from tag enty=ry
		WebElement From_tag = driver.findElement(By.id("FromTag"));
		From_tag.click();
		From_tag.clear();
		From_tag.sendKeys("hyde");
		Thread.sleep(10000);

		From_tag.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		System.out.println(From_tag.getText());

		// To tag

		WebElement To_tag = driver.findElement(By.id("ToTag"));
		To_tag.click();
		To_tag.clear();
		To_tag.sendKeys("Pantnagar");
		Thread.sleep(10000);
		To_tag.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		System.out.println(To_tag.getText());
		// Depart date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();

		// passenger details , Adults and children
		Select Adults = new Select(driver.findElement(By.id("Adults")));
		Adults.selectByVisibleText("5");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("Adults")).getText());

		// childrens
		Select Childrens = new Select(driver.findElement(By.id("Childrens")));
		Childrens.selectByIndex(3);
		Thread.sleep(3000);

		System.out.println(driver.findElement(By.id("Childrens")).getText());

		// click on search button
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println("test passed");
	}

}
