package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverQ5 extends BaseDriverQ4 {

	@Test(priority = 0)
	public void startUrl() {
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void hoverTest() throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		WebElement autoandbikes = driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]"));
		WebElement motorcyclegear = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]"));
		WebElement helmet = driver.findElement(By.xpath("//span[contains(text(),'Cable & Converter')]"));
		
		action.moveToElement(autoandbikes).perform();
		Thread.sleep(5000);
		
		action.moveToElement(motorcyclegear).perform();
		Thread.sleep(5000);
		
		action.moveToElement(helmet).perform();
		Thread.sleep(5000);
		
		helmet.click();
		Thread.sleep(5000);
		
		
	
	
}
