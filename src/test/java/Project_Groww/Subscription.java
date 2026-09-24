package Project_Groww;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.Base_Test;

public class Subscription extends Base_Test {
	
	@Test
	public void Subscription_Script() {
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl.equals("https://www.automationexercise.com/"), true);
		System.out.println(currentUrl);
		
		WebElement element = driver.findElement(By.xpath("//h2[text()='Subscription']"));
		
		Actions action = new Actions(driver);
		
		action.scrollToElement(element).perform();
		
		WebElement element2 = driver.findElement(By.xpath("//h2[text()='Subscription']"));
		Assert.assertEquals(element2.getText().equalsIgnoreCase("Subscription"), true);
		System.out.println(element2.getText());
		
		driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("tomshelby18@gmail.com");
		driver.findElement(By.xpath("//button[@id='subscribe']")).click();
		
		WebElement element3 = driver.findElement(By.xpath("//div[text()='You have been successfully subscribed!']"));
		Assert.assertEquals(element3.getText().equalsIgnoreCase("You have been successfully subscribed!"), true);
		System.out.println(element3.getText());
		
		
		
		
	}

}
