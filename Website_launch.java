package org.SeleniumIPT.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Website_launch {
	
	public static WebDriver driver;
	
	
	public static void takesScreenshot(WebDriver driver, String path) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Medge_Driver\\msedgedriver.exe");
		
	
	driver = new EdgeDriver();
		
		driver.get("https://www.netflix.com/in/login");
		
		System.out.println("URL launched");
		
		driver.manage().window().maximize();
		System.out.println("url maximized");
		
		String title = driver.getTitle();
		System.out.println("The title is "+ title );
		
		String currentUrl = driver.getCurrentUrl();
		System.err.println(currentUrl);
		
		driver.navigate().refresh();
		
		WebElement signin = driver.findElement(By.id("id_userLoginId"));
		signin.sendKeys("Itsmemojaved@gmail.com");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("MOJAVED123.");
		boolean enabled = password.isEnabled();
		System.out.println(enabled);
		
		WebElement signinBTN = driver.findElement(By.xpath("//button[@data-uia='login-submit-button']"));
		signinBTN.click();
		
		boolean displayed = signinBTN.isDisplayed();
		System.out.println(displayed);
		
		boolean selected = signinBTN.isSelected();
		System.out.println(selected);

		Thread.sleep(3000);
		
		takesScreenshot(driver, "C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Screenshot/LaunchSample.png");
		
		
		
		
	}

}
