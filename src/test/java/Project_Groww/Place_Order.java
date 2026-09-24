package Project_Groww;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.Base_Test;

public class Place_Order extends Base_Test {
	
	@Test
	public void Place_Order_Script() throws InterruptedException {
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl.equals("https://www.automationexercise.com/"), true);
		System.out.println(currentUrl);
		
		driver.findElement(By.xpath("//a[text()=' Products']")).click();
       		
		driver.findElement(By.xpath("(//p[text()='Rose Pink Embroidered Maxi Dress'])[1]//ancestor::div[@class='product-image-wrapper']//descendant::a[text()='View Product']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();
		
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Rose Pink Embroidered Maxi Dress']"));
		Assert.assertEquals(element.getText().equalsIgnoreCase("Rose Pink Embroidered Maxi Dress"), true);
		System.out.println(element.getText());
		
		driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();
		
		driver.findElement(By.xpath("//u[text()='Register / Login']")).click();
		
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("tomshelby18@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("tomshelby18");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		
		//driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();
		
		
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Test order - Please handle the items carefully.");
		
		driver.findElement(By.xpath("//a[text()='Place Order']")).click();
		
		WebElement element2 = driver.findElement(By.xpath("//h2[text()='Payment']"));
		Assert.assertEquals(element2.getText().equalsIgnoreCase("Payment"), true);
		System.out.println(element2.getText());
		
		driver.findElement(By.xpath("//input[@name='name_on_card']")).sendKeys("Test User");
		driver.findElement(By.xpath("//input[@data-qa='card-number']")).sendKeys("141414141414114");
		driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='expiry_month']")).sendKeys("12");
		driver.findElement(By.xpath("//input[@name='expiry_year']")).sendKeys("30");
		
		driver.findElement(By.xpath("//button[text()='Pay and Confirm Order']")).click();
		
		WebElement element3 = driver.findElement(By.xpath("//p[text()='Congratulations! Your order has been confirmed!']"));
		Assert.assertEquals(element3.getText().equalsIgnoreCase("Congratulations! Your order has been confirmed!"), true);
		System.out.println(element3.getText());
		
		driver.findElement(By.xpath("//a[text()='Download Invoice']")).click();
		
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		
	}

}
