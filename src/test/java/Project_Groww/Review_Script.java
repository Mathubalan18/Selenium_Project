package Project_Groww;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.Base_Test;

public class Review_Script extends Base_Test {
	
	@Test
	public void Add_Review_on_Product() throws Exception {
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl.equals("https://www.automationexercise.com/"), true);
		System.out.println(currentUrl);
		
		driver.findElement(By.xpath("//a[text()=' Products']")).click();
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//h2[@class='title text-center']"));
		Assert.assertEquals(element.getText().equalsIgnoreCase("All Products"), true);
		System.out.println(element.getText());
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[text()='Premium Polo T-Shirts'])[1]//ancestor::div[@class='product-image-wrapper']//descendant::a[text()='View Product']")).click();
		
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Write Your Review']"));
		Assert.assertEquals(element2.getText().equalsIgnoreCase("Write Your Review"), true);
		System.out.println(element2.getText());
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Tom Shelby");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tomshelby18@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='review']")).sendKeys("Good shopping experience. The product details and ordering process were easy to use. The application was simple to navigate");
        
		driver.findElement(By.xpath("//button[@id='button-review']")).click();
		
		WebElement element3 = driver.findElement(By.xpath("//span[text()='Thank you for your review.']"));
		Assert.assertEquals(element3.getText().equalsIgnoreCase("Thank you for your review."), true);
		System.out.println(element3.getText());
		
		
	}

}
