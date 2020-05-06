package task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Forbs_task {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.forbes.com/");
		System.out.println("the current title is " + driver.getTitle());

		// step:1

		// comparing the title
		if (driver.getTitle().equals("Forbes")) {
			System.out.println(driver.getTitle());
			System.out.println("test passed at step1 by comparing title ");

		} else {
			System.out.println("title mismatch");
		}
		// comparing the url
		if (driver.getCurrentUrl().equals("https://www.forbes.com/")) {
			System.out.println(driver.getCurrentUrl());
			System.out.println("test passed at step1 by comparing url ");
		} else {
			System.out.println("the current url is not matched ");
		}
		System.out.println("the current url is " + driver.getCurrentUrl());
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://screenshotSTEP1.png"));
//////////////////////////////////////////////////////////////////////////////////////
		// step:2

		WebElement add = driver.findElement(By.id("top"));
		if (add.isDisplayed()) {
			System.out.println("add is displayed");
			System.out.println("test passed at step2 and add is displayed ");

		} else {
			System.out.println("add is not displayed");
		}
		File src2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("D://screenshotSTEP2.png"));
///////////////////////////////////////////////////////////////////////////
		// step:3
		// click on billionaires list menu and confirm it with title an dother two
		// elements
		WebElement Billionaires = driver.findElement(By.linkText("Billionaires"));
		Billionaires.click();
		System.out.println("the tile after clicking Billionaires meanu is " + driver.getTitle());
		// conforming the title
		if (driver.getTitle().contains("Billionaires")) {
			System.out.println(driver.getTitle());
			System.out.println("test passed at step3 by confirming title ");
		} else {
			System.out.println("the tile of the page is not conformed by title ");
		}
		// conforming the title by url
		if (driver.getCurrentUrl().contains("billionaires")) {
			System.out.println(driver.getCurrentUrl());
			System.out.println("test passed at step3 by confirming url");
		} else {
			System.out.println("the tile of the page is not conformed by title ");
		}
		// taking the screenshot at 3rd step
		File src3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src3, new File("D://screenshotSTEP3.png"));

		////////////////////////////////////////////////////////////////////////////////////

		// step:4 is repetition of step 2
		////////////////////////////////////////////////////////////
		// step:5
		// click on advisor menu item and click on it
		WebElement advisor_menu = driver.findElement(By.linkText("Advisor"));
		advisor_menu.click();
		// conforming the title by url
		if (driver.getCurrentUrl().contains("advisor")) {
			System.out.println(driver.getCurrentUrl());
			System.out.println("test passed at step5 by confirming url ");
		} else {
			System.out.println("the tile of the page is not conformed by title ");
		}
		// conforming the title
		if (driver.getTitle().contains("Advisor")) {
			System.out.println(driver.getTitle());
			System.out.println("test passed at step5 by confirming title ");
		} else {
			System.out.println("the tile of the page is not conformed by title ");
		}
// taking the screenshot at step 5
		File src5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src5, new File("D://screenshotSTEP5.png"));
	////////////////////////////////////////////////////////////////////
		
		//step:6
		//"check weather the advisor lable and sublable is diplaying or not"
		if(driver.findElement(By.linkText("Advisor")).isDisplayed())
			{
			System.out.println(driver.findElement(By.linkText("Advisor")).getText());
			System.out.println("test passed at step6 as 'advisor' lable is dispalyed ");
		
			}
		else
		{
			System.out.println("test failed at step6 as 'advisor' lable is not dispalyed ");
		}
	Actions label=new Actions(driver);
	label.moveToElement(driver.findElement(By.linkText("Advisor"))).build().perform();
	}

}
