package org.SeleniumIPT.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Medge_Driver\\msedgedriver.exe");
		
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("InPrivate");
		
		WebDriver driver = new EdgeDriver(opt);
		
		driver.get("https://demoqa.com/droppable/");
		
		driver.manage().window().maximize();
		
		WebElement letterS = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement DropS = driver.findElement(By.xpath("//p[.='Drop here']"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(letterS,DropS ).perform();
		
	}

}
