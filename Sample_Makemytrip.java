package org.SeleniumIPT.com;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample_Makemytrip {
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\src\\org\\SeleniumIPT\\com\\Chrome_Driver\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("Incognito");
		
		WebDriver driver = new ChromeDriver(opt);

		driver.get("https://www.makemytrip.com/");
		

		driver.manage().window().maximize();

		Thread.sleep(3000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='webengage-engagement-callback-frame']"));
		driver.switchTo().frame(frame).close();
		

	}

}
