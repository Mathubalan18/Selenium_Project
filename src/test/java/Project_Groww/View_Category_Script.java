package Project_Groww;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.Base_Test;

public class View_Category_Script extends Base_Test {
	
	@Test
	public void View_Category_Product() {
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl.equals("https://www.automationexercise.com/"), true);
		System.out.println(currentUrl);
		
		WebElement element = driver.findElement(By.xpath("//h2[text()='Category']"));
		Assert.assertEquals(element.getText().equalsIgnoreCase("Category"), true);
		System.out.println(element.getText());
		
		driver.findElement(By.xpath("(//span[@class=\"badge pull-right\"])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Jeans ']")).click();
		
		WebElement element2 = driver.findElement(By.xpath("(//span[@class='google-anno-t'])[1]"));
		Assert.assertEquals(element2.getText().equalsIgnoreCase("Men"), true);
		System.out.println(element2.getText());
		
		driver.findElement(By.xpath("(//span[@class='badge pull-right'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Dress '])[1]")).click();
		
		
		
		
		
		
	}

}
