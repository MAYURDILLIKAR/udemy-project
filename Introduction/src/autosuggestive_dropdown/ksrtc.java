package autosuggestive_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ksrtc {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// applying all the webelement concepts
		
		System.setProperty("webdriver.chrome.driver", "src//Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		System.out.println(driver.getTitle());
		WebElement message= driver.findElement(By.id("exampleModalLongTitle"));
		System.out.println("the text present is " +message.getText());
		System.out.println("the location is " + message.getLocation());
		System.out.println(message.isDisplayed()); 
		System.out.println(message.getSize()); 
		
		// lcose the message
		driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
		
	}

}
