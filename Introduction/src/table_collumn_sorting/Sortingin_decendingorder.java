package table_collumn_sorting;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sortingin_decendingorder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		System.out.println(driver.findElement(By.cssSelector("tr th:nth-child(2)")).getText());
		List<WebElement> table_data = driver.findElements(By.cssSelector("tbody tr td:nth-child(2)"));
		ArrayList<String>original_list=new ArrayList<String>();
		for(int i=0;i<table_data.size();i++)
		{
			original_list.add(table_data.get(i).getText());
			System.out.println(original_list);
	
		}
		ArrayList<String>copylist=new ArrayList<String>();
		for(int i=0;i<table_data.size();i++)
		{
		copylist.add(original_list.get(i));
		}
		// to arrange in assending order 
		Collections.sort(copylist);
		System.out.println("list in assending order is");
		System.out.println(copylist);
		
		// to arrange in desending order 
		Collections.reverse(copylist);
		System.out.println("list in desending order is");
		System.out.println(copylist);		
		Assert.assertTrue(original_list.equals(copylist));
		// take screenshot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File( "D://screenhots1.png"));
	}
	

}
