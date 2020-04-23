package Assignment;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javafx.scene.Parent;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("current url is " + driver.getCurrentUrl());
		System.out.println("current page title is" + driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement fristname = driver.findElement(By.id("u_0_m"));
		WebElement surname = driver.findElement(By.id("u_0_o"));
		WebElement email = driver.findElement(By.id("u_0_r"));
		WebElement reenteremail = driver.findElement(By.xpath("//input[@id='u_0_u']"));
		fristname.click();
		fristname.sendKeys("mayur");
		surname.click();
		surname.sendKeys("dillikar");

		email.click();
		email.sendKeys("mayur1@gmail.com");

		// checking if reenteremail is diplayed or not.

		if (reenteremail.isDisplayed()) {
			System.out.println("element is displayed");
			reenteremail.click();
			reenteremail.sendKeys("mayur1@gmail.com");

		}

		else {
			System.out.println("is not enabled");

		}
		WebElement password = driver.findElement(By.id("u_0_w"));
		password.click();
		password.sendKeys("mayur123456");
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByValue("28");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByIndex(6);
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1992");
		WebElement gender = driver.findElement(By.id("u_0_7"));
		gender.click();
		// explicit wait
		WebDriverWait w =new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("u_0_13"))));
		//driver.findElement(By.id("u_0_13")).click();
		Thread.sleep(10000);
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		String current_windowhandel= driver.getTitle();
		WebElement instagram=driver.findElement(By.linkText("Instagram"));
		instagram.click();
		Set<String>se=driver.getWindowHandles();
		Iterator<String>it=se.iterator();
		Thread.sleep(5000);
		String parent=it.next();
		if (!parent.equals(current_windowhandel)) 
		{
			String child=it.next();
			Thread.sleep(5000);

		}
		else
		{
			parent=it.next();
		}
		
	}
}
