package autoPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--blink-settings=imagesEnabled=false");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://flipkart.com");
		
		driver.findElement(By.name("q")).sendKeys("I Phone");
		Thread.sleep(5000);
		List<WebElement> mulEle=driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
		for(WebElement ele:mulEle) {
			System.out.println("items are "+ele.getText());
		}
	}

}
