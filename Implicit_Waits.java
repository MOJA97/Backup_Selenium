package org.SeleniumIPT.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_Waits {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Medge_Driver\\msedgedriver.exe");
		
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("InPrivate");
		
		WebDriver driver = new EdgeDriver(opt);
		
		driver.get("https://www.netflix.com/in/login");
		
		driver.manage().window().maximize();
		
		//Implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement login = driver.findElement(By.xpath("//input[@name='userLoginId']"));
		login.sendKeys("itsmemojaved@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("MOJA98767>");
		
		
		
		
		
		
		
	}

}
