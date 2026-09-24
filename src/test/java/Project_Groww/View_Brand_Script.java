package Project_Groww;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.Base_Test;

public class View_Brand_Script extends Base_Test {
	
	@Test
	public void View_Brand_Product() throws Exception {
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl.equals("https://www.automationexercise.com/"), true);
		System.out.println(currentUrl);
		
		WebElement element = driver.findElement(By.xpath("//h2[text()='Brands']"));
		Actions action = new Actions(driver);
		action.scrollToElement(element).perform();
		
		driver.findElement(By.xpath("//a[text()='H&M']")).click();
		
		WebElement element2 = driver.findElement(By.xpath("//h2[text()='Brand - H&M Products']"));
		Assert.assertEquals(element2.getText().equalsIgnoreCase("Brand - H&M Products"), true);
		System.out.println(element2.getText());
				
		}

}
