package autoPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		System.out.println("HI");
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		driver.manage().window().maximize();
		String salary=driver.findElement(By.xpath("//td[contains(text(), 'B. Greer')]/following-sibling::td[5]")).getText();
		System.out.println(salary);
		List<WebElement> loc=driver.findElements(By.xpath("//td[contains(text(), 'London')]/preceding-sibling::td[2]"));
		for(WebElement lo : loc) {
			System.out.println(lo.getText());
		}
	}

}
