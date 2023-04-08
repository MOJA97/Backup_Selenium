package org.SeleniumIPT.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Web_Tables {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Medge_Driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://qavbox.github.io/demo/webtable/");
		
		driver.manage().window().maximize();
		
		//single Element
		
		WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td[4]"));
		System.out.println(element.getText());
		
		System.out.println("***********************************************************");
		
		//Multiple element
		List<WebElement> elements = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr[3]"));
		for (WebElement webElement : elements) {
			
			System.err.print(webElement.getText());
			
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		List<WebElement> elements2 = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[1]"));
		for (WebElement each: elements2) {
			System.out.println(each.getText());
		}
	}
	
	

}
