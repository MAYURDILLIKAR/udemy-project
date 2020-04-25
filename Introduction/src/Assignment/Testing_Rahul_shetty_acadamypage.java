package Assignment;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

public class Testing_Rahul_shetty_acadamypage {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY", "true");

		System.setProperty("webdriver.chrome.driver", "src//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/index");
		driver.manage().window().maximize();
		// appliying implicit wait for the test
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// clicking on practice projects on main page
		driver.findElement(By.linkText("Practice Projects")).click();
		// entering the details
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("Mayur Dillikar");
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("mayurdillikar@gmail.com");
		driver.findElement(By.id("form-submit")).click();
		// clicking on automation test practice on second page.
		driver.findElement(By.linkText("Automation Practise - 2")).click();
		// finding out no of links on the web page.
		System.out.println(
				"the size of links on the automation practicepage-2 is " + driver.findElements(By.tagName("a")).size());
//radio button 
		// clicking first radio button

		driver.findElement(By.cssSelector("input[value='radio1']")).click();

		// clicking second radio button
		driver.findElement(By.cssSelector("input[value='radio2']")).click();

		// clicking third radio button;
		driver.findElement(By.cssSelector("input[value='radio3']")).click();
		// entering the name of the country
		WebElement country = driver.findElement(By.id("autocomplete"));
		country.click();
		country.sendKeys("india");
		country.sendKeys(Keys.ARROW_DOWN.ARROW_DOWN.ENTER);

		// dropdown example , appling select method .
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByValue("option1");

		dropdown.selectByValue("option2");

		dropdown.selectByIndex(3);

		// ckecking checkboxes

		driver.findElement(By.id("checkBoxOption1")).click();

		driver.findElement(By.id("checkBoxOption2")).click();

		driver.findElement(By.id("checkBoxOption3")).click();
		driver.findElement(By.id("openwindow")).click();
		String currentwindow = driver.getTitle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		String parent = iterator.next();
		System.out.println(driver.getCurrentUrl());

		while (!parent.contains(currentwindow))
		{

			driver.switchTo().window(parent);
			String child = iterator.next();

			System.out.println(driver.getCurrentUrl());
			driver.switchTo().window(child).close();
			System.out.println("test passed");
			break;

		}
// opening a tab 
		driver.findElement(By.xpath("//a[@id='opentab']")).click();

		String currentwindow1 = driver.getWindowHandle();
		Set<String> tab = driver.getWindowHandles();
		Iterator<String> iter = tab.iterator();

		// parent tab
		String par = iter.next();
		driver.switchTo().window(par);
		System.out.println("the title of parent is" + driver.getTitle());

		// child tab
		String child_tab = iter.next();
		driver.switchTo().window(child_tab);
		System.out.println("the title of parent is" + driver.getTitle());
		driver.switchTo().window(child_tab).close();
		driver.switchTo().window(currentwindow);

		// alert box
		WebElement alert_box = driver.findElement(By.xpath("//input[@id='name']"));
		alert_box.click();
		alert_box.sendKeys("mayur");
		Thread.sleep(1000);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(1000);

		driver.switchTo().alert().dismiss();			
// size of links on the footer page.
		WebElement footer_links=driver.findElement(By.id("gf-BIG"));
System.out.println( "the size of links in the footer section is " + footer_links.findElements(By.tagName("a")).size());
}

}
