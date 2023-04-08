package org.SeleniumIPT.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actions_demo {
	
	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Medge_Driver\\msedgedriver.exe");
		
		
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("InPrivate");
		WebDriver driver = new EdgeDriver(opt);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement searchBOX = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		Actions a = new Actions(driver);
		a.click(searchBOX);
		
		WebElement newrelease = driver.findElement(By.xpath("(//a[contains(text(),'New Releases')])[1]"));
		a.doubleClick(newrelease).build().perform();
		
		WebElement contextClick = driver.findElement(By.xpath("//a[text()='Home & Kitchen']"));
		a.contextClick(contextClick).build().perform();
		
		
		
	}

}
