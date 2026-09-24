package Project_Groww;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.Base_Test;

public class Verify_Product_Quantity_In_Cart extends Base_Test {
	
	@Test
	public void Increase_Product_Quantity() throws InterruptedException {
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl.equals("https://www.automationexercise.com/"), true);
		System.out.println(currentUrl);
		
		driver.findElement(By.xpath("//a[text()=' Products']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[text()='Green Side Placket Detail T-Shirt'])[1]//ancestor::div[@class='product-image-wrapper']//descendant::a[text()='View Product']")).click();
		
		WebElement element = driver.findElement(By.xpath("//h2[text()='Green Side Placket Detail ']"));
		Assert.assertEquals(element.getText().equalsIgnoreCase("Green Side Placket Detail"), true);
		System.out.println(element.getText());
		
		driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("4");
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//u[text()='View Cart']")).click();
		
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Green Side Placket Detail T-Shirt']"));
		Assert.assertEquals(element2.getText().equalsIgnoreCase("Green Side Placket Detail T-Shirt"), true);
		System.out.println("Product Name:"+element2.getText());
		
		WebElement element3 = driver.findElement(By.xpath("//button[text()='4']"));
		Assert.assertEquals(element3.getText().equalsIgnoreCase("4"), true);
		System.out.println("Product Quantity:"+element3.getText());
		
	}

}
