package Project_Groww;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.Base_Test;

public class Remove_Cart_Script extends Base_Test {
	
	@Test
	public void Remove_Product_from_Script() throws Exception {
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl.equals("https://www.automationexercise.com/"), true);
		System.out.println(currentUrl);
		
		driver.findElement(By.xpath("//a[text()=' Products']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[text()='Cotton Silk Hand Block Print Saree'])[1]//ancestor::div[@class='col-sm-4']//descendant::a[text()='View Product']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[1]")).click();
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Cotton Silk Hand Block Print Saree']"));
		Assert.assertEquals(element.getText().equalsIgnoreCase("Cotton Silk Hand Block Print Saree"), true);
		System.out.println(element.getText());
		
		driver.findElement(By.xpath("//td[@class='cart_delete']")).click();
		
		WebElement element2 = driver.findElement(By.xpath("//b[text()='Cart is empty!']"));
		Assert.assertEquals(element2.getText().equalsIgnoreCase("Cart is empty! Click here to buy products."), true);
		System.out.println(element2.getText());
	}
	
	

}
