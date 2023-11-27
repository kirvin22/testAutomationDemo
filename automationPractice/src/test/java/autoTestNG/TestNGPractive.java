package autoTestNG;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGPractive {
	WebDriver driver;
	@BeforeTest
	public void LaunchBrowser() {
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test(dependsOnMethods= "test4")
	public void test1() {
		driver.get("https://google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Hello Java");		
		
	}
	@Test(alwaysRun=true,dependsOnMethods="test4")
	public void test2() {
		driver.get("https://google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Hello Selenium");		
		
	}
	@Test(priority=1,enabled=true)
	public void test3() {
		driver.get("https://google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Hello testNg");	
		SoftAssert as=new SoftAssert();
		as.assertTrue(true);
		as.assertAll();
		
	}
	@Test
	public void test4() {
		driver.get("https://google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Hello Cucumber");		
		Assert.assertFalse(true);
	}

}
