package multiple_windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Gmail {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src//Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		String current_window=driver.getTitle();
		
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("Create your Google Account"))
				
		{
			System.out.println("test passed");
		} else
		{
System.out.println("test failed");
		}

		//driver.findElement(By.xpath("//ul[@class='h-c-header__cta-list header__nav--ltr']//a[contains(@class,'h-c-header__nav-li-link')][contains(text(),'Sign in')]"));
		driver.findElement(By.linkText("Help")).click();
		Set<String> se = driver.getWindowHandles(); // this command takes all the window handels and store in se 
		Iterator<String>it=se.iterator();// applying iterator to the window handel

		String parent=it.next();

		while(!parent.equals(current_window))
			
		{
			String child=it.next();
			Thread.sleep(5000);
			driver.switchTo().window(parent);
			
		
				System.out.println(driver.getTitle());
				break;

		}
		

	System.out.println(driver.getTitle());
			       
		
	}

}
