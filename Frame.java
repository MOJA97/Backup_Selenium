package org.SeleniumIPT.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Frame {
	
	
	public static WebDriver driver;
	
	
	
	public static void main(String[] args) {
		//
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Medge_Driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		
//		WebElement single = driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
//		single.click();
		
		
//		driver.switchTo().frame("SingleFrame");
//		
//		WebElement text_single = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//		
//		text_single.sendKeys("MOJA");
		
	
		
		
		
		
	
	

		WebElement multiple = driver.findElement(By.xpath("//a[@href='#Multiple']"));
		multiple.click();
		

		WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outer);
		
		
		
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inner);
		
		
		WebElement text_multiple = driver.findElement(By.xpath("(//input[@type='text'])"));
		text_multiple.sendKeys("MOhammed Javed J");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().defaultContent();
		WebElement video = driver.findElement(By.xpath("//a[text()='Video']"));
		video.click();

		WebElement youtube = driver.findElement(By.xpath("//a[text()='Youtube']"));
		youtube.click();
		
	
	}
	
	

}
