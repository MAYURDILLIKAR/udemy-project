package Calender_UI;

import java.awt.List;
import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip_Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getTitle());

		WebElement Derarture = driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]"));
		Derarture.click();
		//month :-

	//	while (!driver.findElement(By.xpath("//div[contains(text(),'May 2020')]")).getText().contains("May 2020")) 
		{
		//	driver.findElement(By.cssSelector("body.desktop:nth-child(2) div.bgGradient div.minContainer div.widgetSection.appendBottom40 div.fsw.widgetOpen div.fsw_inner:nth-child(1) div.fsw_inputBox.dates.inactiveWidget.activeWidget:nth-child(4) div.datePickerContainer:nth-child(2) div.flightCalOverlay div.dayPickerFlightWrap div.RangeExample.oneWay div.DayPicker div.DayPicker-wrapper div.DayPicker-NavBar > span.DayPicker-NavButton.DayPicker-NavButton--next:nth-child(2)")).click();
		}
			
			
		
		java.util.List<WebElement> dates = driver.findElements(By.className("DayPicker-Day"));
		int count = dates.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			 String text=driver.findElements(By.className("DayPicker-Day")).get(i).getText();
			 if (text.equalsIgnoreCase("30"))
			 {
				 driver.findElements(By.className("DayPicker-Day")).get(i).click();
		
			 }
			
		}
		

	}

}
