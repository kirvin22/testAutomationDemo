package autoPractice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.opencart.com");
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		//ac.contextClick(driver.findElement(By.name("search"))).build().perform();
		Thread.sleep(2000);
		WebElement tar=driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[3]"));
		ac.moveToElement(tar).perform();
		Thread.sleep(2000);

		WebElement tar2=driver.findElement(By.partialLinkText("Monitors"));
		ac.click(tar2).perform();
		Thread.sleep(2000);
		ac.scrollToElement(driver.findElement(By.partialLinkText("Apple Cinema"))).build().perform();
		Thread.sleep(2000);
		
		TakesScreenshot screen= (TakesScreenshot)driver; 
		File src=screen.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".png";
		FileUtils.copyFile(src, new File(path));
		String path2=System.getProperty("user.dir")+"/screenshot/"+System.currentTimeMillis()+".png";
		File src1=driver.findElement(By.partialLinkText("Apple Cinema")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File(path2));
		String pathC="C:\\Users\\Administrator\\git\\testAutomationDemo\\automationPractice\\screenshots\\1700661168722.png";
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(pathC);
		driver.findElement(By.xpath("(//button[@class='btn btn-primary start'])[2]")).click();
		
	}

}
