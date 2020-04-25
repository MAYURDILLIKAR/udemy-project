import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_rahul {

	public static void main(String[] args) throws Exception {
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
		driver.findElement(By.xpath("//a[@id='opentab']")).click();

		String currentwindow = driver.getWindowHandle();
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
		WebElement footer_links = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(
				"the size of links in the footer section is " + footer_links.findElements(By.tagName("a")).size());

// size of links in first colllum
		
	WebElement first_Collom_links= footer_links.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
	System.out.println("links in the first column are " + first_Collom_links.findElements(By.tagName("a")).size());

	}
}