package Project_Groww;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.Base_Test;

public class Search_Product extends Base_Test {
	
	@Test
	public void SearchProduct() {
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl.equals("https://www.automationexercise.com/"), true);
		System.out.println(currentUrl);
		
		driver.findElement(By.xpath("//a[text()=' Products']")).click();
		
		WebElement text = driver.findElement(By.xpath("//h2[text()='All Products']"));
		Assert.assertEquals(text.getText().equalsIgnoreCase("All Products"), true);
		System.out.println(text.getText());
		
		driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("JEANS");
		
		driver.findElement(By.xpath("//button[@id='submit_search']")).click();
		
		WebElement text2 = driver.findElement(By.xpath("//h2[text()='Searched Products']"));
		Assert.assertEquals(text2.getText().equalsIgnoreCase("Searched Products"), true);
		System.out.println(text2.getText());
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='productinfo text-center']"));
		for (WebElement allproduct : elements) {
			
			System.out.println(allproduct.getText());
			
		}
	}

}
