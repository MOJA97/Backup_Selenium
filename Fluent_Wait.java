package org.SeleniumIPT.com;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Wait {
	// MOST IMPORTANT TOPIC FOR INTERVIEW PURPOSE
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Medge_Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.hotstar.com/in");
		driver.manage().window().maximize();
		
		// Fluent wait
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(7)).ignoring(NoSuchElementException.class);
		
		WebElement subscribe = driver.findElement(By.xpath("//span[@class=' text-transparent LOGO_LABEL_TYPOGRAPHY ']"));
		subscribe.click();
		
	}

}
// syntax
// Wait<WebDriver> = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(6).ignoring(NoSuchElementException.class);
// 	UPCASTING												TIMEOUT								CHECKING						IGNORING EXCEPTION