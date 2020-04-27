package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());

		// applying implicite wait .
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// 1. select any checkbox
		driver.findElement(By.id("checkBoxOption2")).click();
		WebElement grabedText = driver.findElement(By.xpath("//div[@id='checkbox-example']//label[2]"));
		String text = grabedText.getText();
		System.out.println("the text is " + grabedText.getText());

		// select the text grabbed in the dropdown.
		Select Dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		Dropdown.selectByVisibleText(text);
		// entering the grabbed text in the edit box
		WebElement name = driver.findElement(By.id("name"));
		name.click();
		name.sendKeys(text);
		WebElement alert1 = driver.findElement(By.id("alertbtn"));
		alert1.click();
		System.out.println("the text present at alert box is " + driver.switchTo().alert().getText());

		// grabbing the alert text and storing the value in a string.
		String alert_message = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();

		// applying a if else loop to check if the text grabbed from the check box is
		// pressent in the alert message or not.
		if (alert_message.contains(text)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");

		}

	}

}
