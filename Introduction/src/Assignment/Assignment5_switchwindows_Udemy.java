package Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_switchwindows_Udemy {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		String currentWindow_handel=driver.getTitle();
		System.out.println("the current window handel is" + driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		System.out.println("the second window title is " + driver.getTitle());
// itraation for window handel
		Set<String> al = driver.getWindowHandles();
		Iterator<String> it = al.iterator();
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
		String parent = it.next();
		driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		Thread.sleep(5000);
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());

	}

}
