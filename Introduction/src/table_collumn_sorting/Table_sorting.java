package table_collumn_sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Table_sorting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// maximise the window
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		List<WebElement> table = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList<String> originallist = new ArrayList<String>();
		for (int i = 0; i < table.size(); i++) {
			System.out.println(table.get(i).getText());

			originallist.add(table.get(i).getText());

		}

		ArrayList<String> copylist = new ArrayList<String>();
		for (int i = 0; i < originallist.size(); i++) {
			copylist.add(originallist.get(i));
		}
		java.util.Collections.sort(copylist);
		System.out.println("the sorted list is " + copylist);

		
		System.out.println("the table is sorted");
		}
		
	}


