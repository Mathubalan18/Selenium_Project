package Project_Groww;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.Base_Test;

public class Cart_Script extends Base_Test {

	
	@Test
	public void Add_To_Cart() throws Exception {
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl.equals("https://www.automationexercise.com/"), true);
		System.out.println(currentUrl);
		
		driver.findElement(By.xpath("//a[text()=' Products']")).click();
		
	
		driver.findElement(By.xpath("((//p[text()='Little Girls Mr. Panda Shirt'])[1]//ancestor::div[@class='product-image-wrapper']//descendant::a[text()='Add to cart'])[1]")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("((//p[text()='Cotton Silk Hand Block Print Saree'])[1]//ancestor::div[@class='product-image-wrapper']//descendant::a[text()='Add to cart'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
        
        driver.findElement(By.xpath("//a[text()=' Cart']")).click();
        
        WebElement element2 = driver.findElement(By.xpath("//a[text()='Little Girls Mr. Panda Shirt']"));
        Assert.assertEquals(element2.getText().equalsIgnoreCase("Little Girls Mr. Panda Shirt"), true);
        System.out.println("Product 1:"+element2.getText());
        
        WebElement element3 = driver.findElement(By.xpath("//a[text()='Cotton Silk Hand Block Print Saree']"));
        Assert.assertEquals(element3.getText().equalsIgnoreCase("Cotton Silk Hand Block Print Saree"), true);
        System.out.println("Product 2"+element3.getText());
        
        
		
	}
}
