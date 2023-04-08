package org.SeleniumIPT.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Medge_Driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		System.out.println("Browser and URl Launched");
		
		//Simple Alert
		
		WebElement alert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alert.click();
		
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		
		//Confirm Alert
		
		WebElement alertOKandCancel = driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]"));
		alertOKandCancel.click();
		
		WebElement alert3 = driver.findElement(By.xpath("//button[.='click the button to display a confirm box ']"));
		alert3.click();
		Alert alert4 = driver.switchTo().alert();
		alert4.dismiss();
		
		//prompt alert
		
		WebElement prompt = driver.findElement(By.xpath("//a[starts-with(text(),'Alert with Textbox ')]"));
		prompt.click();
		
		WebElement promptbox = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		promptbox.click();
		Alert alert5 = driver.switchTo().alert();
		alert5.sendKeys("Mohammed Javed J");
		alert5.accept();
		
	
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Screenshot/alerts.png");
		FileUtils.copyFile(src, dest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
