package autoPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option=new ChromeOptions();
		option.setBrowserVersion("115");
		option.addArguments("headless");
		option.addArguments("-blinksettings=imagesEnabled=false");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());

	}

}
