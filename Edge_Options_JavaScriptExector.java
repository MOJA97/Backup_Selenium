package org.SeleniumIPT.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.RevisionSE.JavaScript_Executor;

public class Edge_Options_JavaScriptExector {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Medge_Driver\\msedgedriver.exe");
		
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("InPrivate");
		
		WebDriver driver = new EdgeDriver(opt);
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement bt = driver.findElement(By.xpath("//h2[.='Bluetooth Calling Smartwatch starts at ₹1,999']"));
		js.executeScript("arguments[0].scrollIntoView()",bt);
		WebElement btBuy = driver.findElement(By.xpath("//a[.='Shop Now']"));
		js.executeScript("arguments[0].click()", btBuy);
		
		WebElement mobiles = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		js.executeScript("arguments[0].value='Iphone 13'", mobiles );
		
		WebElement searchBTN = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		js.executeScript("arguments[0].click()", searchBTN);
		
		WebElement Logo = driver.findElement(By.xpath("//a[@aria-label='Amazon.in']"));
		js.executeScript("arguments[0].click()", Logo );
		
		
		WebElement color = driver.findElement(By.xpath("//input[@type='text']"));
		js.executeScript("arguments[0].value='Mama earth bye bye dark circle'", color);
		js.executeScript("arguments[0].setAttribute('style','color:Purple')", color);
		
	

		
		
		
		
		
		
		
		
	}

}
