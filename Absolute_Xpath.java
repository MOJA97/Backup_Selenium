package org.SeleniumIPT.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Absolute_Xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Medge_Driver\\msedgedriver.exe");
		
		
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("InPrivate");
		WebDriver driver = new EdgeDriver(opt);
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		
		WebElement cart = driver.findElement(By.xpath("//html//body/div/header/div/div/div[3]/div/a[4]"));
		cart.click();
		
		
		
		
		
		
	}

}
