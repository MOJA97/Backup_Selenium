package org.SeleniumIPT.com;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Medge_Driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		WebElement single = driver.findElement(By.xpath("//select[@class='col-lg-3']"));
		single.click();
		
		Select s = new Select(single);
		s.selectByValue("Google");
		boolean multiple = s.isMultiple();
		System.out.println("is multiple or not: " +multiple);
		
		WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
		animals.click();
		
		Select s1 = new Select(animals);
		s1.selectByVisibleText("Avatar");
		
		List<WebElement> options = s1.getOptions();

		for (WebElement webElement : options) {
			
			System.out.println(webElement.getText());
			
		}
		
		System.out.println("******************************************************************************");
		
		
		WebElement multiples = driver.findElement(By.xpath("//select[@id='second']"));
		multiples.click();
		
		Select s3 = new Select(multiples);
		s3.selectByVisibleText("Pizza");
		s3.selectByValue("pizza");
		
		
		List<WebElement> allSelectedOptions = s3.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Screenshot/dropdowns.png");
		FileUtils.copyFile(src, dest);
		
	}

}
