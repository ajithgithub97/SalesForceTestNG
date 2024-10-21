package salesforce_application;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SalesForceCreat extends BaseClass {
	
	
@Test	
 public void creatsalesforce() throws InterruptedException { 
	
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	 driver.findElement(By.xpath("//button[text()='View All']")).click();
	 driver.findElement(By.xpath("//p[text()='Sales']")).click();
	WebElement ele = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	 driver.executeScript("arguments[0].click();", ele);
	 driver.findElement(By.xpath("//div[text()='New']")).click();
	 driver.findElement(By.xpath("//label[contains(text(),'Opportunity Name')]/following::input[@class='slds-input']")).sendKeys("Salesforce Automation by Ajith");
	 driver.findElement(By.xpath("//div[@type='text']/input[@name='Amount']")).sendKeys("75000");
	 driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	 driver.findElement(By.xpath("//button[text()='Today']")).click();
	 driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds')]/span[@class='slds-truncate'])[2]")).click();
	 driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	 driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	 String result = driver.findElement(By.xpath("//div[@class='slds-media__body']/h1")).getText();
	if (result.contains("Ajith")) {
		System.out.println("Opportunity created");
	}
	else
		System.out.println("Opportunity not created");
	 

 }
}
