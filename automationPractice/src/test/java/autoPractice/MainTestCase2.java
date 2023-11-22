package autoPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MainTestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
//		driver.get("https://google.com");
//		driver.findElement(By.name("q")).sendKeys("Java Tuotiral");
//		Thread.sleep(3000);
//		List<WebElement> eles=driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
//	System.out.println(eles.size());
//		for(WebElement ele:eles) {
//		String value=ele.getText();
//		System.out.println(value);		
//		if(value.contains("oracle")) {
//			ele.click();
//			break;
//		}
		
//		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
//		
//		boolean flag=driver.findElement(By.id("isAgeSelected")).isSelected();
//		if(!flag) {
//			driver.findElement(By.id("isAgeSelected")).click();
//		}
//		
//		boolean flag1=driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).isEnabled();
//		System.out.println(flag1);
		
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		Select sel=new Select(driver.findElement(By.id("select-demo")));
		sel.selectByValue("Thursday");
		
		Select mulSel=new Select(driver.findElement(By.id("multi-select")));
		if(mulSel.isMultiple()) {
			mulSel.selectByIndex(0);
			mulSel.selectByValue("New York");
			mulSel.selectByVisibleText("Texas");
		}
		
		List<WebElement> mulEle=mulSel.getAllSelectedOptions();
		System.out.println(mulEle.size());
		mulSel.deselectByIndex(4);
		System.out.println(mulEle.get(1).getText());
		
		
	}
	

}
