package org.SeleniumIPT.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Medge_Driver\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		amazon_MiniTV();
		press();
		enter();
		
//		mobiles();
//		press();
//		enter();
//		
//		electronics();
//		press();
//		enter();
//		
//		fashion();
//		press();
//		enter();

//		multiple_Windowhandles();
		single_Window_handle();
	}
	
	public static void amazon_MiniTV() {

		WebElement amazonminiTV = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		Actions a = new Actions(driver);
		a.contextClick(amazonminiTV).build().perform();
				
	}
	
	public static void mobiles() {

		WebElement mobiles = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
		Actions a = new Actions(driver);
		a.contextClick(mobiles).build().perform();
	}
	
	public static void electronics() {

		WebElement electronics = driver.findElement(By.xpath("//div[@id='nav-xshop']//child::a[text()=' Electronics ']"));
		Actions a = new Actions(driver);
		a.contextClick(electronics).build().perform();
		
		
	}
	
	public static void fashion() {

		WebElement fashion = driver.findElement(By.xpath("//a[text()='New Releases']//following-sibling::a[contains(text(),'Fashion')]"));
		Actions a = new Actions(driver);
		a.contextClick(fashion).build().perform();
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
	
	public static void single_Window_handle() {

		String parent_id = driver.getWindowHandle();
		System.out.println(parent_id);
		//Unique Id and it doesnt allow duplicate value
		Set<String> all_id = driver.getWindowHandles();
		System.out.println(all_id);
		System.out.println(driver.getTitle());
		
		for (String ID : all_id) {
			if (ID.equals(parent_id)) {
				continue;
			}
			else {
				driver.switchTo().window(ID);
				System.out.println(driver.getCurrentUrl());
			}
		}
	}
	
	
	public static void multiple_Windowhandles() {
		
		String elementUrl = "https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics";
	

		Set<String> all_ID = driver.getWindowHandles();
		
		for (String Id : all_ID) {
			
			if (driver.switchTo().window(Id).getCurrentUrl().equalsIgnoreCase(elementUrl)) {
			break;	
			}

			
		}
		driver.get(elementUrl);
		WebElement headphones = driver.findElement(By.xpath("//div[@class='sl-sobe-carousel-sub-card-footer']//child::span[text()='Headphones']"));
		headphones.click();

	}

}
	


