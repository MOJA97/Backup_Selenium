package org.SeleniumIPT.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import com.RevisionSE.JavaScript_Executor;

public class Dynamic_Xpath {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Medge_Driver\\msedgedriver.exe");

		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("InPrivate");
		WebDriver driver = new EdgeDriver(opt);

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		

		Actions a = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//ancestor
		
		WebElement ancestor = driver.findElement(By.xpath("//a[@id='nav-cart']//ancestor::div[@class='nav-right']"));
		String text = ancestor.getText();
		System.out.println(text);
		
		//descandent
		WebElement descendant = driver.findElement(By.xpath("//div[@id='glow-ingress-block']//descendant::span[@id='glow-ingress-line2']"));
		String tagName = descendant.getTagName();
		System.out.println(tagName);
		
//		//preceding-sibling
		WebElement sell = driver.findElement(By.xpath("//a[text()='Customer Service']//preceding-sibling::a[text()='Sell']"));
		a.contextClick(sell).build().perform();
		press();
		enter();
		
		//following
		WebElement homeKitchen = driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]//following::a[.='Home & Kitchen']"));
		a.contextClick(homeKitchen).build().perform();
		press();
		enter();
		
		//preceding
		
		WebElement release = driver.findElement(By.xpath("//a[.='Amazon Pay']//preceding::a[.='New Releases']"));
		a.contextClick(release).build().perform();
		press();
		enter();
		
		//Following-sibling
		WebElement electronics = driver.findElement(By.xpath("//a[.='Amazon miniTV']//following-sibling::a[text()=' Electronics ']"));
		a.contextClick(electronics).build().perform();
		press();
		enter();
		
		
		//parent
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//parent::div[@class='nav-search-field ']"));
		js.executeScript("arguments[0].value='Iphone'", searchbox);
		
		//child
		WebElement submit = driver.findElement(By.xpath("//span[@id='nav-search-submit-text']//child::input[@type='submit']"));
		submit.click();
		

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
