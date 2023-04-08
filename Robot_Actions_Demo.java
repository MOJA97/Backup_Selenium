package org.SeleniumIPT.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class Robot_Actions_Demo {
	
	
	public static void main(String[] args) throws AWTException {
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Medge_Driver\\msedgedriver.exe");
		
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("InPrivate");
		
		WebDriver driver = new EdgeDriver(opt);
		
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement miniTV = driver.findElement(By.xpath("//a[.='Amazon miniTV']"));
		 Actions a = new Actions(driver);
		
		 a.contextClick(miniTV).build().perform();
		 press();
		 enter();
		 
		
	}
	public static void press() throws AWTException {

		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	public static void enter() throws AWTException {
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
