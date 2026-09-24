package Project_Groww;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.Base_Test;

public class Verify_All_Product extends Base_Test {
	
	@Test
	public void VerifyAllProduct() {
		
		driver.findElement(By.xpath("//a[text()=' Products']")).click();
		WebElement text = driver.findElement(By.xpath("//h2[text()='All Products']"));
		Assert.assertEquals(text.getText().equalsIgnoreCase("All Products"), true);
		System.out.println(text.getText());
		
		driver.findElement(By.xpath("(//p[text()='Blue Top'])[1]//ancestor::div[@class='product-image-wrapper']//descendant::a[text()='View Product']")).click();
		
		WebElement text2 = driver.findElement(By.xpath("//h2[text()='Blue Top']"));
		Assert.assertEquals(text2.getText().equalsIgnoreCase("Blue Top"), true);
		System.out.println(text2.getText());
		
		WebElement text3 = driver.findElement(By.xpath("//span[text()='Rs. 500']"));
		Assert.assertEquals(text3.getText().equalsIgnoreCase("Rs. 500"), true);
		System.out.println("Price:"+text3.getText());
		
		WebElement text4 = driver.findElement(By.xpath("//p[text()=' In Stock']"));
		Assert.assertEquals(text4.getText().equalsIgnoreCase(" In Stock"), true);
		System.out.println("Availability:"+text4.getText());
		
		WebElement text5 = driver.findElement(By.xpath("//p[text()=' Polo']"));
		Assert.assertEquals(text5.getText().equalsIgnoreCase("Polo"), true);
		System.out.println(text5.getText());
		
		
		
		
		
	    
	}

}
