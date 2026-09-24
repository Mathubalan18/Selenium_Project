package Project_Groww;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.Base_Test;

public class Login_Script extends Base_Test {
	
	@Test
	public void Login_Module() {
		
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("tomshelby18@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("tomshelby18");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		

		WebElement text4 = driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
		Assert.assertEquals(text4.getText().equalsIgnoreCase("Logged in as"), true);
		System.out.println(text4.getText());
		
		
	}
		
		
		// LOGOUT SCRIPT
		
		@Test
		public void Logout_module() {

			driver.findElement(By.xpath("//a[text()=' Logout']")).click();
		}
		

}
